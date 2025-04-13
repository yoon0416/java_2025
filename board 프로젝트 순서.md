# 게시판(Board) 프로젝트 개발 순서 (프로젝트 세팅 생략 버전)

## 1. 프로젝트 세팅
- 스프링부트 프로젝트 생성 및 의존성 추가 (Web, JPA, Thymeleaf, Lombok, Security, DB)

---

## 2. 도메인 설계 (Entity)

- `Role` Enum
  - 권한 구분용 (USER, ADMIN)

- `Member` Entity
  - id (PK)
  - username (회원 ID) - `@Column(nullable = false, unique = true)`
  - password (회원 비밀번호) - `@Column(nullable = false)`
  - role (권한) - `@Enumerated(EnumType.STRING)`

- `Board` Entity
  - id (PK)
  - title (글 제목) - `@Column(nullable = false)`
  - content (글 내용) - `@Column(nullable = false)`
  - member (작성자) - `@ManyToOne(fetch = FetchType.LAZY)` + `@JoinColumn(name = "member_id")`

---

## 3. Repository 생성

- `MemberRepository`
  - `findByUsername(String username)` (자동 메서드)
  - `@Query` 직접 쿼리 작성 가능

- `BoardRepository`
  - 기본 JpaRepository 사용
  - `@Query` 직접 쿼리 작성 가능
    - 예시: `@Query("SELECT b FROM Board b ORDER BY b.id DESC")`

---

## 4. 회원 기능

### MemberService
- 회원가입 기능 (`save`)
- 비밀번호 암호화 (`PasswordEncoder` 사용)

### MemberController
- `/member/join` → **GET** (회원가입 화면)
- `/member/join` → **POST** (회원가입 처리)
- `/member/login` → **GET** (로그인 화면)

### SecurityConfig
- 로그인/로그아웃 기본 설정
- 비밀번호 인코더 등록 (`BCryptPasswordEncoder`)

---

## 5. 게시판 기능

### BoardService
- 글쓰기 (`save`)
- 글 목록 조회 (`findAll`)
- 글 상세 조회 (`findById`)
- 글 수정 (`update`)
- 글 삭제 (`delete`)

### BoardController
- `/board/list` → **GET** (글 목록)
- `/board/detail/{id}` → **GET** (글 상세 보기)
- `/board/write` → **GET** (글쓰기 화면)
- `/board/write` → **POST** (글쓰기 처리)
- `/board/edit/{id}` → **GET** (글 수정 화면)
- `/board/edit/{id}` → **POST** (글 수정 처리)
- `/board/delete/{id}` → **POST** (글 삭제 처리)

---

## 6. 화면 (HTML)

- 회원 관련 화면
  - join.html (회원가입)
  - login.html (로그인)

- 게시판 관련 화면
  - list.html (목록)
  - detail.html (상세)
  - write.html (글쓰기)
  - edit.html (수정)

- 공통 레이아웃
  - header.html
  - footer.html
  - layout.html

---

## 7. 권한 처리 (Security)

- 로그인한 사용자만 글쓰기 가능
- 글 작성자만 수정/삭제 가능
- 관리자만 접근 가능한 기능 추가 (선택)

---

## 추가: @Query를 이용한 직접 쿼리 작성

- Repository 인터페이스 안에서 사용
- 기본은 JPQL (엔티티 이름, 필드 이름 기준)
- 진짜 SQL 사용 시 `nativeQuery = true` 옵션 추가

**예시 (JPQL)**
```java
@Query("SELECT b FROM Board b ORDER BY b.id DESC")
List<Board> findAllOrderByIdDesc();