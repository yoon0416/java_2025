package com.company.java008_ex;
//import java.math.*;

import java.util.Random;

public class Method003 {
	static Random random = new Random();
	public static String sign() {return "sally";}
	
	public static int num() {return random.nextInt(100);}
	
//	public static int num() {return (int)(Math.random()*45);}
	
	public static double pie() {return 3.141592;}
	
	public static String hello(String a) {return "안녕 "+a;}
	
	
	public static void main(String[] args) {
		// public static 리턴값 메서드명(파라미터){}
		//public static sally sign() {return "sally";}
		System.out.println("당신의 이름은? "+sign());
		//                  당신의 이름은? sally
		
		//4개 더 기본
		int yournum = num();
		System.out.println("랜덤숫자 : "+yournum);
		
		System.out.printf("파이값? %.2f \n",pie());
		
		System.out.println(hello("sally"));
		System.out.println(hello("alpha"));
		
		
	}//end psvm

} //end class
