package com.company.java004;

import java.util.Scanner;

public class IfEx003 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한개를 입력하슈");
		number = sc.nextInt();
		
		if(number==1) {
			System.out.println("one");
		}
		else if(number == 2) {
			System.out.println("two");
		}
		else if(number == 3) {
			System.out.println("three");
		}
		else {
			System.out.println("1,2,3이 아니다");
		}
	}

}
