package com.company.java019;

import java.awt.Toolkit;

//1. 프로세스 : 실행중 프로그램
//2. 프로세스 : 자원+Tread (작업수행)
//3. 작업수행클래스 1) 상속, Runnable    2) run() 해야할 일   3) start() 실행

class PigSound extends Thread{ //#1. 상속 Thread

	@Override
	public void run() {	//#2. run 해야할일
//		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); } 
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.println("꿀꿀");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}//end run()
	
}//end

class Count extends Thread{
	@Override public void run() {
//		try { Thread.sleep(20); } catch (InterruptedException e) { e.printStackTrace(); } 
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"마리");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}//end run();
}//end class



public class Thread002 {

	public static void main(String[] args) { // 1개의 스레드
		// 여러가지 일을 동시에
		// 🐷 5번
		//작업스레드 ##3단계
		Thread sound = new PigSound(); sound.start();
		Thread count = new Count(); count.start();
		
		//Thread sound = new PigSound(); sound.start();
		for(int i=0; i<5; i++) {
			System.out.print(" 🐷   ");
			try { Thread.sleep(1000); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
		
	}//end main

}//end class
