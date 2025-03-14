package com.company.java019;
//😺  😼 🐈
//1. 프로세스 : 실행중 프로그램
//2. 프로세스 : 자원+Tread (작업수행)
//3. 작업수행클래스 1) 상속, Runnable    2) run() 해야할 일   3) start() 실행

class Animal{}
//class CatSound extends Animal{}
class CatSound implements Runnable{
	@Override public void run() {
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		for(int i=0; i<5; i++) {
			System.out.print(" 야옹야옹 ");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
}//end CatSound




public class Thread003_Runnable {

	public static void main(String[] args) {
		
		Thread sound = new Thread(new CatSound()); sound.start(); 
		
		Thread count = new Thread(new Runnable() {
			@Override public void run() {
				try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
				for(int i = 0; i<5; i++) {
					System.out.println((i+1)+"마리");
					try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
				}
			}
			}); count.start();
		
		try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
		for(int i = 0; i<5; i++) {
			System.out.print("  😺 😼 🐈  ");
			try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		}

	}

}
