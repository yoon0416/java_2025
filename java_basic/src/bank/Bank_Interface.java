package bank;
// 인터페이스가 적용이 안된 bank7 버전 참고
// 수정해야할 것: 그그그그그그그그극그그그그극그 아 동적배열 해야함, 아 맞다마잦담ㄷ잗ㅁ잗ㅁ잠ㄷ자 로그인로직
// 동적배열 사용시 : case 1(회원가입) add()사용, case 2(조회) 향상된 for문 사용하면 get필요없다고 함, case 5 삭제 remove , case 3,4 setBalance()로 값수정하면 됨

import java.util.Arrays;
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

// find = -1 이 부분 삭제 후 향상된 for문 사용 return user; 값 찾을 땐 user.get뭐시기 처럼 간단하게 해보기
> 

*/
import java.util.Scanner;

//Bank_v7 클래스: 사용자 정보를 저장하는 모델 클래스
class Bank_v7 { // dto
	private String id;
	private String pass;
	private int balance;
	static String company = "(주)회사";

	@Override public String toString() { return "Bank_v7 [id=" + id + ", pass=" + pass + ", balance=" + balance + "]"; }
	public String getId() { return id; }  public void setId(String id) { this.id = id; }
	public String getPass() { return pass; }  public void setPass(String pass) { this.pass = pass; }
	public int getBalance() { return balance; }  public void setBalance(int balance) { this.balance = balance; }
	public static String getCompany() { return company; }  public static void setCompany(String company) { Bank_v7.company = company; }
} // end class

//Bank_Controller 인터페이스: 모든 기능 클래스들이 이 인터페이스를 구현
interface Bank_Controller {
	void exec(Bank_v7[] users); // 각 기능별로 exec 메서드를 구현
} // end class

//-------------------------------------------------------------------------------------------------------------------

//Input 클래스: 사용자 정보 입력
class Input implements Bank_Controller {
	@Override
	public void exec(Bank_v7[] users) {
		//변수
		Scanner sc = new Scanner(System.in);
		
		int find=-1; 
		//처리1
		for (int i = 0; i < users.length; i++) { if (users[i] == null) { find=i; break; } }
		if(find==-1) { System.out.println("다음기회에");  return;}
		//처리2
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pass = sc.next();
		System.out.println("잔액 입력 : ");
		int balance = sc.nextInt();
		
		users[find] = new Bank_v7();
		users[find].setId(id);
		users[find].setPass(pass);
		users[find].setBalance(balance);
		System.out.println("회원가입이 완료되었습니다.");  
	}
} // end class

class UserCheck{ //로그인 시도
	public int check(Bank_v7[] users) {
		int find=-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("비밀번호 입력 : ");
		String pass = sc.next();
		
		for (int i=0; i<users.length; i++) {
			
			if (users[i] != null && users[i].getId().equals(id) && users[i].getPass().equals(pass)) { 
				return i;
			} 
		}
		if(find ==-1) {System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");}
		return find;
	}
}//end class


//Show 클래스: 사용자 정보 조회
class Show implements Bank_Controller {
	@Override
	public void exec(Bank_v7[] users) {
		int find = new UserCheck().check(users);
		if(find !=-1) { 
					System.out.println("아이디: " + users[find].getId());
					System.out.println("비밀번호: " + users[find].getPass());
					System.out.println("잔액: " + users[find].getBalance());
		}//if 
	}// 기능메서드
} // end class

//Deposit 클래스: 입금 처리
class Deposit implements Bank_Controller {
	@Override
	public void exec(Bank_v7[] users) {
		Scanner sc = new Scanner(System.in);
		int find = new UserCheck().check(users);
		
		if (find != -1) {
			System.out.println("입금할 금액 : ");
			int amount = sc.nextInt();
			users[find].setBalance(users[find].getBalance() + amount);
			System.out.println("입금 완료! 현재 잔액: " + users[find].getBalance());
			return;
		}
		
	}//end 메서드
} // end class

//Withdraw 클래스: 출금 처리
class Withdraw implements Bank_Controller {
	@Override
	public void exec(Bank_v7[] users) {
		Scanner sc = new Scanner(System.in);

		int find = new UserCheck().check(users);

		if (find != -1) {
			System.out.println("출금할 금액 : ");
			int amount = sc.nextInt();
			if (users[find].getBalance() >= amount) {
				users[find].setBalance(users[find].getBalance() - amount);
				System.out.println("출금 완료! 현재 잔액: " + users[find].getBalance());
			} else {
				System.out.println("잔액이 부족합니다.");
			}

			return;
		}
	}
} // end class

//Delete 클래스: 계좌 삭제
class Delete implements Bank_Controller {
	@Override
	public void exec(Bank_v7[] users) {
		Scanner sc = new Scanner(System.in);
		int find = new UserCheck().check(users);

		if (find != -1) {
			System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
			String confirm = sc.next();
			if (confirm.equalsIgnoreCase("Y")) {
				users[find] = null;
				System.out.println("계좌 삭제 완료.");
			} else {
				System.out.println("계좌 삭제가 취소되었습니다.");

			}

			return;
		}
		
	}
} // end class

//Menu7 클래스: 메뉴 출력 및 기능 실행
class Menu7 {
	private Bank_v7[] users;
	// private ArrayList<Bank_v7>users;
	private Bank_Controller[] process;
	
	public Menu7() {
		users = new Bank_v7[3]; 
		process = new Bank_Controller[] { new Input(), new Show(), new Deposit(), new Withdraw(), new Delete() };

	}

	public void exec() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.println(Arrays.toString(users));
				System.out.println("\n" + Bank_v7.company);
				System.out.println("===== 메뉴 =====");
				System.out.println("* 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");

				if (!sc.hasNextInt()) { //  입력값이 숫자가 아니면
					System.out.println("잘못된 입력입니다. 숫자를 입력하세요.");
					sc.next(); // 잘못된 입력값을 소비하고 다시 반복문 실행
					continue;
				}

				int choice = sc.nextInt();

				if (choice == 9) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					return;
				}

				if (choice >= 1 && choice <= 5) {
					process[choice - 1].exec(users);
				} else {
					System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				}
			} catch (Exception e) { // 예외 발생 시
				System.out.println("오류가 발생했습니다. 다시 입력하세요.");
				sc.nextLine(); // 입력 버퍼 비우기
			}
		}
	}
}// end class

public class Bank_Interface {
	public static void main(String[] args) {
		Menu7 menu = new Menu7();
		menu.exec();
	}// psvm
} // end class


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
	  void exec(ArrayList<Bank_v7> users);   // ArrayList 버젼
	  void exec();  // DB버젼
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