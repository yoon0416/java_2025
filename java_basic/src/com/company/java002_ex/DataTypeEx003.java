package com.company.java002_ex;
import java.util.Scanner;
public class DataTypeEx003 {

	public static void main(String[] args) {
		float f = 0.1f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("파이값을 입력하세요: ");
		f= sc.nextFloat();
		
		System.out.printf("파이값은 %f 입니다",f);

	} //end psvm

} //end class
