---

# 📌 업그레이드 해야 할 프로젝트

## Bank 미니 프로젝트
- 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용  
- 추가적인 학습 후 성능 개선 예정
- https://youtu.be/3mcZiNizd04

## 인적관리 미니 프로젝트
- 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용
- 추가적인 학습 후 성능 개선 예정
  1. 학사일정 및 관리시스템 종료 기능 구현 필요
- https://youtu.be/Ktgl7oqfwHs

## 항공권 예약 시스템 미니 프로젝트
- 전역변수 → 정적 배열(현재) → 동적 배열 → DB 적용  
- 추가적인 학습 후 성능 개선 예정
  1. 회원가입 중간에 틀리면 처음부터 다시하는 불편함 개선필요
  2. 로그아웃 시 로그아웃 했다고 알림 필요
  3. 좌석 선택시 선택한 좌석 색 변경 필요
- https://youtu.be/OOLjRIPSSEo

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

# 📅 프로그램 구현 및 업그레이드  & 공부 기록
---
*공부한 메모 및 개념정리들은 따로 md파일을 만들어 작성*
---

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

## 2025-02-24  
- 항공권 예약 시스템: 기능별로 클래스 나누기 전 인터페이스부터 공부 후 구현하기로 계획 및 진행
- 항공편 검색해서 찾는 기능 구현
- 반복문 연습문제
- 1차원 정적배열 연습

**실수 및 개선 사항:** 
- 변수 > 입력 > 처리 > 출력 형식대로 코드를 짜야 하는데 아직 훈련이 덜 되어있음 예전 습관대로 코드 눈에 보이는 대로 일단 짜는 습관 고치기
- 무한반복문 빠져나오는 `break`를 안쓰면 뒤에 코드 다 에러뜨는 걸처음 알게됨 항상 `break`남발하다가 안쓰니까 눈에 보임

**새롭게 배운 점:**  
- `contains()`는 문자열(String)에서 특정 문자열이 포함되어 있는지 확인하는 메서드
- `Integer.toString()`은 정수`(int)`를 문자열`(String)`로 변환하는 메서드
- `Integer`는 자바에서 숫자를 다루는 클래스 중 하나로, 정수 값을 다룰 때 사용
- `Integer.toString()`은 이 클래스의 정수 -> 문자열 변환을 도와주는 메서드
- `int`는 성능빠른 숫자형, `integer` 기능많은 숫자라고 생각하면 좀 더 편할 거 같음 자세한 정의는 주말에 복습하면서
- 확장 for문 `for(타입 변수명 : 배열 또는 컬렉션){배열 또는 컬렉션에 저장된 값이 매 반복마다 하나씩 순서대로 읽혀져 변수에 저장됨 }`
- ex) `for(int k:score) { system.out.print(k+" ")}`

## 2025-02-25  
- 1차원 배열 공부
- 2차원 배열 공부
- 메소드 호출 추가 공부

**수정 완료:**  
- bank프로젝트 각 기능별로 클래스 나눈 후 메소드 호출형식으로 수정
- bank 미니 프로젝트 기존 1차원배열에서 2차원 배열로 수정 > 이제부터 [몇번째유저][id, pw, 나이,잔액] 이런식으로 나옴 for문을 활용하여 몇번째 유저의 데이터를 받을지 고르면 끝
- 기존 입력받은 유저의 정보를 저장하던 id, pw, age, money 변수 2차원 배열로 수정하므로써 삭제

**새롭게 배운 점:**  
- 메소드 매개변수에 대해 아직 부족하지만 원리를 알게 됨
- rank 구할 때 쓰는 알고리즘 새로 배움
- `valueOf` 메소드는 `boolean`, `char`, `int`  같은 다양한 타입의 값을 문자열로 변환해주는 메소드
- `parseInt()`의 기능은 `String`타입의 숫자를 `int`타입으로 변환해주는 녀석
- `parseInt()`는 인티저 클래스의 static 함수
  
**실수 및 개선 사항:**  
- 항상 매개변수 없는 메소드를 쓰다가 매개변수 있는 메소드를 사용하니 매개변수 안에 값을 필요없는 값을 넣거나 이상한 값을 넣은 경우가 있음 개념정리 및 연습 필요
- 여태 스캐너 쪽 노란색 경고가 들어온게 무슨 뜻인지 몰랐으나 알고보니 `close()`를 안했다 이 뜻이였음
  1. `close()` 안 하면 자원 누수 발생하고, 시스템 자원이 제대로 해제되지 않아 성능 저하나 예기치 않은 동작이 생길 수 있음. 큰 프로그램에서는 이게 더 중요한 문제로 커질 수 있음.
  
## 2025-02-26  
- 2차원 배열 연습문제
- 메소드 선언 및 호출
- `math.random`으로 난수 만들기

**수정 완료:**  
- bank 프로젝트 `sc.close()`를 무조건 써야하는 줄 알았는데 내가 잘못한지 모르겠지만 원하던 출력문이 안나와서 다 삭제함

**실수 및 개선 사항:**  
- 스캐너 `.close()` 구조 확실히 알고 쓰기
- 리턴값이 있는 메소드에 `if`문을 사용할 경우 각 `if,` `else if`, `else`마다 `return`값을 넣어야하는걸 까먹고 있었음

**새롭게 배운 점:** 
- 문자열 반복 `repeat()`
- 래퍼 클래스개념

## 2025-02-27  
- 오버로딩
  1. 메서드들을 [같은이름]으로 같게
  2. 파라미터 [타입]과 [갯수]로 구분
  3. public, static, 리턴값은 오버로딩에 영향을 미치지 않음!
- 오버라이딩
  1. 상속시 자식 클래스에서 맞게 메서드를 수정
  2. 부모 클래스에서 상속받은 걸 자식 클래스에서 입맛대로 수정하는 것
- call by value vs call by reference
- OOP?
  1. 객체지향 프로그래밍
  2. Object Oriented Programming
  3.  틀  기반  프로그램
  4.  부품객체(class) 조립 완성된 프로그램을 만드는 기법 
> 클래스는 설계도
> 인스턴스는 실제로 만들어진 객체
- 스택과 힙의 차이점

## 2025-02-28 
- 생성자와 기본생성자 개념
- 생성자와 기본 생성자 ex문제
- `this.`
- -`super()`
- 예외처리(`try catch`)
- static

**새롭게 배운 점:** 
- 예외처리(`try catch`) 일부분
- `this` 개념
- `super`개념

- 공부 집가서 ㄷㅓ 해야겠다 일단 oop 부분이 어느정도 개념이 잡히고 문제들도 어느정도 풀 수 있으면 그때 모든 프로젝트 업그레이드 진행 예정

## 2025-03-01

- 자바 메모리 구조 추가 공부
- 여태 배웠던 개념 한번 더 복습

## 2025-03-02

- 자바 메모리 구조 추가 공부

1. 메서드, 생성자는 메서드 영역에 저장
2. 매개변수는 스택 영역에 저장
3. 객체(new로 생성된 객체)와 배열 그리고 인스턴스 변수(객체와 함께 저장됨)는 힙 영역에 저장
4. 참조 변수는 스택 영역에 저장

## 2025-03-03
- 책보면서 예외처리 공부

## 2025-03-04

- 컨트롤파트 복습문제
- `final`, 지정접근자
- 게터 세터
- `확장 for문`(향상된 for문)

## 2025-03-05
- 다형성
- UML
  
## 2025-03-06
- 인터페이스 개념
- 다형성 복습문제
1. 오버로딩과 오버라이딩 차이
  - 오버로딩
    - 같은 이름의 메서드를 여러 개 정의하되, 매개변수의 개수나 타입을 달리하여 구분하는 것.
  - 오버라이딩
    - 상속받은 클래스에서 부모 클래스의 메서드를 자식 클래스에서 재정의하여 사용하는 것
  
## 2025-03-07
- 추상화와 인터페이스 복습문제
- **추상화** 라는 개념이 바로 머릿속에 들어오지 않았던 이유는,
  - 우리는 프로그래밍을 처음 배울때 '설계'가 아닌 '사용' 하는 법을 먼저 배웠기 때문이다.
  - 즉, 우리는 처음부터 추상화의 돈독한 효과를 누리며 코딩해왔던 것이라, 너무나 당연한 것을 거꾸로 거슬러 올라가서 이해하려니 난해했던 것이다.
  - 객체 지향은 설계 이론이지 사용 이론이 아니다. 이점은 유의하며 추상화에 대해 접근하면 이해하기 편하다
    - 인파_ 기술블로그 문구 인용

**개념**
1. abstract 란?
  - (추상화), (is a 관계)
  - 실체화된 객체들 간에 공통된 특성을 추출한 것
  - 미완성적인 개념
2.interface 란?
  - (can do this 관계)
  - 개발코드와 객체사이 연결
  - 개발코드 변경없이 객체를 바꿔낄 수 잇도록 하는 역할
3. abstract 과 interface 의 차이점은?
  - 추상 클래스 : extends 키워드를 사용해서 자신의 기능들을 하위 클래스로 확장 시키는 느낌
  - 인터페이스 : implements 라는 키워드처럼 인터페이스에 정의된 메서드를 각 클래스의 목적에 맞게 기능을 구현하는 느낌
  
## 2025-03-07
- 추상화 인터페이스 복습
- 예외처리 예외던지기 개념
- 익명클래스 개념잡기
---


