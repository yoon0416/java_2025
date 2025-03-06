package com.company.java013;


// 1. 클래스는 부품객체
// 2. 상태와 행위
// can do this
interface Animal1{
	static final String COMPANY="(주) 동물농장"; //static final - method area, new 관련
	abstract void eat(); //abstract - {} 없어서 new 못함 /컴파일러가 abstract 자동으로 만들어주긴함
}

class Saram implements Animal1{

	@Override
	public void eat() {
		//COMPANY="집가고 싶다"; > final이라 수정불가
		System.out.println("냠");
		
	}
}

class Pig implements Animal1{

	@Override
	public void eat() {
		//COMPANY="집가고 싶다"; > final이라 수정불가
		System.out.println("꿀");
		
	}
}


public class Interface001 {

	public static void main(String[] args) {
		//Animal1 ani = new Animal1(); 인스턴스화 못함, 설계목적
		System.out.println(Animal1.COMPANY);
		//하나의 자료형으로 여러개의 타입을 관리하려고 사용
		Animal1[] anis = {new Saram(), new Pig()};
		
		for(Animal1 a : anis) {a.eat();} //오버라이딩 자식의 eat()
		
		

	}

}
