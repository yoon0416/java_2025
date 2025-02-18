package com.company.java002_ex;
import java.util.Scanner;

public class DataTypeEx004 {

	public static void main(String[] args) {
		float k,e,m,aver,total = 0.0f;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요. > ");
		k = sc.nextFloat();
		System.out.println("영어 점수를 입력하세요. > ");
		e = sc.nextFloat();
		System.out.println("수학 점수를 입력하세요. > ");
		m = sc.nextFloat();
		
		total = k+e+m; //총합 = 국+영+수
		aver = total/3; //평균 = 총합/3
		
		System.out.printf("총점: %.0f \n평균: %.2f",total,aver);
		sc.close();
	}

}
