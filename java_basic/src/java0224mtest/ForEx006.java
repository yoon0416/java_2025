package java0224mtest;
import java.util.Scanner;
public class ForEx006 {

	public static void main(String[] args) {
		//변수 선언
		int input1=-1,input2=-1;
		double result=0;
		Scanner sc = new Scanner(System.in);
		char input3=' ';
		
		/*
		 while(true){
		    //잘 못쓰면if(input1 < 0 || input1 > 100) {//정수1 입력받기 입력받기 =continue}
		    //잘 못쓰면if(input2 < 0 || input2 > 100) {//정수2 입력받기 입력받기 =continue}
		 }
		  */
		
		//입력
		while(true) {
			if(input1 < 0 || input1 > 100) {
				System.out.println("정수 하나를 입력하세요1");
				input1 = sc.nextInt();
				System.out.println("1부터 100사이 정수를 입력하세유");
				continue;
				}
			

			if(input2 < 0 || input2 > 100) {
				System.out.println("정수 하나를 입력하세요2");
				input2 = sc.nextInt();
				System.out.println("1부터 100사이 정수를 입력하세유");
				continue;
				}
			
			
			System.out.println("연산자 하나를 입력하세요");
			input3 = sc.next().charAt(0);

			if (input3 != '+' && input3 != '-' && input3 != '*' && input3 != '/') {
			    System.out.println("올바른 연산자를 입력해주세요.");
			    continue;  // 올바른 연산자를 입력할 때까지 계속 반복
			}
			
			break; //없으면 무한반복 빠져나가지 못해서 뒤에 다 에러뜸
			
		} //end while
		
		//처리
		if(input3 == '+') {
            result = input1 + input2;
        } 
        else if(input3 == '-') {
            result = input1 - input2;
        }
        else if(input3 == '*') {
            result = input1 * input2;
        }
        else if(input3 == '/') {
            result = input1 / (double)input2;
           
        }
        else {
        	System.out.println("똑바로 연산자 입력");
        	
        }
		//출력
		System.out.println(""+input1+input3+input2+"="+(input2 != '/' ? ""+(int)result : String.format("%.2f", result)));
		
		
	} //end psvm

} //end class
