package com.company.java018;

public class JavaIO006_String_StringBuffer {

	public static void main(String[] args) {
		//#1. String 문자열 누적
		String str = "ABC";							//1. str 주소 > 925858445
		System.out.println("1. str 주소 > "+System.identityHashCode(str));
		
		
		str+="D";									//2. str 주소 > 868693306
		System.out.println("2. str 주소 > "+System.identityHashCode(str));
	
		
		
		
		
		//#2. StringBuffer 문자열 누적
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");										//3.sb 주소 > ABC 1746572565
		System.out.println("3.sb 주소 > "+sb.toString()+" "+System.identityHashCode(sb));
		
		sb.append("D");											//4.sb 주소 > ABCD 1746572565
		System.out.println("4.sb 주소 > "+sb.toString()+" "+System.identityHashCode(sb));
		
		
		
	}//end psvm

}//end class
