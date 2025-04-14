# Board 게시판 만들기 순서 (Security 제외, 세팅 생략)

## 1. 도메인 설계 (Entity)

- `Member` Entity
  - id (PK)
  - username (회원 ID)
  - password (비밀번호)

- `Board` Entity
  - id (PK)
  - title (글 제목)
  - content (글 내용)
  - member (작성자, Member 참조)
    - `@ManyToOne`
    - `@JoinColumn(name = "member_id")`

---

## 2. Repository 생성

- `MemberRepository`
  - `findByUsername(String username)`

- `BoardRepository`
  - JpaRepository 상속
  - 필요 시 `@Query`로 직접 쿼리 작성 가능

---

## 3. 회원 기능 (Security 없이)

### MemberService
- 회원가입 기능 (Member 저장)

### MemberController
- `/member/join` → **GET** (회원가입 폼)
- `/member/join` → **POST** (회원가입 처리)

---

## 4. 게시판 기능 (Security 없이)

### BoardService
- 글쓰기 (`save`)
- 글 목록 조회 (`findAll`)
- 글 상세 조회 (`findById`)
- 글 수정 (`update`)
- 글 삭제 (`delete`)

### BoardController
- `/board/list` → **GET** (글 목록 보기)
- `/board/detail/{id}` → **GET** (글 상세 보기)
- `/board/write` → **GET** (글쓰기 폼)
- `/board/write` → **POST** (글 저장 처리)
- `/board/edit/{id}` → **GET** (글 수정 폼)
- `/board/edit/{id}` → **POST** (글 수정 처리)
- `/board/delete/{id}` → **POST** (글 삭제 처리)

---

## 5. 화면 (HTML)

- 회원 관련
  - join.html (회원가입 폼)

- 게시판 관련
  - list.html (글 목록)
  - detail.html (글 상세)
  - write.html (글쓰기)
  - edit.html (글 수정)

- 공통 레이아웃
  - header.html
  - footer.html
  - layout.html
