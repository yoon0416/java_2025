# 🚀 메타인지 확실히 하기 (번아웃 또 오면 이번에는 극복하기)

## 나만의 효과적인 학습 방법 찾기
- 나에게 맞는 코딩 공부법을 찾아 효율적으로 학습하기  
- 여러 문제를 풀면서 문제 해결 능력 키우기  
- 자주 하는 실수를 메모하고, 반복하지 않도록 개선하기  

## 생각하며 코딩하기
- 단순히 코드만 작성하지 말고, 왜 이렇게 짜는지 항상 고민하기  
- 오류가 나면 정답부터 찾지 말고, 논리적으로 원인 분석하기  
- 모르는 부분이 나오면 그냥 넘어가지 말고, 제대로 이해할 때까지 분석하기  

---

# 📌 업그레이드 해야 할 프로젝트

## Bank 미니 프로젝트
- 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용  
- 기타 필요한 기능 업그레이드  

## 인적관리 미니 프로젝트
- 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용  
- 기타 필요한 기능 업그레이드  

## 항공권 예약 시스템 미니 프로젝트
- 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용  
- 추가적인 학습 후 성능 개선 예정  

---

# 🔧 OOP 개념과 업그레이드 계획

## 캡슐화(Encapsulation)  
- 데이터(변수)와 메서드를 하나의 클래스로 묶어 외부 접근을 제한  
- **목적:** 데이터를 보호하고, 불필요한 접근을 막아 오류 감소  
- **개선 계획:**  
  - 관련된 변수와 메서드를 한 클래스 안에 묶어 관리  
  - 불필요한 변수와 메서드는 `private` 접근 제한  

## 상속(Inheritance)  
- 부모 클래스의 속성과 메서드를 재사용하여 코드 중복 감소  
- **목적:** 코드 유지보수성을 높이고 확장성 증가  
- **개선 계획:**  
  - 공통 기능을 부모 클래스로 정의하고 자식 클래스에서 상속받아 활용  
  - 자식 클래스에서 필요하면 `Override`로 커스터마이징  

## 다형성(Polymorphism)  
- 같은 메서드를 다양한 객체에서 다르게 동작하도록 설계  
- **목적:** 하나의 코드로 다양한 객체를 유연하게 처리  
- **개선 계획:**  
  - 인터페이스 또는 부모 클래스를 통해 여러 자식 클래스에서 다형성 활용  
  - 예: 사용자 입력에 따라 서로 다른 데이터 처리 방식 구현  

## 추상화(Abstraction)  
- 핵심적인 부분만 노출하고 세부 구현을 숨김  
- **목적:** 코드의 복잡도를 줄이고 가독성 향상  
- **개선 계획:**  
  - 인터페이스와 추상 클래스를 활용하여 유지보수 용이한 코드 구조 설계  

---

# 📅 프로그램 구현 및 업그레이드 기록

## 2025-02-17  
- **Git:** 로컬 저장소와 원격 저장소 연결  
- **Java:** Eclipse 설치 및 설정 완료  

## 2025-02-18  
- 자료형 및 입력문 정리  
- 프로젝트 진행: 은행 시스템, 인적 관리 일부  

## 2025-02-19  
### Bank 미니 프로젝트 수정  
- 전역변수 과다 사용 → 배열 적용  
- 중복 코드 if문으로 정리 (리팩토링 예정)  

### 인적관리 미니 프로젝트 수정  
- 학사 일정 제외한 부분 구현 완료  
- 전역변수 → 배열 변경, 중복 코드 제거  

### 항공권 예약 시스템  
- 기본 구조 설계 진행  

## 2025-02-20  
- 인적관리 프로젝트: 전역변수 대신 배열 사용하여 메모리 관리 개선  
- `break` 남발로 인한 배열 저장 오류 해결  

**수정 완료:**  
- 교수번호 포맷 변경 (년도-4자리)  

**추가 예정:**  
- 아이디/비밀번호 찾기 기능  
- 학사 일정 캘린더 구현  

**실수 및 개선 사항:**  
- `break` 남발로 인하여 배열에 학생 정보가 인덱스 0번에만 들어가고 나머지에는 안 들어감.  
- 값 추가 시 기존 값이 삭제되고 대입됨. 처음에는 배열 선언할 때 초기값을 안 줘서 그런 줄 알았지만 나중에는 `break`가 문제였단 걸 알게 됨.
- 전체적인 코드를 짤 때 더 코드 흐름을 생각하고 작성해야겠음. 코드 리뷰해서 수정할 때 뭐가 잘못된 건지, 어디에서 실행이 안 되는지 한눈에 안 들어옴.

**이번 미니 프로젝트 만들면서 느낀 점:**
 1. 메소드 활용이 좀 더 수월해짐.
 2. 블록 `{}` 끝나고 `//end` 이런 식으로 주석을 쓰니 좀 더 편하게 코드를 짤 수 있다는 걸 느낌.
 3. `break`문을 실수하지 않게 더 꼼꼼하고 신중하게 사용하려고 노력.
 4. 조건문과 반복문을 예전보다 수월하게 작성할 수 있게 됨.
 5. 메모리를 관리해야겠다고 느낌.

## 2025-02-21  
- 항공권 예약 시스템: 90% 구현 완료  
- 생년월일, 이메일, 여권번호 형식 수정  

**수정 완료:**  
- 회원가입 시 아이디 중복 체크  
- 비밀번호 재입력 기능 추가  

**추가 예정:**  
- 예약된 좌석 색상 변경 기능  

**실수 및 개선 사항:** 
- 생년월일 6자리로 입력을 받아야 하는 조건에 단순히 `100000 <= a && a <= 999999` 이런 식으로 했더니, 그 결과 2000년생 이후로는 입력이 안 되는 문제가 발생. 그래서 `string`으로 수정 후 생년월일 문자열의 길이가 6개인지 확인하는 방법으로 수정함.

## 2025-02-22  
- 항공권 예약 시스템: 회원가입 기능 보완  
- 생년월일 `int` → `String` 타입 변경  
- `.matches()`를 활용한 정규 표현식 검증 적용  

**수정 완료:**  
- 전화번호, 이메일, 여권번호 입력 오류 방지  

**추가 예정:**  
- 회원가입 중 잘못된 입력 시 재입력 가능하도록 개선  

## 2025-02-23  
- 항공권 예약 시스템: 변수 자료형 수정 및 기능 추가  
- 전화번호 및 여권번호 입력 오류 검증 로직 개선  

**실수 및 개선 사항:**  
- 전화번호를 `int`로 받으면 하이픈이 포함이 될 수 있어 `String`으로 변경  
- `.matches()`를 사용하여 숫자만 포함되는지 체크하도록 수정  
- 아직까지 `break`와 `continue`를 실수함 응용문제와 유튜브 강의 필수

**새롭게 배운 점:**  
- `.matches()`를 이용한 정규 표현식 활용  
- `main.java` 내 회원가입 기능을 메소드로 분리하면 유지보수 용이  

---

# 🎯 추가 개선 예정(자바 외 내 전체적인 개발자 목표)
- GitHub README 스타일 개선  
- 개인적으로 해봤던 python 프로젝트(주식 홈페이지 만들고 서버 플라스크로 만들기, 야후 파이낸스 api사용) 재 업로드 혹은 다시 한번 구현)
- github 오픈 소스 프로젝트 기여해보기 (난 초보자니까 쉬운 이슈부터, 코드기여말고도 문서정리나 버그리포트도 기여되니까 해보기)
- 모든 OOP 개념에 맞게 업그레이드 후 최적의 알고리즘 적용하여 성능 향상 그리고 얼마나 향상된지 비교 후 메모
- 군대 가기 전 만들고 싶었던 유저간 대여 중계 서비스 어플 개인 프로젝트로 제작하기 (25년도 목표)

# 즐겨찾기
- **변수명 짓기:** [Wordic](https://wordic.loeaf.com/variable-name)  
- **어려운 개념 정리:** [ChatGPT](https://chatgpt.com)  
- **코딩 테스트:** 백준(알고리즘), 프로그래머스(코딩테스트), SWEA(삼성 알고리즘 문제), 코드업(백준보다 난이도 낮음), 바킹독(다양한 알고리즘 자료 제공)  
- **유튜브:** 코딩애플(cs 정보, 응용), 노말틱(정보보안), 나도코딩(혼자 공부용)

