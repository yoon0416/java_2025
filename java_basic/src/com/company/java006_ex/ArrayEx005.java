package com.company.java006_ex;

public class ArrayEx005 {

	public static void main(String[] args) {
		char ch[] = { 'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int count1 = 0;
		int count2 = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(ch[i] >='a' && ch[i]<='z') { //소문자 찾기
				count1++;
			}
			
			else if(ch[i] >='A' && ch[i]<='Z') { //대문자 찾기
				count2++;
			}
		} //end for
		System.out.print("대문자는 "+count2+"개 \n"+"소문자는 "+count1+"개");
		
		
	} //end psvm

} //end class
