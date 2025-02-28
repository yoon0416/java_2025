package com.company.java010;

//1. 클래스는 부품객체
//2. 특성 - 상태와 행위

class farm{
	//상태-멤버변수
	String name; //인스턴스 변수 -heap area - this, new O
	int age;//인스턴스 변수 -heap area
	static String FarmName="(주)동물농장"; //클래스 변수- method area, new X
	static int num = 10; //클래스변수
	//행위-멤버함수
	static void num_plus() { //클래스 메서드
		num++; //age++;
	}
	void show() {
		System.out.println("\n\n::::::::::::::::::::::::::::::::::");
		System.out.println("::회사명: "+farm.FarmName);
		System.out.println("::식구수: "+farm.num);
		System.out.println("::이름: "+this.name);
		System.out.println("::나이: "+this.age);
	}
	
}//end class

public class Class005_static {

	public static void main(String[] args) {
		System.out.println("Step1. 클래스변수 - static");
		System.out.println("회사명: "+farm.FarmName);
		farm.num_plus();
		System.out.println("식구수: "+farm.num);
//		System.out.println("인스턴스 이름: "+Farm.name); Farm.num_plus();
		
		System.out.println("\n\nStep2. 인스턴스변수 - this-각각");
		farm cat = new farm(); cat.name="우주"; cat.age=10; cat.show();
//		cat.FarmName=""; cat.num=13; cat.num_plus();
	    farm dog = new farm(); dog.name="멍"; dog.age=3; dog.show();
	
	
	} //end psvm

}//end class

/*
------------------------------- runtime 
[method]
---------------------------------------------
[heap]               | [stack]
---------------------------------------------
*/
