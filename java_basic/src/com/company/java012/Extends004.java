package com.company.java012;

class Grand extends Object {
	void one() {
		System.out.println("grand : one");
	}

	void two() {
		System.out.println("grand : two");
	}
}

class Aunt extends Object {
	String name = "MiMi";

	@Override
	public String toString() {
		return name + " 옆집이모클래스";
	}
}

class Father extends Grand {
	void three() {
		System.out.println("father : three");
	}
}

class Uncle extends Grand {
	void four() {
		System.out.println("uncle : four");
	}

	@Override
	void one() {
		System.out.println("uncle : one");
	}

	@Override
	void two() {
		System.out.println("uncle : two");
	}
}

public class Extends004 {

	public static void main(String[] args) {
		Father father = new Father();father.three();father.two();father.one();
       Uncle uncle = new Uncle(); uncle.four(); uncle.two(); uncle.one();
       Aunt aunt = new Aunt();
       System.out.println(aunt.toString());
       System.out.println(aunt);
	}

}
