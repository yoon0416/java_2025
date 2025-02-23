### 업그레이드 해야 할 프로젝트
1. **Bank 미니 프로젝트**  
   - 전역변수 > 정적배열(현재 버전) > 동적배열 > DB  
   - 기타 업그레이드가 필요할 시 메모

2. **인적관리 프로젝트**  
   - 전역변수 > 정적배열(현재 버전) > 동적배열 > DB  
   - 기타 업그레이드가 필요할 시 메모

3. **항공권 예약 시스템**  
   - 전역변수 > 정적배열(현재 버전) > 동적배열 > DB  
   - 기타 업그레이드가 필요할 시 메모

3-2. 항공권 예약 시스템  
- 메소드 및 코드 최적화 가능하지만, 현재 지식으로는 최대한 구현됨.  
- 추후 지식 습득 후 업그레이드 예정.

### 프로그램 구현 및 업그레이드 기록
- 구현 영상을 유튜브에 올려서 진행 상황 기록.

### 새로운 정보 습득 시 메모
- 기존에 알았던 지식은 별도로 기록하지 않음.

### 까먹을까봐 메모
- 코랩에서 했던 파이썬 작업물도 다른 프로젝트에 업로드
- 깃허브 나중에 시간나면 꾸며보기


### 🚀 메타인지 확실히 하기 (번아웃 또 오면 이번에는 극복하기)

### ✅ 나만의 효과적인 학습 방법 찾기
- 나에게 맞는 코딩 공부법을 찾아 효율적으로 학습하기  
- 여러 문제를 풀면서 **문제 해결 능력** 키우기  
- 자주 하는 실수를 메모하고, 반복하지 않도록 개선하기  

### 🔍 생각하며 코딩하기
- **단순히 코드만 작성하지 말고, 왜 이렇게 짜는지 항상 고민하기!**  
- 오류가 나면 **정답부터 찾지 말고, 논리적으로 원인 분석하기!**  
- 모르는 부분이 나오면 **그냥 넘어가지 말고, 제대로 이해할 때까지 분석하기!**  

### 🎯 성장하는 개발자가 되기
- **내가 어떤 학습 방식에서 가장 효과를 보는지 스스로 점검하기!**  
- **새로운 개념을 배울 때, 어디에 적용할 수 있을지 고민하기!**  

🔥 **이번에는 번아웃 극복하고, 한 단계 더 성장하자!** 🔥

---

#### 1. 2025-02-17
- **git**: 로컬저장소와 원격저장소 연결
- **Java**: Eclipse 설치 및 설정

---

#### 2. 2025-02-18
- **자료형 종류** 및 **입력문** 정리
- **프로젝트 진행**: 은행시스템, 인적관리 일부

---

#### 3. 2025-02-19
1. **Bank 미니 프로젝트 수정**  
   - 전역변수 과다 사용 → 배열로 수정  
   - 중복 코드 줄이기: 로그인 과정 중복 코드 if문으로 정리  
   - 향후 메소드로 리팩토링 예정

2. **인적관리 미니 프로젝트 수정**  
   - 학사일정 제외한 부분 구현 완료  
   - 수정 사항: 전역변수 배열로 변경, 중복 코드 제거, 학사일정 캘린더 구현 예정

3. **항공권 예약 시스템**: 기본 구조 설계

---

#### 4. 2025-02-20
1. **인적관리 미니 프로젝트 수정**  
   - 전역변수 대신 배열 사용해 메모리 관리 개선  
   - 코드 흐름을 고려해 `break` 사용 위치 수정

2. **실수 및 개선 사항**  
   - `break` 남발로 배열에 정보가 잘못 저장되는 문제 해결  
   - 코드 흐름을 더 명확히 하여 수정 필요 부분을 쉽게 파악할 수 있게 됨  
   - 배열 검색 시 인덱스 실수 방지

**수정 사항:**
- 교수번호 포맷 수정 (년도-4자리) 완료

**추가 예정:**
- 아이디/비밀번호 찾기 기능  
- 학사일정 달력 구현

---

#### 5. 2025-02-21
1. **항공권 예약 시스템**: 90% 구현 완료  
   - 코드 흐름 수정 및 `break`문 처리 문제 해결

**수정 사항:**
- 생년월일, 이메일, 여권번호 형식 수정

**추가 예정:**
- 예약 시스템에서 출발/도착 날짜 입력 받아 DB에서 검색  
- 예약된 좌석 색상 변경  
- 회원가입 시 아이디 중복 체크 및 비밀번호 확인 기능 추가

**개발 소감:**
- 메소드 활용과 코드 블록 주석을 통한 코드 가독성 향상  
- 메모리 관리의 중요성 깨달음

---

#### 6. 2025-02-22
1. **항공권 예약 시스템**: 추가 기능 구현 완료  
   - 회원가입 시 아이디 중복 체크, 비밀번호 재입력 기능 구현  
   - 생년월일(YYMMDD), 이메일, 여권번호 형식 수정
   - 생년월일 변수 int > String으로 수정

**실수 및 개선 사항:**
- 생년월일 입력 조건 설정 오류로 2000년 이후 출생자 입력 불가 문제 해결

**추가 예정:**
- 여권번호 입력받는 형식

**해보고 싶은 것**
- 알고리즘 유무가 성능에 얼마나 유의미한 차이가 있는지 비교

---

#### 7. 2025-02-23
1. **항공권 예약 시스템**: 변수 자료형 수정 및 기능 추가  
   - 전화번호 형식으로 입력한 경우 경고 메시지 출력  
   - 여권번호 형식으로 입력한 경우 경고 메시지 출력

**수정:**
- 전화번호, 여권번호 형식 수정

**실수 및 개선:**
- 전화번호를 `int`형으로 받던 방식에서는 하이픈이 사용 가능하기에 `String`으로 변경하고 `.matches()`를 사용해 숫자만 포함되는지 체크하도록 수정

**새롭게 알게 된 지식:**
- `.matches()`는 문자열이 정규 표현식으로 정의된 패턴에 맞는지 확인하는 메서드입니다.  
   - 정규 표현식(정규식)은 문자나 숫자 패턴을 정의하는 방법으로, 복잡한 문자열 검증을 쉽게 할 수 있습니다.  
   - 예: `.matches("\\d+")`는 숫자만 포함해야 한다는 뜻입니다.

**수정 사항:**
- 전화번호, 이메일, 여권번호 등의 입력 시 잘못 입력된 경우 다시 입력을 받을 수 있도록 수정해야 함  
   - 현재 잘못 입력 시 처음 화면으로 돌아가게 되어 불편함  
   - 실수를 하면 처음부터 회원가입을 다시 해야하는 불상사 발생

**개선 사항:**
- `main.java`에 회원가입 기능을 메소드로 분리하여 관리하는 것이 유지보수에 좋을 것 같음
- 각 기능별로 클래스를 나눠 유지보수에 유리함, 코드 가독성 상승, 재사용성 높아지는 효과 받기
- `case 1~5`까지 클래스파일 나누고 메소드 따로 지정하기

---
---

### OOP 개념

1. **캡슐화(Encapsulation)**  
   - 데이터(변수)와 메서드(기능)를 하나의 클래스로 묶고, 외부에서 직접 접근을 제한하는 개념  
   - **목적**: 데이터를 보호하고 불필요한 접근을 막아 오류를 줄임

2. **상속(Inheritance)**  
   - 기존 클래스(부모 클래스)의 속성과 메서드를 물려받아 새로운 클래스를 만드는 개념  
   - **목적**: 코드 중복을 줄이고 확장성을 높임

3. **다형성(Polymorphism)**  
   - 같은 메서드가 여러 형태로 동작할 수 있도록 만드는 개념  
   - **목적**: 같은 코드로 다양한 객체를 처리할 수 있게 함

4. **추상화(Abstraction)**  
   - 필요한 부분만 보여주고, 불필요한 내부 구현을 숨기는 개념  
   - **목적**: 중요한 부분만 강조하고 코드의 복잡도를 줄임

### OOP 기반 업그레이드 계획

1. **캡슐화(Encapsulation)**
   - **현재 상태**: 데이터와 메서드가 분리되어 있는 경우가 많음.  
   - **업그레이드 사항**: 
     - 관련된 변수와 메서드를 하나의 클래스 안에 묶어 관리하도록 개선.  
     - 불필요한 변수와 메서드는 외부에서 접근할 수 없도록 `private` 접근 제어자를 사용하여 숨기기.  
     - 메서드는 필요한 최소한의 기능만을 담당하게 하여 코드의 응집도를 높임.

2. **상속(Inheritance)**
   - **현재 상태**: 코드가 중복되는 부분이 있음.  
   - **업그레이드 사항**: 
     - 상속을 통해 부모 클래스로 공통 기능을 정의하고, 자식 클래스에서 이를 상속받아 재사용.  
     - 중복된 코드를 자식 클래스에서 재정의(`Override`)하여 코드 유지보수성을 높임.  
     - 예를 들어, 사용자 관리나 예약 시스템의 공통 기능을 부모 클래스로 묶고, 각 프로젝트에서 상속받아 사용할 수 있도록 개선.

3. **다형성(Polymorphism)**
   - **현재 상태**: 동일한 메서드가 여러 방식으로 사용되는 경우가 적음.  
   - **업그레이드 사항**: 
     - 하나의 인터페이스 또는 부모 클래스에서 여러 자식 클래스들이 다르게 동작하도록 만들어, 동일한 메서드가 다양한 객체에서 다르게 동작하게 만들기.  
     - 예를 들어, 사용자 입력에 따라 서로 다른 방식으로 데이터를 처리하는 메서드를 구현하여, 코드의 유연성을 높일 수 있음.

4. **추상화(Abstraction)**
   - **현재 상태**: 세부 구현이 코드에 많이 드러나 있어 코드가 복잡해짐.  
   - **업그레이드 사항**: 
     - 추상 클래스를 사용하여 불필요한 세부 구현을 숨기고, 필요한 부분만 인터페이스로 정의.  
     - 예를 들어, 항공권 예약 시스템에서 예약 기능을 추상화하여 각 예약 방법에 대한 구체적인 구현은 자식 클래스에서 담당하도록 만들 수 있음.
     - 인터페이스나 추상 클래스를 이용해 코드의 복잡도를 줄이고, 핵심 로직을 쉽게 이해할 수 있도록 개선.

---

### 적용 계획
- 각 프로젝트에 대해 OOP 원칙을 적용하여 코드 구조를 점진적으로 변경하고, 기존의 절차적 코드 스타일을 객체지향적으로 개선하는 방향으로 업그레이드 진행.
- 클래스와 메서드 설계를 더 체계적으로 만들어 유지보수 및 확장성이 용이하도록 함.
