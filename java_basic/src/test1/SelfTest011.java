package test1;
import java.util.Scanner;
public class SelfTest011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 101;
		for(;;) {
			System.out.println("1부터 100사이 숫자 입력하면 빠져나감");
			num = sc.nextInt();
			
			if(num >=1 && num<=100) {
				break;
			}
			
		}//무한반복

	}//end psvm

}//end class

//[SelfTest011] for
//* 1~100사이를 입력할때까지 무한반복하기 
//* 만약 1~100사이를 입력하면 빠져나오기	