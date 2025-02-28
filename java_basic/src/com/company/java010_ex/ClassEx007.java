package com.company.java010_ex;
import java.util.Scanner;

class Calc {
	//멤버변수
    int num1, num2;
    char op;
    double result;
    boolean sksnrl = false; //프린트문 귀찮아서 이거씀

    void input() throws Exception{ //입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요1 > ");
        num1 = sc.nextInt();
        System.out.println("숫자를 입력하세요2 > ");
        num2 = sc.nextInt();
        System.out.println("연산자를 입력하세요: ");
        op = sc.next().charAt(0);
    }
    
    //멤버함수
    void opcalc() { //+더하기계산, -라면 -계산, *라면 *계산, /라면 /계산
        switch (op) {
            case '+': 
                result = num1 + num2; 
                break;

            case '-': 
                result = num1 - num2; 
                break;

            case '*': 
                result = num1 * num2; 
                break;

            case '/': 
//            	if(num1 == 0 || num2 == 0) { //이거 안하니까 뭐 결과값이 인피니티였나 그거 뜸 > 10 / 0 = 인피니티? 뭐였지 뭐 뜸 아무튼
//            		result = 0;
//            	}
//            	else{
            	result = (double) num1 / (double) num2;
                sksnrl = true;
//                }
                break;

            default: 
                System.out.println("제대로 된 연산자를 입력하슈");
                break;
        }
    }

    void show() { //연산출력  
        opcalc();
       
        if (sksnrl == true) {
            System.out.printf("%d %c %d = %.2f\n", num1, op, num2, result);
        } else {
            System.out.printf("%d %c %d = %.0f\n", num1, op, num2, result);
        }
    }//end 메서드

    public Calc() { //기본생성자
        super();
    }

    public Calc(int num1, int num2, char op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    } //end 생성자
    
}//end class

public class ClassEx007 {
    public static void main(String[] args) {
    	
        Calc c1 = new Calc(10, 3, '+');  
        c1.show();

        
        Calc c2 = new Calc();  
        try { //예외처리
			c2.input(); c2.show(); 
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("입력 오류");
		}   
          
    } //end psvm
} //end clsss

/*
 try {

//예외발생할 가능성이 있는 문장 
    
}catch(Exception1 e1) {

 //Exception1이 발생했을 경우, 이를 처리하지 위한 문장적는다.
 //보통 이곳에 예외메세지를 출력하고 로그로 남김.
 
}catch(Exception2 e2) {

 //Exception2이 발생했을 경우, 이를 처리하지 위한 문장적는다.
 
}catch(ExceptionN eN) {

 //ExceptionN이 발생했을 경우, 이를 처리하지 위한 문장적는다.
 
}finally{

//예외발생여부에 관계없이 상항 수행되어야 하는 문장적는다.

}
 */


