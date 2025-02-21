package com.company.java004;

import java.util.Scanner;

public class IfEx007 {

    public static void main(String[] args) {
        double num = 0, num2 = 0;
        char hap = ' ';
        Scanner sc = new Scanner(System.in);
        
        System.out.println("정수 하나를 입력해주쇼");
        num = sc.nextDouble();
        System.out.println("정수 하나를 입력해주쇼");
        num2 = sc.nextDouble();
        System.out.println("연산자 넣어라");
        hap = sc.next().charAt(0); 
        
        if(hap == '+') {
            System.out.printf("%.0f %s %.0f = %.0f", num, hap, num2, num + num2);
        } 
        else if(hap == '-') {
            System.out.printf("%.0f %s %.0f = %.0f", num, hap, num2, num - num2);
        }
        else if(hap == '*') {
        	System.out.printf("%.0f %s %.0f = %.0f",num,hap,num2,num*num2);
        }
        else if(hap == '/') {
        	System.out.printf("%.0f %s %.0f = %.2f",num,hap,num2,num/num2);
        }
    }
}
