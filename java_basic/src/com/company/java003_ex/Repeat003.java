package com.company.java003_ex;
import java.util.Scanner; //스캐너 쓸꺼임

public class Repeat003 {

	public static void main(String[] args) {
		double kor,eng,math,total,aver=0.0; //국영수 총합 평균 변수 선언
		Scanner sc = new Scanner(System.in); //새로운 스캐너 변수 sc 만들었다
		
		System.out.println("국어 점수를 입력하시오.");
		kor = sc.nextDouble(); 					//국어점수 입력받기
		System.out.println("영어 점수를 입력하시오.");
		eng = sc.nextDouble(); 					//영어점수 입력받기
		System.out.println("수학 점수를 입력하시오.");
		math = sc.nextDouble(); 				//수학점수 입력받기
		
		total = kor+eng+math; 		//총합
		aver = total/3; 			//평균
		
		System.out.printf("총점: %.0f \n평균: %.2f",total,aver); //.0f로 소수점 없애기, .2f로 소수점 2자리

	}

}
