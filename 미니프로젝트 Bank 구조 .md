# 1. `package UserInfo` (유저 데이터 공통)

## `UserInfo` 클래스

- **속성**:
  - `private String id;`
  - `private String pw;`
  - `private int age;`
  - `private int money;`
  
- **메소드**:
  - Getter / Setter (각각의 속성에 대해)
  
- **생성자**:
  - `public UserInfo(String id, String pw, int age, int money);`
  
- **설명**:
  - 유저 정보를 보관하는 클래스

---

# 2. `package login` (로그인 공통)

## `Login` 인터페이스

- **메소드**:
  - `boolean login(UserInfo[] users, String id, String pw);`
  
## `LoginLogic` 클래스

- **설명**:
  - `Login` 인터페이스 구현
  - 사용자 `id`, `pw`로 로그인 처리
  - `users` 배열을 순회하여 로그인 확인

---

# 3. `package input` (입력 기능 공통)

## `InputControl` 인터페이스

- **메소드**:
  - `UserInfo inputUserData();` → 사용자 정보를 입력받아 `UserInfo` 객체 반환
  - `int inputMoney();` → 입금, 출금 금액 입력
  - `String inputYesNo();` → 계좌 삭제 Y/N 입력
  - `String inputLoginId();` → 로그인 시 아이디 입력
  - `String inputLoginPw();` → 로그인 시 비밀번호 입력

## `UserInput` 클래스

- **설명**:
  - `InputControl` 인터페이스 구현
  - 사용자가 입력한 데이터 처리
  - 예시: 유저 정보, 금액 입력, Y/N 입력 등 처리

---

# 4. `package account` (계좌 관련)

## `AccountView` 인터페이스

- **메소드**:
  - `void viewAccount(UserInfo user);` → 계좌 조회 (유저의 정보를 출력)

## `AccountViewLogic` 클래스

- **설명**:
  - `AccountView` 인터페이스 구현
  - 유저의 계좌 정보(아이디, 비밀번호, 잔액 등) 출력

## `Deposit` 클래스

- **메소드**:
  - `void deposit(UserInfo user, int amount);` → 입금 후 잔액 업데이트

## `Withdraw` 클래스

- **메소드**:
  - `void withdraw(UserInfo user, int amount);` → 출금 후 잔액 업데이트

## `AccountDelete` 클래스

- **메소드**:
  - `void delete(UserInfo user);` → 계좌 삭제 후 정보 초기화

---

# 5. `package main`

## `BankApp` (메인 프로그램)

- **기능**:
  - `while(true)` 루프에서 메뉴 선택
  - 각 기능에 대해 `switch`문을 사용하여 작업 수행

- **기능 흐름**:
  - **case 1**: 회원 추가
    - `UserInput`으로 유저 정보 입력받고, `UserInfo` 객체 생성 후 배열에 저장
  - **case 2**: 로그인
    - `LoginLogic` 클래스로 로그인 처리 후, 계좌 조회나 다른 작업 진행
  - **case 3**: 계좌 조회
    - 로그인한 유저의 `UserInfo` 객체로 계좌 조회
  - **case 4**: 입금
    - `Deposit` 클래스로 입금액 입력받고 잔액 업데이트
  - **case 5**: 출금
    - `Withdraw` 클래스로 출금액 입력받고 잔액 업데이트
  - **case 6**: 계좌 삭제
    - `AccountDelete` 클래스로 계좌 정보 초기화
  - **case 9**: 종료
    - 프로그램 종료

---
---
1. package UserInfo
   └─ UserInfo (유저 데이터)
       ├─ id, pw, age, money (프라이빗)
       ├─ getter, setter
       └─ 생성자 (id, pw, age, money)

2. package login
   ├─ Login (인터페이스)
   └─ LoginLogic (로그인 로직 클래스)

3. package input
   ├─ InputControl (인터페이스)
   └─ UserInput (사용자 입력 처리 클래스)

4. package account
   ├─ AccountView (계좌 조회 인터페이스)
   ├─ AccountViewLogic (계좌 조회 구현)
   ├─ Deposit (계좌 입금 클래스)
   ├─ Withdraw (계좌 출금 클래스)
   └─ AccountDelete (계좌 삭제 클래스)

5. package main
   ├─ BankApp (메인 클래스)
   ├─ while(true) 반복문
   └─ switch (사용자 입력에 따라 기능 실행)




