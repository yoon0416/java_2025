package com.company.java009;

import java.util.Arrays;

public class Method005 {
	
	public static void show(int a) {
		System.out.println(a*10);
	}
	
	public static void show(int a,int b,int c) {
		System.out.println(a*100+ b*100+ b*100);
	}
	
	public static void show(int a[]) {
		System.out.println("1. 메서드 주소값 : "+System.identityHashCode(a));
		System.out.println(a[0]*10);
	}
	
	public static void main(String[] args) {
	int a[] = {1,2,3};	
	show(a[0]); //10출력되게
	show(a[0],a[1],a[2]); //10,200,300 출력되게
	show(a); //10출력되게
	System.out.println("1. 배열값 : "+ Arrays.toString(a));
	System.out.println("2. 메인의 주소값 : "+System.identityHashCode(a));
	show(a);
	
	}//end psvm

} //end class
// 메인과 메소드의 주소값은 같다