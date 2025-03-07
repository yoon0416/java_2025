package com.company.java012;

class Color extends Object{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color() {
		super(); //부모 클래스의 기본생성자 호출하는 문구
	}
}
/*
	- 부모 클래스에 기본 생성자가 있으면, 자식 클래스에서 super()를 생략할 수 있습니다.
	- 부모 클래스에 기본 생성자가 없고 매개변수가 있는 생성자만 있으면, 자식 클래스에서 명시적으로 super()를 사용해 부모 클래스의 생성자를 호출해야 합니다.
 */
class Green extends Color{
	int num;
	public void show() {
		System.out.println(":::: GREEN");
		System.out.println("=NAME : "+getName());
		System.out.println("=num : "+num);
	}
	public Green() {
		super();
	}
}

public class Extends002 extends Green{

	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.num = 5;
		mygreen.show();

	} //end psvm

}// end class


