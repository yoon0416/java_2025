package oopEx0310;

public class A {
	int a;
	static String company;
	void method() {int a;} //오류날 수 있음 > 인스턴스 변수가 선언되었지만 지역변수로도 선언하여 변수이름 중복
}

//클래스 변수: static String company;
//인스턴스 변수: int a;
//지역변수: void method() { int a; } 안의 int a;
