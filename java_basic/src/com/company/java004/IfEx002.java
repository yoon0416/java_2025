package com.company.java004;

import java.util.Scanner;

public class IfEx002 {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한개를 입력하슈");
		number = sc.nextInt();
		if(number>0) {
			System.out.println("양수");
		}
		else if(number < 0) {
			System.out.println("음수");
		}
		else if(number == 0) {
			System.out.println("zero");
		}
	}

}
