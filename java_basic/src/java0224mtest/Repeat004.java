package java0224mtest;
import java.util.Scanner;

public class Repeat004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = -1;
        // 무한 반복 시작
        while (input != 1) {
            System.out.print("숫자를 입력하세요 (1을 입력하면 종료): ");
             scanner.nextInt();
        }
          // 입력값이 1이면 반복 종료
            if (input == 1) {
                System.out.println("프로그램을 종료합니다.");
         
            }
        scanner.close();
    }
}
