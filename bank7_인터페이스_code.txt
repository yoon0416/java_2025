package bank;
// 인터페이스가 적용이 안된 bank7 버전 참고
// 수정해야할 것: 그그그그그그그그극그그그그극그 아 동적배열 해야함, 아 맞다마잦담ㄷ잗ㅁ잗ㅁ잠ㄷ자 로그인로직
// 동적배열 사용시 : case 1(회원가입) add()사용, case 2(조회) 향상된 for문 사용하면 get필요없다고 함, case 5 삭제 remove , case 3,4 setBalance()로 값수정하면 됨

/*동적배열 적용시 아마 이렇게 될 거 같음
인터페이스에서 선언한 void exec(Bank_v7[] users); 메서드의 파라미터를 동적배열로 바꿈
Menu7 클래스의 users를 ArrayList로 변경

case 1: 회원가입은 add()사용
case 2: 조회는 향상된 for문 쓰면 get() 필요한가? 필요없을 거 같은디 동적배열 타입의 user값 돌리고 거기서 if문을 사용하여 아디 비번 맞는경우 출력 return 사용해서 for문 탈출하면 될 거 같음 
case 3~4: 계좌 입출금은 세터값 바꿔 저장 후 게터로 값 불러오면 됨 add()사용 안함 
case 5: 계좌삭제는 remove 이거 사용 시 동적배열에는 null값이 없기ㅣ 때문에 if로 null일경우 굳이 안써도 됨

※ List, Map 둘 중 뭐가 더 어울릴까??
> 값 많아지면 성능면에선 Map 유리
> 회원가입 순서가 중요하다면 List 유리
> 중복값 허용 안할거면 Map 유리 if(users.containsKey(id)){}else{값넣기}
> 데이터를 추가하거나 수정하는 것이 간단 List 유리
> 결론 나중에 프로젝트나 이런 구조 같은 경우는 map이 유리한거 같음


> 

*/
import java.util.Scanner;

//Bank_v7 클래스: 사용자 정보를 저장하는 모델 클래스
class Bank_v7 { //dto 
 private String id;
 private String pass;
 private int balance;
 static String company = "(주)회사";

 public String getId() { return id; }
 public void setId(String id) { this.id = id; }

 public String getPass() { return pass; }
 public void setPass(String pass) { this.pass = pass; }

 public int getBalance() { return balance; }
 public void setBalance(int balance) { this.balance = balance; }

 public static String getCompany() { return company; }
 public static void setCompany(String company) { Bank_v7.company = company; }
} //end class


//Bank_Controller 인터페이스: 모든 기능 클래스들이 이 인터페이스를 구현
interface Bank_Controller {
	
 void exec(Bank_v7[] users);  // 각 기능별로 exec 메서드를 구현
 
} //end class

//-------------------------------------------------------------------------------------------------------------------


//Input 클래스: 사용자 정보 입력
class Input implements Bank_Controller {
 @Override
 public void exec(Bank_v7[] users) {
     Scanner sc = new Scanner(System.in);
     System.out.println("아이디 입력 : ");
     String id = sc.next();
     System.out.println("비밀번호 입력 : ");
     String pass = sc.next();
     System.out.println("잔액 입력 : ");
     int balance = sc.nextInt();

     for (int i = 0; i < users.length; i++) {
         if (users[i] == null) {
             users[i] = new Bank_v7();
             users[i].setId(id);
             users[i].setPass(pass);
             users[i].setBalance(balance);
             System.out.println("회원가입이 완료되었습니다.");
             break;
         }
     }
 }
} //end class

//Show 클래스: 사용자 정보 조회
class Show implements Bank_Controller {
 @Override
 public void exec(Bank_v7[] users) { 
     Scanner sc = new Scanner(System.in);
     System.out.println("아이디 입력 : ");
     String id = sc.next();
     System.out.println("비밀번호 입력 : ");
     String pass = sc.next();

     for (Bank_v7 user : users) {
         if (user != null && user.getId().equals(id) && user.getPass().equals(pass)) { //로그인로직 구현해야겠다잉
             System.out.println("아이디: " + user.getId());
             System.out.println("비밀번호: " + user.getPass());
             System.out.println("잔액: " + user.getBalance());
             return;
         }
     }
     System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
 }
} //end class

//Deposit 클래스: 입금 처리
class Deposit implements Bank_Controller {
 @Override
 public void exec(Bank_v7[] users) {
     Scanner sc = new Scanner(System.in);
     System.out.println("아이디 입력 : ");
     String id = sc.next();
     System.out.println("비밀번호 입력 : ");
     String pass = sc.next();

     for (Bank_v7 user : users) {
         if (user != null && user.getId().equals(id) && user.getPass().equals(pass)) {
             System.out.println("입금할 금액 : ");
             int amount = sc.nextInt();
             user.setBalance(user.getBalance() + amount);
             System.out.println("입금 완료! 현재 잔액: " + user.getBalance());
             return;
         }
     }
     System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
 }
} //end class

//Withdraw 클래스: 출금 처리
class Withdraw implements Bank_Controller {
 @Override
 public void exec(Bank_v7[] users) {
     Scanner sc = new Scanner(System.in);
     System.out.println("아이디 입력 : ");
     String id = sc.next();
     System.out.println("비밀번호 입력 : ");
     String pass = sc.next();

     for (Bank_v7 user : users) {
         if (user != null && user.getId().equals(id) && user.getPass().equals(pass)) {
             System.out.println("출금할 금액 : ");
             int amount = sc.nextInt();
             if (user.getBalance() >= amount) {
                 user.setBalance(user.getBalance() - amount);
                 System.out.println("출금 완료! 현재 잔액: " + user.getBalance());
             } else {
                 System.out.println("잔액이 부족합니다.");
             }
             return;
         }
     }
     System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
 }
} //end class

//Delete 클래스: 계좌 삭제
class Delete implements Bank_Controller {
	 @Override
	 public void exec(Bank_v7[] users) {
	     Scanner sc = new Scanner(System.in);
	     System.out.println("아이디 입력 : ");
	     String id = sc.next();
	     System.out.println("비밀번호 입력 : ");
	     String pass = sc.next();

	     for (int i = 0; i < users.length; i++) {
	         if (users[i] != null && users[i].getId().equals(id) && users[i].getPass().equals(pass)) {
	             System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
	             String confirm = sc.next();
	             if (confirm.equalsIgnoreCase("Y")) {
	                 users[i] = null;
	                 System.out.println("계좌 삭제 완료.");
	             } else {
	                 System.out.println("계좌 삭제가 취소되었습니다.");
	                 break;
	             }
	             return;
	         }
	     }
	     System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
	 }
	} //end class

//Menu7 클래스: 메뉴 출력 및 기능 실행
class Menu7 {
 private Bank_v7[] users;
 private Bank_Controller[] process;

 public Menu7() {
     users = new Bank_v7[3]; // 이거 동적배열로 바꾸면 되는건가? 만들면 여태 사용자 정보 추가하는것들 add로 하는건가? 삭제는 remove쓰고?
     						//그럼 Bank_v7[] 파라미터 타입으로 한건 다 바꿔야하나???????????????????????????????
     process = new Bank_Controller[] { new Input(), new Show(), new Deposit(), new Withdraw(), new Delete() };
 }

 public void exec() {
     Scanner sc = new Scanner(System.in);
     while (true) {
         System.out.println("\n"+Bank_v7.company);
         System.out.println("===== 메뉴 =====");
         System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");
         int choice = sc.nextInt();

         if (choice == 9) {
             System.out.println("프로그램을 종료합니다.");
             break;
         }
         if (choice >= 1 && choice <= 5) {
             process[choice - 1].exec(users);
         } else {
             System.out.println("잘못된 입력입니다.");
         }
     }
 }
} //end class

public class Bank_Interface {
 public static void main(String[] args) {
     Menu7 menu = new Menu7();
     menu.exec();
 }//psvm
} //end class



/*
ㅁ 주어진옵션 (1)
///////////////////////
class Bank_v7 {
   // 멤버변수
   private String id;
   private String pass;
   private double balance;
   static String Company = "(주)회사";
}


ㅁ 주어진옵션 (2)
   // 기능클래스 (배열 처리기능)
   interface Bank_Controller {
      void exec(Bank_v7[] users);
   }
   
               Bank_Controller
   ↑          ↑          ↑          ↑          ↑
   Input      Show      Deposit      Withdraw   Delete   
   입력클래스    조회클래스      입력클래스      출금클래스      삭제클래스
    
ㅁ 주어진옵션 (3)
   메뉴판클래스     
   class Menu7 {
      Bank_v7[] users;
   } 

ㅁ 주어진옵션 (4) 
   public class Mini_Bank014_class007_interface2 {
      public static void main(String[] args) {
         Menu7 menu = new Menu7();
         menu.exec();
      }
   }
    
*/