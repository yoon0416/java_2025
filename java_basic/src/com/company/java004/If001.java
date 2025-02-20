package com.company.java004;

public class If001 {

	public static void main(String[] args) {
		//1. if(1형식)
		int a = 5;
		System.out.println("1형식-조건을 무조건 읽음");
		//a가 0이라면 0이다 ==0
		//a가 1이라면 1이다. ==1
		if(a==0) {
			System.out.println("0이다\n");}
		if(a==1) {
			System.out.println("1이다\n");}
		//if else (2형식) else뒤에는 조건식이 못옴
		System.out.println("2형식- 맞다/틀리다");
		if(a==0) {
			System.out.println("0이다");
		}
		else {
			System.out.println("0이 아니다");
		}
		
		//if else if(다형식)
		//a가 1이라면 1이다.
		//a가 2라면 2다
		//a가 3이라면 3이다
		//a가 123이 아니다
		a=2;
		if(a==0) {System.out.println("0이다");}
		else if(a==1) {System.out.println("1이다");}
		else if(a==2) {System.out.println("2이다");}
		else if(a==3) {System.out.println("3이다");}
		else {System.out.println("a는 0,1,2,3이 아니다");}
		
	} //end psvm

} //end class
