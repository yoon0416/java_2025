package bankOOP;

import java.util.Scanner;

public class UserInput implements InputControl{
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public UserInfo input() {
		System.out.println("아이디 입력 : ");
        String Id = sc.next();
        System.out.println("비밀번호 입력 : ");
        String Pw = sc.next();
        System.out.println("나이 입력 : ");
        int Age = sc.nextInt();
        System.out.println("잔액 입력 : ");
        int Money = sc.nextInt();
		
        return new UserInfo(Id, Pw, Age, Money);
        
	}

}
//유저 데이터 입력 로직