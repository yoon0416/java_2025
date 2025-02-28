package com.company.java010_ex;

class Coffee{
	String name; int price,num;
	
	
	public Coffee(String name,int num, int price){this.name=name; this.num = num; this.price=price;} //생성자 매개변수 <-  입력받은 값 대입

	public Coffee() {super();this.name="아메리카노"; this.num=1; this.price=2000;} //기본 생성자 만들고 기본값 넣고
	// 기본 생성자 : 매개변수도 없고 실행하는 내용도 없는 단순한 생성자

	void show() { //show() 메소드
		System.out.println("====커피");
		System.out.println("커피명: "+name);
		System.out.println("커피잔수: "+num);
		System.out.println("커피가격: "+price);
	}//커피정보출력
	
}//end coffee

public class ClassEx003 {

	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼",2,4000); // a1 객체 선언
		a1.show();
		Coffee a2 = new Coffee();
		a2.show();

	} //end psvm

} //end class
