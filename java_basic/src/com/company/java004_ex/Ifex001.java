package com.company.java004_ex;
import java.util.Scanner;

public class Ifex001 {
	public static void main(String[] args) {
		int total,aver;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("평균을 입력하세요");
		aver = sc.nextInt();
		if(aver >= 60) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
