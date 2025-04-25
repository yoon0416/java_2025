## ✅ SSGFC 기능별 로직 및 동작 원리 분석 + 코드 분석

---

### 🔐 로그인 로직
- **경로**: `/user/login` (GET, POST)
- **관련 파일**:
  - `UserController.java`
  - `SecurityConfig.java`
  - `UserDetailsService.java`
  - `CustomUserDetails.java`
  - `UserRepository.java`
- **동작 원리**:
  - 사용자가 로그인 요청
  - Spring Security가 이메일 기반으로 `UserDetailsService`에서 사용자 조회
  - `CustomUserDetails` 객체로 감싸서 Security에 전달
  - 비밀번호 일치 시 세션 생성, 로그인 완료
- **코드 분석**:
```java
// SecurityConfig.java
http.formLogin()
    .loginPage("/user/login")
    .loginProcessingUrl("/user/login")
    .defaultSuccessUrl("/", true);

// UserDetailsService.java
return userRepository.findByEmail(email)
    .map(CustomUserDetails::new)
    .orElseThrow(() -> new UsernameNotFoundException("잘못된 로그인 정보입니다."));
```

---

### 📝 회원가입 로직
- **경로**: `/user/join` (GET, POST)
- **관련 파일**:
  - `UserController.java`
  - `UserService.java`
  - `UserRepository.java`
- **동작 원리**:
  - 회원가입 폼 입력 → 유효성 검사 (`UserForm`)
  - 이메일/닉네임 중복 확인
  - 비밀번호 암호화 후 DB 저장 (`UserService`)
  - 카카오 가입 시 `kakaoId` 추가 저장
- **코드 분석**:
```java
// UserService.java
user.setPwd(passwordEncoder.encode(user.getPwd()));
userRepository.save(user);
```

---

### 👤 마이페이지 수정 로직
- **경로**: `/user/mypage/edit`
- **관련 파일**:
  - `UserController.java`
  - `UserService.java`
  - `mypage.html`
- **동작 원리**:
  - 현재 비밀번호 확인
  - 닉네임/이메일/소개글/프사 수정 가능 (비밀번호는 별도 경로에서 변경)
- **코드 분석**:
```java
// 비밀번호 일치 확인
if (!passwordEncoder.matches(currentPwd, user.getPwd())) {
    throw new IllegalArgumentException("현재 비밀번호가 일치하지 않습니다.");
}

// 닉네임/이메일/소개글/프사 변경
user.setNickName(newNickname);
user.setEmail(newEmail);
user.setIntroduce(introduce);
user.setProfile_img(UtilUpload.saveFile(profileImg));
```

---

### 🔁 비밀번호 변경 로직
- **경로**: `/user/password/change`
- **관련 파일**:
  - `UserController.java`
  - `UserService.java`
- **동작 원리**:
  - 현재 비밀번호 확인 후 새 비밀번호 비교
  - 암호화 후 DB 저장
- **코드 분석**:
```java
if (!passwordEncoder.matches(currentPwd, user.getPwd())) {
    throw new IllegalArgumentException("비밀번호 불일치");
}
user.setPwd(passwordEncoder.encode(newPwd));
```

---

### 🔐 비밀번호 재발급 로직
- **경로**: `/user/password/reset`
- **관련 파일**:
  - `UserController.java`
  - `UserService.java`
  - `EmailService.java`
- **동작 원리**:
  - 이메일 입력 → 존재 확인
  - 임시 비밀번호 생성 (UUID 기반)
  - 이메일로 전송 후 암호화 저장
- **코드 분석**:
```java
String tempPwd = UUID.randomUUID().toString().substring(0, 8);
user.setPwd(passwordEncoder.encode(tempPwd));
emailService.sendTempPassword(user.getEmail(), tempPwd);
```

---

### ✅ 이메일 인증 로직
- **경로**: `/user/email/check`, `/user/email/verify`
- **관련 파일**:
  - `UserController.java`
  - `UserService.java`
- **동작 원리**:
  - 인증 요청 → UUID 토큰 생성 후 메일 발송
  - 인증 링크 클릭 시 해당 토큰 검증 → `email_chk` 필드 true로 변경
- **코드 분석**:
```java
// 이메일 인증 요청 시
user.setEmail_token(UUID.randomUUID().toString());
userRepository.save(user);
emailService.sendAuthEmail(user.getEmail(), user.getEmail_token());

// 인증 확인 시
if (user.getEmail_token().equals(token)) {
    user.setEmail_chk(true);
    userRepository.save(user);
}
```

---

### 📱 전화번호 인증 로직
- **경로**: `/phone/send?to=01012345678`
- **관련 파일**:
  - `PhoneController.java`
  - `SmsService.java`
- **동작 원리**:
  - 사용자가 전화번호 입력 → 인증번호 생성
  - 인증번호를 SMS API (CoolSMS) 통해 발송
  - 프론트에서 인증번호 입력 받아 비교 처리 (서버 저장 없이 비교 시도하는 구조)
- **코드 분석**:
```java
// SmsService.java
String authCode = "";
for (int i = 0; i < 6; i++) {
    authCode += Integer.toString(rand.nextInt(10));
}
params.put("text", "인증번호 [" + authCode + "] 입니다.");
coolsms.send(params);

// PhoneController.java
@GetMapping("/phone/send")
public String sendAuthCode(@RequestParam String to) throws CoolsmsException {
    return smsService.phoneNumberCheck(to);
}
```

---

### 🧑‍💼 관리자 - 유저 목록 조회
- **경로**: `/admin/user/list`
- **관련 파일**:
  - `AdminUserController.java`
  - `UserService.java`
  - `UserRepository.java`
  - `list.html`
- **동작 원리**:
  - PageRequest 생성 (페이징 + 정렬)
  - 이메일 또는 닉네임 검색
  - 모델에 리스트 담아 Thymeleaf 렌더링
- **코드 분석**:
```java
Page<User> users = userService.searchUsers(keyword, PageRequest.of(page, 10));
model.addAttribute("users", users);
```

---

### 🧑‍💼 관리자 - 유저 상세/수정
- **경로**: `/admin/user/view/{id}`, `/admin/user/edit/{id}`
- **관련 파일**:
  - `AdminUserController.java`
  - `UserService.java`
  - `edit.html`, `view.html`
- **동작 원리**:
  - id 기반 유저 조회
  - 소개글, 역할, 닉네임 등 관리자 수정 가능
- **코드 분석**:
```java
User user = userService.findById(id);
user.setRole(newRole);
user.setNickName(newNickname);
userRepository.save(user);
```

---

### 🔒 Security 인증/인가 로직
- **설정 파일**: `SecurityConfig.java`
- **동작 원리**:
  - `/admin/**` → 관리자만 접근 허용
  - `/user/**` → 로그인 유저 접근 허용
  - 기타 경로는 permitAll (로그인/회원가입 등)
  - 로그인/로그아웃 경로 설정, 비인가 리디렉션 처리 포함
- **코드 분석**:
```java
http.authorizeHttpRequests()
    .antMatchers("/admin/**").hasAnyRole("ADMIN", "MANAGER")
    .antMatchers("/user/**").authenticated()
    .anyRequest().permitAll();
```

