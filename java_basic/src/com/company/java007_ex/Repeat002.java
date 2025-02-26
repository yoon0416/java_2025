package com.company.java007_ex;

public class Repeat002 {

	public static void main(String[] args) {
		//for
		for(int i=100; i<=300; i+=100) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		//while
		int i =100;
		while(i<=300) {
			System.out.print(i+" ");
			i+=100;
		}
		
		System.out.println();
		i =100;
		
		do {
			System.out.print(i+" ");
			i+=100;
		}while(i<=300);
		
		
		

	} //end psvm

} //end class
