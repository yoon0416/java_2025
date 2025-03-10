# 📌 업그레이드 해야 할 프로젝트

## 🚀 개인 프로젝트 예정 (개발 중)

### 1. 청년 전용 혜택/지원금 추천 서비스 (웹 구현)
- **공공데이터:** 복지부, 고용부 청년 지원 정책 데이터 활용
- **API 활용:** 카카오API (사용자 위치 기반 지역별 혜택 필터링)
- **핵심 포인트:** 청년 대상 서비스 → "요즘 핫한 주제" + 실생활 도움됨
- **추가 아이디어:** 내가 받은 지원금 관리 기능 추가 시 완벽한 서비스 가능

### 2. 국내 축제 캘린더 + 사용자 후기 공유 서비스 (웹 구현)
- **공공데이터:** 한국관광공사 축제 정보 데이터 활용
- **API 활용:** 카카오API (축제 위치 지도 표시)
- **핵심 포인트:** 지역별 축제 찾기 + 리뷰 남기기 + 내 스케줄 등록까지 한 방에 가능
- **추가 아이디어:** 축제 근처 맛집 추천 기능 추가

### 3. 유저 간 대여 서비스 중계 (앱 구현)
- **핵심 포인트:** 공유경제 트렌드 활용 → 사용자 간 직접 대여 및 거래
- **주요 기능:** 대여 물품 카테고리, 사용자 리뷰 및 신뢰도 시스템, 지역 기반 필터링

### 4. 음식 주문 시스템 (java만 사용하는 프로젝트 / oop연습)
- OOP 적용 요소: 다형성, 인터페이스
- 주요 기능
  - 음식 메뉴 등록 & 주문 기능
  - 배달 vs 포장 선택 가능
  - 주문 내역 출력
- OOP 적용 포인트
  - Food 부모 클래스를 만들고, Burger, Pizza, Drink 같은 자식 클래스로 상속
  - Order 클래스를 만들어 주문 내역 저장 (List<Food>)
  -  Delivery 인터페이스를 만들어 배달과 포장 기능 구현


---

# 🔧 기존 미니 프로젝트 업그레이드 진행 사항

### 1. Bank 미니 프로젝트
- **현재 상태:** 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용 예정
- **개선 목표:**
  - 기존 정적 배열을 동적 배열로 변환하여 유연성 향상
  - 이후 데이터베이스 연동으로 확장성 및 유지보수성 확보
- **추가 학습 필요:**  MySQL 연동

### 2. 인적 관리 미니 프로젝트
- **현재 상태:** 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용 예정
- **개선 목표:**
  - 학사 일정 및 관리 시스템 종료 기능 추가
  - 전역변수 제거 후 구조 개선 (객체 지향 원칙 적용)
- **추가 학습 필요:** 파일 입출력 (데이터 저장)

### 3. 항공권 예약 시스템 미니 프로젝트
- **현재 상태:** 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용 예정
- **개선 목표:**
  - 회원가입 시 중간 오류 발생 시 처음부터 다시 진행하는 불편함 개선
  - 로그아웃 시 사용자 피드백 메시지 제공
  - 좌석 선택 시 UI 개선 (선택된 좌석 색상 변경 기능 추가)
- **추가 학습 필요:** 

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

## 🏆 2025-02-17 ~ 2025-03-07

| 날짜 | 학습 내용 |
|---|---|
| **2025-02-17** | Git 로컬 저장소 & 원격 저장소 연결, Java Eclipse 설치 및 설정 |
| **2025-02-18** | 자료형 및 입력문 정리, 프로젝트 진행 (은행 시스템, 인적 관리 일부) |
| **2025-02-19** | Bank 미니 프로젝트 수정 (전역변수 → 배열 적용) |
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
---

# 🎯 추가 목표

- GitHub README 스타일 개선
- 모든 OOP 개념 적용하여 프로젝트 리팩토링 & 성능 향상 후 비교 분석
- 오픈 소스 프로젝트 기여 경험 쌓기 (쉬운 이슈부터 해결, 문서 정리 및 버그 리포트 포함)
- 개인 프로젝트 3가지 (혜택 추천 서비스, 축제 캘린더, 대여 중계 앱) 진행
- 기존 미니 프로젝트 (Bank 시스템, 인적 관리, 항공권 예약) 리팩토링 및 DB 적용 예정

---

# 🔗 즐겨찾기 & 참고 자료

- **GitHub 관련**: [Git 공식문서](https://git-scm.com/doc)
- **자바 개념 정리**: [Inpa 기술블로그](https://inpa.tistory.com/)
- **코딩 테스트 준비**: 백준, 프로그래머스, SWEA, 코드업
- **API 문서 참고**: [카카오 API](https://developers.kakao.com/)
- **잘 정리된 자바 프로젝트** https://github.com/JMsuper/java-bondtypestock-investment-strategy?tab=readme-ov-file
---

