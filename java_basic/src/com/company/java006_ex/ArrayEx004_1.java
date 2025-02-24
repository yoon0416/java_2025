package com.company.java006_ex;

public class ArrayEx004_1 {
	    public static void main(String[] args) {
	        char[] ch = {'B', 'a', 'n', 'a', 'n', 'a'};

	        // 배열의 각 문자를 순차적으로 처리
	        for (int i = 0; i < ch.length; i++) {
	            if (Character.isUpperCase(ch[i])) { //만약 문자형 ch[i]가 대문자라면
	                ch[i] = Character.toLowerCase(ch[i]);  // 대문자는 소문자로 변환
	            } 
	            else if (Character.isLowerCase(ch[i])) { //만약 소문자라면
	                ch[i] = Character.toUpperCase(ch[i]);  // 소문자는 대문자로 변환
	            }
	        }

	        // 변환된 배열
	        System.out.print("대소문자 변환: ");
	        for (char c : ch) { //확장 for문
	            System.out.print(c);
	        }
	    }
	
}
