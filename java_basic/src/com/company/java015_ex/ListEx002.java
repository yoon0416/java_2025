package com.company.java015_ex;

import java.util.ArrayList;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class ListEx002 {

	public static void main(String[] args) {
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1부터 3까지 숫자 하나를 입력하세요");
//		int inputnum = sc.nextInt();
//		
//		
//		switch(inputnum) {
//		case 1: System.out.println(numbers.get(0)); break;
//		case 2: System.out.println(numbers.get(1)); break;
//		case 3: System.out.println(numbers.get(2)); break;
//		
//		default : System.out.println("입력 똑바로");
//		
//		}
		
String userInput = JOptionPane.showInputDialog("1부터 3까지 숫자 하나를 입력하세요: ");
        
        try {
            // 기본적으로 문자열이라 인티저로 숫자로 변환
            int inputnum = Integer.parseInt(userInput);
            
            JOptionPane.showMessageDialog(null, numbers.get(inputnum-1));
            
        } catch (NumberFormatException NotNum) {
            // 숫자가 아닌 값을 입력했을 경우 처리
            JOptionPane.showMessageDialog(null, "잘못된 입력입니다. 숫자만 입력해주세요.");
        }
		
	}

}
