1. **프로세스** : 실행중인 하나의 프로그램
2. **멀티프로세스** : 동시에 여러 프로세스를 실행
   - 크롬 → 실행 프로세스 1
     -  → 실행 프로세스 2
       - → 실행 프로세스 3
3. **구성**
   - 자원( Resourece ) + Thread( 자원으로 실제작업을 수행 )
   - 모든 프로세스는 최소한 하나의 쓰레드를 가지고 있음 (main)
   - 같은 프로세스 내의 쓰레드들은 서로 자원을 공유
4. 동시성과 병렬성
   - 동시에 실행하는 것 같은 효과 (동시성과 병렬성)
   - **동시성** : 하나의 코어에서 멀티스레드가 번갈아가면서 실행
     - 1명일꾼 : 1작업 → 2작업 → 3작업 (작업수 > 일꾼수: 코어수)
   - **병렬성** : 멀티코어에서 개별스레드를 동시에 실행 (작업수 < 일꾼수: 코어수)
  
5. 작업스레드 생성방법
   - 1) Thread 상속
     2) Runnable 인터페이슥 구현
