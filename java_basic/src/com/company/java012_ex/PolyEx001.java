package com.company.java012_ex;

/*Q1. 상속도 그리기
 
		Object
		  ↑
		 Papa
		  ↑
		 Son


Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
	Papa (int money, void sing())
	son (int money, void sing()) <- 오버라이딩해서 다르게 동작함

*/

class Papa extends Object {
	int money = 10000;

	public Papa() {super();}

	public void sing() {
		System.out.println("GOD-거짓말");
	}
}// end class

class Son extends Papa {
	
	int money = 1500;

	public Son() {super();}

	@Override
	public void sing() {
		System.out.println("빅뱅-거짓말");
	}
} // end class

public class PolyEx001 {
	public static void main(String[] args) {
		Papa mypapa = new Son();
		// Q3. Papa mypapa 의미? > Papa 타입의 변수 mypapa가 Son 객체를 참조
		// Q4. 인스턴스화한 실제 메모리 빌려온그림 > 날 좋을 때 그리는걸로..
		System.out.println(mypapa.money); // Q5. 출력 > 10000
		mypapa.sing(); // Q6. 출력 > 빅뱅- 거짓말
		// Q7. mypapa.money 를 이용해서 1500 출력되게 해주세요.
		System.out.println(((Son)mypapa).money);
	}
}