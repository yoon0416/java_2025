package com.company.java006;

public class Repeat002_while_dowhile {

	public static void main(String[] args) {
		//1.for (반복횟수를 알 때)
		for(int i=1; i<=3; i++) {
			System.out.print(i+"=\t");
		}
		//2. while (반복횟수를 모를 때)
		
		System.out.println("");
		
		int i = 1;
		while(i<=3) {
			System.out.print(i+"=\t");
			i++;
			}
		System.out.println("");

		//3. do while (무조건 한번은 실행해야할 때)
		i = 1;
		do{
			System.out.print(i+"=\t");
			i++;
			}
		while(i<=3) ;
		
		
		
		
	} //end psvm

} //end class
