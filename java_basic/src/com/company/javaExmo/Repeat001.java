package com.company.javaExmo;
import java.util.Scanner;

public class Repeat001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 하나를 입력하세요");
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("1이다");
		}
		else if (number == 2) {
			System.out.println("2이다");
		}
		else if (number == 3) {
			System.out.println("3이다");
		}
		
		
	}

}
