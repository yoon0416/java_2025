package test1;
import java.util.Scanner;
public class SelfTest013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단을 입력하세요");
		int dan = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
		
	}

}

/*
for 응용
	원하는 단을 입력하세요 _예) 2단
	2*1 =2
	2*2 =4 ...
*/