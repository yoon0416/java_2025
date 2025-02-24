/*
1부터 10까지 3의 배수의 합: 3+6+9 = 18
 
*/
package com.company.java006_ex;

public class RepeatEx008 {

    public static void main(String[] args) {
        // for문
        int sum = 0; //3의 배수 합
        int count = 0; // 3의 배수를 셀 변수

        // 1부터 10까지 반복
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { // 3의 배수일 때
                sum += i; // 3의 배수를 더함
                count++;   // 3의 배수 개수 증가
                if (count > 1) { // 첫 번째 3의 배수 이후에는 "+" 출력
                    System.out.print(" + ");
                }
                System.out.print(i); // 3의 배수 출력
            }
        }

        System.out.println(" = " + sum); // 총합 출력     
        
        
        //------------------------------
        //while문
        sum = 0;
        int i = 1;
        while (i <= 10) {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("1부터 10까지 3의 배수의 합: " + sum);
        //------------------------
        //do while문
        sum = 0;
        i = 1;
        do {
            if (i % 3 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 10);
        System.out.println("1부터 10까지 3의 배수의 합: " + sum);
        

	}//end psvm

}//end class

