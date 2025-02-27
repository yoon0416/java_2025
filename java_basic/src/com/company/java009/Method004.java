package com.company.java009;

public class Method004 {
	
	public static void show(int a) {
		System.out.println(a*10);
	}
	
	public static void show(int a,int b,int c) {
		System.out.println(a*100+ b*100+ b*100);
	}
	
	public static void show(int a[]) {
		System.out.println(a[0]*10);
	}

	public static void main(String[] args) {
		int[] a = {1,2,3};
		
		show(a[0]); //10출력되게
		show(a[0],a[1],a[2]); //10,200,300 출력되게
		show(a); //10출력되게

	}

}
