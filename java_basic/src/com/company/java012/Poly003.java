package com.company.java012;
/*
1. 클래스는 부품객체
2. 상태의 행위
3. 상속 - 재사용
	  
	  Object
			↑							  
  	  TestA2	int a / toString	
			↑
	  TestB2	int b / toString


*/
class TestA3 extends Object {
	int a = 10;

	@Override
	public String toString() {
		return "TestA3 [a=" + a + "]";
	}
} //end class


class TestB3 extends TestA3 {
	int b = 20;
	@Override
	public String toString() {
		return "TestB3 [b=" + b + "]";
	}

}//end class
public class Poly003 {

	public static void main(String[] args) {
		TestB3 tb = (TestB3) new TestA3(); //4. 자식 = 부모 (다운캐스팅) / 타입캐스팅필요
		//1. TestB3 = tb  > TestB3{ int b / toString } - TestA3{int a / ------ }
		//2. TestA3()는 int a만 처리                        TestA3(){int a / toString}
		//3. TestB3{int b / toString } 보장안됨
		//Exception in thread "main" java.lang.ClassCastException:
	}

}
