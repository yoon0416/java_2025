package com.company.java019_ex;

import java.util.Scanner;

import javax.swing.JOptionPane;


//10부터 1까지 카운트 1초에 10, 2초에 9
class QuestionCount extends Thread{
	@Override public void run() {
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		for(int i=10; i>=1; i--) {
			System.out.println(">>>>>>>>>>"+i+"초 남았습니다.");
			try { Thread.sleep(1000); } catch (InterruptedException e) { break; }
		}
	}
}//class 



public class ThreadEx001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Thread count = new QuestionCount();
		
		count.start(); //이거 한번만 불러올 수 있음 반복문에 넣으면 에러 바로 뜸
		while(true) {
			String answer = JOptionPane.showInputDialog("사과 알파벳을 입력하세요");
			
			if(answer.equals("apple") || answer.equals("APPLE")) {
				System.out.println("정답입니당!");
				count.interrupt();
				break;
			}
			else {System.out.println("정답이 아닙니다.");
			}
			
		}
	}//end psvm

}//end class
