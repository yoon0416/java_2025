package com.company.java019;

//1. 프로세스 - 실행중인 프로그램
//2. 프로세스 - 자원 + Thread(실제작업)
//Synchronized

//#1. 공유작업
class Rank{
	int num=0;
	public synchronized void plusnum() {
		int rank=num;
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		num=rank+1; //등수 올리기
	}
}

class User extends Thread{
	Rank rank; //각 유저마다 몇등이야.
	public User(Rank rank) {this.rank=rank;}
	@Override public void run() {
		rank.plusnum(); //등수올리기
		System.out.println(rank.num+"번 >> "+super.getName()); // Thread
	}
	
	public User() {}
}//end class


public class Thread005_synchronized {

	public static void main(String[] args) {
		Rank rank = new Rank(); // 공유자원  num=1, num=2, 등수
		
		Thread user1 = new User(rank); user1.setName("sally"); user1.start(); //몇번째
		
		try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
		
		Thread user2 = new User(rank); user2.setName("alpha"); user2.start();

	}

}

/*
 
 			user1    #1	→   [rank : num]   ←  #2   user2 
 				동시에 접근해서 서로 1나온거임
 				#3출력
 
 */






