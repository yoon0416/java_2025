package oopEx0310;

import java.util.Scanner;

public class Exception005 {
   
    public static int nextInt() throws java.util.InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1을 입력하세요");
        return sc.nextInt();  //InputMismatchException
    }

    public static void main(String[] args) {
        int one = 0;
        while (true) {
            try {
                one = nextInt();  // 예외가 발생할 수 있는 메서드 호출
                if (one == 1) {
                    break;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
            }
        }
    }
}
