package com.company.java004;
//숙제?
import java.util.Scanner;

public class IFEX0072 {

    public static void main(String[] args) {
        double num = 0, num2 = 0;
        char hap = ' ';
        double result = 0;  // 연산 결과를 저장할 변수
        Scanner sc = new Scanner(System.in);
        
        // 사용자로부터 숫자와 연산자 입력받기
        System.out.println("정수 하나를 입력해주쇼");
        num = sc.nextDouble();
        System.out.println("정수 하나를 입력해주쇼");
        num2 = sc.nextDouble();
        System.out.println("연산자 넣어라");
        hap = sc.next().charAt(0);

        // 연산 수행
        if(hap == '+') {
            result = num + num2;
        } 
        else if(hap == '-') {
            result = num - num2;
        }
        else if(hap == '*') {
            result = num * num2;
        }
        else if(hap == '/') {
            result = num / num2;
        }

        // 결과 출력
        System.out.printf("%.0f %c %.0f = %.2f", num, hap, num2, result);
    }
}
