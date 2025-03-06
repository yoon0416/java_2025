package com.company.java_ex_0306;

class Parent{
	int i, j;
	public Parent() {super();} //누구를 호출한것인지 적어 > 얘 부모 오브젝트
	public Parent(int i, int j) {
		super(); // 누구호출? 얘 부모 오브젝트 기본 생성자 호출
		this.i = i;
		this.j = j;
	}
	
} //end class

class Child extends Parent{
	int k ;
	public Child() {super();} // 누구호출 > Parent
	public Child(int i, int j,int k) {
		super(i,j); // 누구호출 > Parent 클래스의 (int i, int j) 생성자 호출
		
		this.k = k;
		
	}
}


public class ExtendsBasic007_super {

	public static void main(String[] args) {
		
		Child child = new Child(10,20,30);
		System.out.println(child.i); //5
		System.out.println(child.j); //5
		System.out.println(child.k); //5

	}

}
