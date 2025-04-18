## Bank 프로젝트 업데이트 내역
 >  **마지막 업데이트 : 25.03.16**
---
[Bank v7.0 결과물 유튜브 링크](https://www.youtube.com/watch?v=3mcZiNizd04)

[![Python Tutorial](https://img.youtube.com/vi/3mcZiNizd04/0.jpg)](https://www.youtube.com/watch?v=3mcZiNizd04)

---

## 🔹 **버전별 업데이트 내역**

### Bank v1.0  
- bank 전체적인 컨트롤 파트 틀 구현  

### Bank v2.0  
- 유저 정보 저장 방식을 **전역변수 → 1차원 배열**로 수정  
- 중복된 코드 제거 (제어문 활용)  

### Bank v3.0  
- 로그인 입력 중복 코드 제거  

### Bank v4.0  
- **메뉴 기능 추가**  
  - 사용자가 원하는 기능을 선택할 수 있도록 메뉴 추가  
  - `switch-case` 문을 활용하여 기능을 분리  
- **계좌 조회 기능 추가**  

### Bank v5.0  
- **출금 기능 추가**  
  - 사용자의 계좌 잔액을 확인한 후 출금 가능하도록 구현  
  - 잔액 부족 시 출금 불가능하도록 예외 처리 추가  

### Bank v6.0  
- **기능별 클래스로 분리**  
  - `Login`, `AccountView`, `Deposit`, `Withdraw`, `AccountDelete` 등 기능별 클래스로 나눔  
- **2차원 배열로 데이터 구조 변경**  
  - 기존 1차원 배열에서 2차원 배열로 변경하여 유저 데이터를 더 효율적으로 관리  
- **메소드 재구성 및 코드 최적화**  
  - 중복 코드 제거 및 캡슐화를 적용하여 유지보수성을 높임  

### Bank v7.0 (인터페이스 적용 전 마지막 bank)  
- 기존 bank 시스템 유지  

### Bank v7.1 (인터페이스 적용 버전)  
- **기능별 클래스를 더욱 세분화**  
  - 입력클래스, 조회클래스, 출금클래스, 삭제클래스, 메뉴로 나눔  
- **캡슐화 적용**  
  - 기존 유저 정보들을 `private`로 변경하여 데이터 보호  
- **회사 정보 추가**  
  - `static String company = "(주)회사"` 추가  
- **Bank_Controller 인터페이스 도입**  
  - 모든 기능 클래스들이 이 인터페이스를 구현  

### Bank v7.2 
- 기존 Bank v7.0에 있던 **로그인 로직을 재구현**  
- 프로그램 종료 시 `return;`을 사용하여 프로그램 종료 시키는 형식으로 수정 & `sc.close()`
- menu7에서 만약 사용자가 메뉴를 고를 때 숫자가 아닌 다른 값을 입력할 경우 대비하여 예외처리 추가

### Bank v7.3 
- 유저 정보를 저장 형식 정적배열 → 동적배열로 구현
- `add()`, `remove()` 사용
- `toString()`은 테스트용으로 삭제 보류

### bank v7.4 
- 유저 정보를 삭제할 때 `remove()`만 사용했던걸 삭제 전 객체 데이터를 null로 덮어 쓰는 것 까지 추가 
  - `users.remove(find);`를 호출해도 객체가 메모리에 남아 있을 수 있음.
  - 이렇게 하면 객체가 참조되지 않게 되어 GC(Garbage Collector)가 정리할 수 있음.

### bank v7.5 
- 회원 가입시 중복 아이디 방지

### bank v7.6
- 입력값 오류 발생 시 예외처리

### bank v7.7
- 유저끼리 송금기능 추가

### bank v7.8 (최신 업데이트) 
- 송금기능 시 id 및 비밀번호가 맞아야 송금 가능하게 구현

### bank v7.n (예정)
- 특정 이벤트 발생 시 로그 기록(25.03.13배움)
- 소켓을 활용하여 클라이언트(유저)와 서버(뱅크시스템) 분리 (25.03.14배움)
- 유저 계좌끼리 이체 기능에서 송금할 유저 id입력 후 비밀번호 입력받고 맞다면 그때 받을 사람 계좌 id 받기 그 뒤 송금
- 공격자가 프로그램 해킹에 성공할 시 유저의 id 및 비밀번호를 탈취 당할 수 있기 때문에 요즘은 민감한 정보를 암호화한다! (해시화, 솔트, 해시 함수사용, 펀딩(페퍼) 암호화 된 db에 저장, 다단계 해시화 들을 사용하여 보안 강화를 함)
  - 이럴 경우 서버측에서도 역으로 비밀번호를 유추하기 힘들어 차라리 새로 재발급을 해줌 요즘 큰 대기업들은 이럼 그러므로 비밀번호 찾기 기능 구현 안할꺼임. 절대 귀찮아서 그러는게 아니라. 어!
- GUI 구현 (주말에 술 안마시고 여기전까지는 해보고 싶은데) > 시도해본 결과 스윙이 아닌 다른걸 사용할려니 다운로드해야함 귀찮음 다음에 해봐야지
- 여기까지 구현 후 인터페이스 버전에서 더이상 업그레이드 계획 x


### bank v8.0 (DB+jsp 버전 예정)


### bank vn.0 (클라이언트 - 서버 (네트워크)버전 예정) > 날 좋을 때 구현하기로

### bank vn.0 (java GUI 버전 예정) > 모든 업그레이드 진행 후 구현

---

## 🔍 **트러블슈팅 (Troubleshooting)**

### 🛠 **Bank v2.0 - 유저 정보 저장 방식 변경 이슈**  
**문제:**  
- v1.0에서는 유저 정보를 `전역 변수`로 선언하여 관리했으나,  
  데이터 증가 시 메모리 낭비 & 유지보수가 어려워짐.  

**해결:**  
- `1차원 배열`로 변경하여 메모리 사용 최적화.  
- 기존 중복된 변수 선언 제거, 루프를 활용한 동적 할당 적용.  

---  

### 🛠 **Bank v3.0 - 로그인 중복 코드 문제**  
**문제:**  
- 기존 로그인 로직에서 아이디와 비밀번호 검증 코드가 중복됨.  
- `for` 문 안에서 동일한 검증을 반복하여 불필요한 연산 발생.  

**해결:**  
- `if` 조건을 최적화하고, 로그인 검증을 별도의 메소드로 분리하여 유지보수성 향상.  

---  

### 🛠 **Bank v5.0 - 출금 기능 예외 처리 추가**  
**문제:**  
- 사용자가 출금 요청 시, 잔액이 부족해도 오류 메시지 없이 차감 진행됨.  
- 음수 잔액이 발생하는 버그 확인.  

**해결:**  
- `if (balance >= withdrawAmount)` 조건 추가하여 출금 가능 여부 검증.  
- 부족할 경우 `"잔액 부족"` 메시지를 출력하고, 출금이 진행되지 않도록 수정.  

---  

### 🛠 **Bank v6.0 - 기능별 클래스로 분리 중 참조 오류 발생**  
**문제:**  
- v6.0에서 기능별 클래스를 분리하면서, `Login`, `Deposit`, `Withdraw` 등의 클래스 간 데이터 공유 문제 발생.  
- 기존 1차원 배열에서 2차원 배열(`String[][] userData`)로 변경하는 과정에서,  
  일부 메소드에서 잘못된 인덱싱 오류 발생 (`IndexOutOfBoundsException`).  

**해결:**  
- 각 클래스의 메소드에 `userData` 배열을 **매개변수로 전달하는 방식**으로 수정.  
- `userData[i][3] = String.valueOf(money);` 형태로 데이터를 변환하여 올바르게 참조하도록 수정.  

---  

### 🛠 **Bank v7.1 - 인터페이스 적용 중 다형성 오류 발생**  
**문제:**  
- `Bank_Controller` 인터페이스를 도입하면서,  
  기존 `Bank7` 클래스와의 구조적 충돌 발생.  
- `메소드 오버라이딩` 시 `@Override` 어노테이션 누락으로 예상과 다른 동작 발생.  

**해결:**  
- 모든 기능 클래스를 `Bank_Controller` 인터페이스를 **구현(implements)** 하도록 변경.  
- `@Override` 어노테이션을 명확히 추가하여 상속 관계에서 정상 동작하도록 수정.  

---  

### 🛠 **Bank v7.2 - 로그인 로직 재구현 중 Scanner 리소스 누수**  
**문제:**  
- `Scanner` 객체를 여러 클래스에서 중복 생성하여 리소스 누수 발생.  
- 프로그램 종료 시 `Scanner`가 닫히지 않아 경고 메시지 발생.  

**해결:**  
- `Menu7` 클래스에서 `Scanner` 객체를 한 번만 생성하고,  
  각 기능별 클래스에서 **매개변수로 전달**하여 재사용하도록 변경 필요  
- 필요 시 `scanner.close();`를 명확히 호출하여 리소스 누수 방지 필요

---  
 
### 🛠 **Bank v7.3 - 유저 정보 저장 방식 변경 이슈**  
**문제:**
- v7.2에서는 유저 정보를 `정적배열`로 선언하여 관리했으나,  
  유저 정보를 유동적으로 저장 불가능, 특정 값 이상 저장 불가 

**해결:**  
- `동적배열`로 변경하여 유저정보를 더욱 더 유동적으로 저장할 수 있게 적용.  
- 기존 유저정보를 입력하고 삭제하는 방식 `add()`, `remove()` 사용

---  

### 🛠 **Bank v7.4 - 유저 정보 삭제 방식 변경 이슈**  
**문제:**
- 계정 삭제 시 `remove()`만 사용했지 null로 값까지 지우지는 않음

**해결:**  
- `remove()`선언 전 null로 값 다 삭제후 계정삭제

---  

### 🛠 **Bank v7.5 -유저 아이디 중복값 처리 이슈**  
**문제:**
- 회원가입시 기존에 존재하던 아이디랑 같아도 중복으로 회원가입이 됨

**해결:**  
- 현재 동적배열이 list라 따로 중복처리를 안하여 `if`문을 추가로 사용하여 아이디 중복 시 "중복된 아이디입니다" 출력 후 `return;`

---

### 🛠 **Bank v7.6 -유저 입력값 오류 처리 이슈**  
**문제:**
- 유저가 입력값을 제대로 입력 안할시 프로그램이 정상적으로 안돌아감

**해결:**  
- `thorws`와 `catch`로 해결

---  

### 🛠 **Bank v7.7 -유저끼리 송금 기능 추가**  
**문제:**
- 

**해결:**  
- 

---  

### 🛠 **Bank v7.8 -송금 시 id및 pw 확인**  
**문제:**
- 누구나 타인의 계좌로 송금 가능

**해결:**  
- 로그인 로직 활용하여 로그인 후 송금기능 가능하게 구현

---
---

# Bank 보안 테스트
**(테스트 환경: `bank v7.3`, 데이터는 배열에 저장, 자바만 사용, 콘솔에서 실행, 입력은 `next()`와 `nextInt()`로만 받음 / case 1 ~ 5)**  

---

## 1️⃣ 테스트 시나리오1: 주석문 입력을 통한 프로그램 무력화 시도  
### 원리  
- SQL 인젝션과 유사한 방식으로 입력값 조작 공격 시도  
- `//`, `/* */`, `// 값`, `/* 값 */` 등의 주석 기호를 입력하면 코드 실행이 중단될지 테스트  

### 테스트 결과  
- 주석 문법(`//`, `/* */`) 입력 시에도 문자열로 인식하여 프로그램 정상 실행  
- `// 값`, `/* 값 */` 입력 시에도 문자열 그대로 처리  

### 결론  
- 자바는 사용자가 입력한 값을 그대로 문자열로 인식하기 때문에 주석 공격이 불가능함  
- 하지만 이런 악의적인 입력을 기록하는 로그 시스템을 추후 추가하는 것이 바람직함  

---

## 2️⃣ 테스트 시나리오2: 지나치게 긴 입력값을 통한 프로그램 다운 시도  
### 원리  
- 입력값이 메모리가 감당하지 못할 정도로 길면 프로그램이 멈추거나 느려질 가능성이 있음  

### 테스트 결과  
- 테스트를 시도하지 못함 (컴퓨터가 멈출 가능성 있음)  

### 결론  
- 예외 처리를 통해 너무 긴 입력값을 제한하는 것이 필요  
- 입력 길이를 제한하는 코드 추가 예정  

---

## 3️⃣ 테스트 시나리오3: 입출금 시 Integer 오버플로우 발생 가능  
### 원리  
- 입금 시 `int`형 변수에 아주 큰 숫자를 입력하여 오버플로우 발생을 유도  
- `users.get(find).setBalance(users.get(find).getBalance() + amount);`  
- 입금할 금액: `2147483647` 입력  

### 테스트 결과  
- 잔액이 음수로 변환됨 (`2147483647 + 1 = -2147483648`)  
- 전재산 증발, 빚쟁이 상태 발생  

### 결론  
- 예외 처리를 추가하거나 `int`보다 큰 자료형을 사용해야 함  
- 하지만 데이터베이스로 전환할 예정이므로 현재는 수정하지 않음  

---

## 4️⃣ 테스트 시나리오4: 입출금 시 Integer 언더플로우 발생 가능  
### 원리  
- 입금 시 `int`형 변수에 아주 작은 숫자를 입력하여 언더플로우 발생을 유도  
- `users.get(find).setBalance(users.get(find).getBalance() + amount);`  
- 잔액: `-2147483647`, 입금할 금액: `-1`  

### 테스트 결과  
- 잔액이 양수로 변환됨 (`-2147483647 - 1 = 2147483648`)  
- 은행 파산  

### 결론  
- Integer 언더플로우 방지를 위한 예외 처리가 필요함  
- 하지만 수정하지 않을 예정, 방법만 정리  



---




