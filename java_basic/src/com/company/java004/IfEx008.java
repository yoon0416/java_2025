package com.company.java004;
import java.util.Scanner;
public class IfEx008 {
//숙제2
	public static void main(String[] args) {
		double num,kor, eng, math, total, aver;
		String jang =null, hap =null, abc = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요.");
		num = sc.nextDouble();
		System.out.println("국어점수 입력하세요.");
		kor = sc.nextDouble();
		System.out.println("수학점수 입력하세요.");
		math = sc.nextDouble();
		System.out.println("영어점수 입력하세요.");
		eng = sc.nextDouble();
		
		total = kor + math + eng;
		aver = total/3;
		
		if(aver >=60 && kor>=40 && math>=40 && eng>=40) {
			hap = "합격";
		}
		else {
			hap = "불합격"; //pass
		}
		
		if(aver >=95) {
			jang = "장학생"; //jang
		}
		else if(aver <=95) {
			jang = "장학생아니구요";
		}
		if(aver >=90) {
			abc = "수"; //level
		}
		else if(aver >=80) {
			abc = "우";
		}
		else if(aver >=70) {
			abc = "미";
		}
		else if(aver >=60) {
			abc = "양";
		}
		else {
			abc = "가";
		}
		
		System.out.println("============================================");
		System.out.println(" 학번 국어 영어  수학   총점 평균 합격여부 레벨 장학생");
		System.out.println("============================================");
		System.out.printf(" %.0f  %.0f  %.0f  %.0f  %.0f  %.2f  %s  %s  %s",num,kor,eng,math,total,aver,hap,abc,jang);
		
	} //end psvm

} //end class
//숙제 끝!