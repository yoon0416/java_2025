package com.company.java019;

import java.util.Scanner;

class Count1 extends Thread{
	@Override public void run() {
		for(int i = 10; i>0; i--) {
			System.out.println(i); 
			try { Thread.sleep(1000); } catch (InterruptedException e) { break; } //e.printStackTrace()
		}
	}
}

public class Thread004_interrupt {

	public static void main(String[] args) {
		Thread count = new Count1(); count.start();
		
		Scanner sc = new Scanner(System.in);
		if(sc.next().equals("y")) {
			System.out.println("count를 멈춥니다.");
//			count.stop();
			count.interrupt();
		}
		System.out.println("> main end...");

	}

}
