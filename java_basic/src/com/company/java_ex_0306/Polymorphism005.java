package com.company.java_ex_0306;

//Q1. 상속도 그리기 = Object ◁- Papa ◁- Son2
//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드 = Papa: 멤버변수 money, 멤버메서드 sing() / Son2: 멤버변수 money, 멤버메서드 sing()
// 멤버변수 > 힙 , 멤버함수 > 메서드

class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class

class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() {  System.out.println("빅뱅-거짓말"); }
} // end class
public class Polymorphism005 {
	public static void main(String[] args) {
		// Q8.  부모 =  자식 관계   /  업,다운캐스팅 선택 /  타입캐스팅 필요여부
		Papa mypapa = new Son2();    
		// Q3. Papa mypapa 의미? = Papa타입의 참조변수 mypapa는 Papa 또는 그 자식 클래스 객체를 참조할 수 있다. 
		// Q4. 인스턴스화한 실제 메모리 빌려온그림 = Son2 객체가 실제 메모리에서 할당된다.
		System.out.println(mypapa.money); // Q5.  출력    10000
		mypapa.sing();  //Q6. 출력   빅뱅 - 거짓말
		 //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.   
		System.out.println(((Son2) mypapa).money);
	}
}