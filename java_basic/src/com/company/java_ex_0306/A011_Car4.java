package com.company.java_ex_0306;

class Car4 extends Object{
	public Car4() {super();}
	String color;
	
	public String toString() {
		return "Car4 [color="+color+"]";
	}
}

public class A011_Car4 {

	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.color = "red";
		System.out.println(c1);

	}

}
