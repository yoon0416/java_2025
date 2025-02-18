package com.company.java002_ex;
import java.util.Scanner;

public class DataTypeEx002 {

	public static void main(String[] args) {
		int like;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좋아하는 수를 입력하세요 > ");
		like = sc.nextInt();
		System.out.printf("좋아하는 숫자는 %d입니다",like);
	}

}
