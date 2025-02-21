package com.company.java004;
import java.util.Scanner;
public class SwitchEx008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 3 6 9 12중 하나 ㄱ");
		
		int num = sc.nextInt();
		switch(num) {
		case 3:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		}

	}//end psvm

}//end class
