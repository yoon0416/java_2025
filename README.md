### 업그레이드 해야 할 프로젝트
1. Bank 미니 프로젝트 전역변수 > 정적배열(지금버전) > 동적배열 > DB 이 외 업그레이드 필요한거 있을 시 메모
2. 인적관리 프로젝트 전역변수 > 정적배열(지금버전) > 동적배열 > DB 이 외 업그레이드 필요한거 있을 시 메모

### 프로그램 구현 및 업그레이드 할 때마다 구현 영상찍고 유튜브에 올려서 기록 남기기!!!!!!
### 기존에 알던 프로그래밍 지식들은 굳이 메모 안함 새로운 정보 습득시 메모하기 

#### 1. 2025 - 02 - 17
1. welcome !
2. git (로컬저장소 - 원격저장소)
3. java (설치, eclipse)

---
### 2. 2025 - 02 - 18
1. 자료형 종류
2. 입력문
3. 프로젝트 2개 (은행시스템, 인적관리(일부분))

---
### 3. 2025 - 02 - 19
1.Bank 미니 프로젝트 수정

ㄴ전역변수로 메모리 과하게 쓰는거 배열로 수정, 반복되는 코드(중복된 코드 로그인 과정)들 if문으로 코드 줄이기

ㄴ다음에는 메소드로 수정해볼 예정


2.인적관리 미니프로젝트 수정

ㄴ학사일정 파트 제외하고 전부 다 구현완료

ㄴ수정할 것 : 전역변수를 배열로 만들어 메모리 아끼기, 중복된 코드 삭제, 학사일정 캘린더를 사용하여 구현하기


3.항공편 예약시스템 구조만들기

---
### 3. 2025 - 02 - 20
1.인적관리 미니프로젝트 수정

ㄴ 기존에는 전역변수로 입력받은 값을 넣어서 보관했지만 메모리관리를 위해 배열로 선언 후 값 넣는 방식으로 수정함
> 다음에는 동적배열이나 DB로 해볼 예정

ㄴ while문 안에 switch안에 if안에 for안에 이런식으로 되어 있으니 습관처럼 break 계속 쓰다가 원하는 값이 안나왔음 - 수정완료

ㄴ 실수 했던 것: 
1. break 남발로 인하여 배열에 학생 정보가 인덱스 0번에만 들어가고 나머지에는 안들어감, 값을 추가로 넣을 시 기존 값이 삭제되고 대입됨 처음에는 배열선언할 때 초기값을 안줘서 그런 줄 알고 0 or null값을 주었지만 나중에는 break가 문제였단걸 앎
2. 전체적인 코드를 짤 때 좀 더 코드 흐름을 생각하고 작성해야겠음 코드 리뷰해서 수정할 때 뭐가 잘못된건지 어디에서 실행이 안되는건지 한눈에 안들어옴.
3. for(int i = 0, i<3 i++)으로 배열안에서 맞는 값을 찾아와야하는데 자꾸 까먹음

** 수정할 것: 

1.교수번호 (년도 - 4자리수)로 나오게 수정 / 02.20.14:20 (수정완료)

** 추가할 것: 

1.아이디 및 비밀번호 찾기 기능 / (02.20 13:15 구현완료)  

2.case 5에 해당하는 학사일정 달력 만들기


