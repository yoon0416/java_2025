package com.company.java013;

 //일반클래스 + 설계

abstract class Animal{
	String name; int age;
	abstract void eat(); //추상메서드가 있으면 반드시 추상클래스로 만들어줘야함.
	abstract void sleep(); //추상메서드는 {} 구현부가 없음 - 공통의 속성, 구체적인 내용은 상속받은 자식에서
	abstract void poo(); //추상화, 일반화, 설계 : 공통적인 속성, 행동
	
} //end abstract animal.class

class Cat extends Animal{ 

	@Override
	void eat() {System.out.println(super.name+"고양이 냠냠");}

	@Override
	void sleep() {System.out.println(super.name+"고양이 코!");}

	@Override
	void poo() {System.out.println(super.name+"고양이 시원!");}
	
}

class Dog extends Animal{ 

	@Override
	void eat() {System.out.println(super.name+"강아지 냠냠");}

	@Override
	void sleep() {System.out.println(super.name+"강아지 코!");}

	@Override
	void poo() {System.out.println(super.name+"강아지 시원!");}
	
}

class Person extends Animal{ 

	@Override
	void eat() {System.out.println(super.name+"사람 냠냠");}

	@Override
	void sleep() {System.out.println(super.name+"사람 코!");}

	@Override
	void poo() {System.out.println(super.name+"사람 시원!");}
	
}



public class Abstract_001 {

	public static void main(String[] args) {
		//1. abstract class : 일반클래스 + 설계
		// abstract > new 사용 불가 구현부 없음
		Animal ani = null; 
		ani = new Cat(); ani.eat();
		
		ani = new Dog(); 
		ani.name = "alpha"; ani.eat();
		
		System.out.println(""); //줄바꿈
		
		Animal[] arr = {new Cat(), new Dog(), new Person()};
		int cnt = 0;
		for(Animal an: arr) {
			an.name = "ani " + ++cnt; 
			an.eat(); //누구누구 냠냠!
		}
		
	} //end psvm

}//end class
