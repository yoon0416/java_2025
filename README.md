# 📌 업그레이드 해야 할 프로젝트

## 🚀 개인 프로젝트 예정

### 1. jsp + db 사용 프로젝트※※※※ 뭐하지뭐하지뭐하지뭐하지

### 2. 국내 축제 캘린더 + 사용자 후기 공유 서비스 (웹 구현) > 나중에 내 능력이 된다면 해보고 싶음
- **공공데이터:** 한국관광공사 축제 정보 데이터 활용
- **API 활용:** 카카오API (축제 위치 지도 표시)
- **핵심 포인트:** 지역별 축제 찾기

### 3. 유저 간 대여 서비스 중계 (앱 구현) > 반드시 해야함 이거 하고 싶음
> 이거 만들고 싶어서 번아웃 극복하고 공부 다시 시작
- **핵심 포인트:** 공유경제 트렌드 활용 → 사용자 간 직접 대여 및 거래
- **주요 기능:** 대여 물품 카테고리, 사용자 리뷰 및 신뢰도 시스템, 지역 기반 필터링



---

# 🔧 기존 미니 프로젝트 업그레이드 진행 사항

### 1. Bank 미니 프로젝트
- [Bank 프로젝트 GitHub](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank)

### 2. 인적 관리 미니 프로젝트
- **현재 상태:** 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용 예정
- **개선 목표:**
  - 개인프로젝트 진행 예정이므로 더이상 업그레이드 계획 없음

### 3. 항공권 예약 시스템 미니 프로젝트
- **현재 상태:** 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용 예정
- **개선 목표:**
  - 개인프로젝트 진행 예정이므로 더이상 업그레이드 계획 없음

---

# 🔧 OOP 개념과 업그레이드 계획

| 개념 | 설명 | 개선 계획 |
|---|---|---|
| **캡슐화 (Encapsulation)** | 데이터(변수)와 메서드를 하나의 클래스로 묶어 외부 접근을 제한 | 관련된 변수와 메서드를 한 클래스 안에 묶어 관리 |
| **상속 (Inheritance)** | 부모 클래스의 속성과 메서드를 재사용하여 코드 중복 감소 | 공통 기능을 부모 클래스로 정의하고 자식 클래스에서 상속 활용 |
| **다형성 (Polymorphism)** | 같은 메서드를 다양한 객체에서 다르게 동작하도록 설계 | 인터페이스 또는 부모 클래스를 통해 다형성 적용 |
| **추상화 (Abstraction)** | 핵심적인 부분만 노출하고 세부 구현을 숨김 | 인터페이스와 추상 클래스를 활용하여 유지보수 용이한 코드 설계 |

---

# 📅 프로그램 구현 및 업그레이드 & 공부 기록

## 🏆 2025-02-17 ~ 2025-03-26

| 날짜 | 학습 내용 |
|---|---|
| **2025-02-17** | Git 로컬 저장소 & 원격 저장소 연결, Java Eclipse 설치 및 설정 |
| **2025-02-18** | 자료형 및 입력문 정리, 프로젝트 진행 ([은행 시스템](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank), 인적 관리 일부) |
| **2025-02-19** | [Bank 미니 프로젝트 수정 (전역변수 → 배열 적용)](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank) |
| **2025-02-20** | 인적관리 프로젝트: 전역변수 대신 배열 사용하여 메모리 관리 개선, `break` 남발로 인한 배열 저장 오류 해결 |
| **2025-02-21** | 항공권 예약 시스템 90% 구현 완료, 회원가입 시 아이디 중복 체크 추가 |
| **2025-02-22** | 항공권 예약 시스템: 회원가입 기능 보완, 생년월일 `int` → `String` 타입 변경 |
| **2025-02-23** | 항공권 예약 시스템: 변수 자료형 수정 및 기능 추가, 전화번호 및 여권번호 입력 오류 검증 로직 개선 |
| **2025-02-24** | 항공편 검색 기능 추가, 1차원 정적배열 연습 |
| **2025-02-25** | 1차원 배열 & 2차원 배열 학습, 메소드 호출 개념 학습 |
| **2025-02-26** | 2차원 배열 연습문제 풀이, `math.random` 활용 난수 생성 학습 |
| **2025-02-27** | 오버로딩 & 오버라이딩 개념 학습, call by value vs call by reference 비교 |
| **2025-02-28** | 생성자 개념 정리 (`this`, `super()` 포함), 예외처리 (`try-catch`) 학습 |
| **2025-03-01** | 자바 메모리 구조 추가 공부, 이전 개념 복습 |
| **2025-03-02** | 자바 메모리 구조 추가 학습 (스택, 힙, 메서드 영역 정리) |
| **2025-03-03** | 예외처리 (`try-catch`) 추가 학습 |
| **2025-03-04** | `final`, 접근 지정자, 게터 & 세터 개념 학습 |
| **2025-03-05** | 다형성 개념 학습, UML 활용 |
| **2025-03-06** | 인터페이스 개념 정리, 다형성 복습문제 풀이 |
| **2025-03-07** | oop파트 복습문제 익명클래스 개념 학습|
| **2025-03-08** | 추상화 & 인터페이스 개념 학습, 예외처리 & 예외던지기 개념 정리 및 연습문제, 익명클래스 개념 학습 및 연습문제 |
| **2025-03-09** | 자바 메모리 구조 복습, 개인 프로젝트 3개 구상 |
| **2025-03-10** | 컬렉션 프레임워크 ( LIst, Set, Map)개념 및 실습, 스윙으로 gui 첫구현 |
| **2025-03-11** | 컬렉션 프레임워크 연습, lambda 개념 및 실습, Bank 미니 프로젝트 인터페이스버전 구현 계획 세우기 |
| **2025-03-12** | lambda 개념 및 실습, Stream 개념 및 실습, JAVA IO 개념 학습, Bank 미니 프로젝트 인터페이스버전(v7.2) 구현 |
| **2025-03-13** | [Bank 미니 프로젝트 인터페이스버전(v7.4) 구현](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank),bank 프로젝트 보안 취약점 분석, JAVAIO 개념 및 실습, 네트워크 파트 공부(크롤링, 스크래핑 개념이랑 비슷한 거 배움), 네이버 개발자 api 사용실습 , w3c를 이용한 css 실습 |
| **2025-03-14** | [Bank 미니 프로젝트 인터페이스버전(v7.5) 구현](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank), Thread 개념 및 실습, Network 소켓, mysql 환경설정, [Bank 미니 프로젝트 인터페이스버전(v7.6) 구현](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank)|
| **2025-03-15** | [Bank 미니 프로젝트 인터페이스버전(v7.7) 구현](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank)|
| **2025-03-16** | 부족하다고 느낀 람다식 공부, [bank 미니 프로젝트 인터페이스버전(7.8) 구현](https://github.com/yoon0416/java_2025/tree/main/java_basic/src/bank)|
| **2025-03-17** | Mysql, jsp|
| **2025-03-18** | Mysql `update`,`insert`,`delete`, jsp db연동 방법|
| **2025-03-19** | Mysql `update`,`insert`,`delete` 연습문제, jsp db연결 실습, bank db 틀 만들기, bank jsp구현 시작 |
| **2025-03-20** | Mysql `order by`,`limit`,`group by`, milk.jsp와 milk_order db 연결, `select last_insert_id();` 이거 뭔지 공부해야함|
| **2025-03-21** | Mysql `if`,`case`,`string`,jsp 이해는 milk로, 그그그그그 유효성검사 js이용, js기초 복습|
| **2025-03-24** | Mysql `join`, jsp: r하|

---

# 🎯 추가 목표

- GitHub README 스타일 개선
- 모든 OOP 개념 적용하여 프로젝트 리팩토링 & 성능 향상 후 비교 분석
- 오픈 소스 프로젝트 기여 경험 쌓기 (쉬운 이슈부터 해결, 문서 정리 및 버그 리포트 포함)
- 기존 미니 프로젝트에서 Bank 만 지속적인 업그레이드 하기로 결정
- 시니어 개발자의 코드리뷰 및 피드백을 반영하여 코드 품질 개선부분 작성

---

# 🔗 즐겨찾기 & 참고 자료

- **GitHub 관련**: [Git 공식문서](https://git-scm.com/doc)
- **자바 개념 정리**: [Inpa 기술블로그](https://inpa.tistory.com/)
- **코딩 테스트 준비**: 백준, 프로그래머스, SWEA, 코드업
- **API 문서 참고**: [카카오 API](https://developers.kakao.com/)
- **잘 정리된 자바 프로젝트** https://github.com/JMsuper/java-bondtypestock-investment-strategy?tab=readme-ov-file , https://github.com/jihokim94/starbucks
---

