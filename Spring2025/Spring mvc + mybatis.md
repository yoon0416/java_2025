# Spring MVC + MyBatis 프로젝트 파일 작성 순서

## 1. 설정파일

1. **pom.xml**
   - Maven 라이브러리 추가  
     (Spring MVC, MyBatis, HikariCP, MySQL Connector, JSTL 등)

2. **web.xml**
   - DispatcherServlet 등록
   - URL 매핑 설정 (`/`)

3. **root-context.xml**
   - DB 연결 (DataSource 설정)
   - MyBatis 설정 (SqlSessionFactory, MapperScan)

4. **servlet-context.xml**
   - Controller 스캔 설정 (ComponentScan)
   - ViewResolver 설정 (JSP 경로 매핑)

---

## 2. DTO 만들기 (데이터 객체)

- `BoardDto.java`
  - 게시판 데이터를 담는 클래스 (id, title, content 등)

- `UserDto.java`
  - 사용자 데이터를 담는 클래스 (id, username, password 등)

---

## 3. Mapper (MyBatis XML)

- `board-mapper.xml`
  - 게시판 SQL 작성 (select, insert, update, delete)

- `user-mapper.xml`
  - 사용자 SQL 작성

---

## 4. DAO (인터페이스)

- `BoardDao.java`
  - 게시판 DB 접근 인터페이스

- `UserDao.java`
  - 사용자 DB 접근 인터페이스

---

## 5. Service

- `BoardService.java` (인터페이스)
  - 비즈니스 로직 선언

- `BoardServiceImpl.java` (구현체)
  - DAO 호출, 비즈니스 로직 처리

---

## 6. Controller

- `BoardController.java`
  - 클라이언트 요청을 받아 Service 호출
  - 결과를 View(JSP)로 전달

- `IndexController.java`
  - 메인 페이지 처리

---

## 7. View (JSP 파일)

- `list.jsp`
- `detail.jsp`
- `write.jsp`
- `edit.jsp`
- `delete.jsp`

> 화면에 데이터 출력 및 사용자 입력 폼 구성

---

## 최종 파일 작성 순서

```plaintext
1. 설정파일
   → pom.xml → web.xml → root-context.xml → servlet-context.xml

2. DTO 만들기
   → BoardDto.java, UserDto.java

3. Mapper(XML) 만들기
   → board-mapper.xml, user-mapper.xml

4. DAO 인터페이스 만들기
   → BoardDao.java, UserDao.java

5. Service 만들기
   → BoardService.java, BoardServiceImpl.java

6. Controller 만들기
   → BoardController.java, IndexController.java

7. View(JSP) 만들기
   → list.jsp, detail.jsp, write.jsp, edit.jsp, delete.jsp
