package com.company.java003_ex;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		char a = ' ';
		Scanner sc = new Scanner(System.in);
		
		System.out.println("대문자를 입력하세요.");
		a = sc.next().charAt(0);
		
//		a += 32;
		a= Character.toUpperCase(a); //
		System.out.println(a);

	}

}
