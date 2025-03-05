package com.company.java012;
/*
1. 클래스는 부품객체
2. 상태의 행위
3. 상속 - 재사용
	  
	  Object
			↑							  
  	  TestA2	int a / -------	
			↑
	  TestB2	int b / toString


*/
class TestA4 extends Object {
	int a = 10;

	@Override
	public String toString() {
		return "TestA4 [a=" + a + "]";
	}
} //end class


class TestB4 extends TestA4 {
	int b = 20;
	@Override
	public String toString() {
		return "TestB4 [b=" + b + "]";
	}

}//end class
public class Poly004 {

	public static void main(String[] args) {
		TestA4 ta = new TestA4(); //{int a /  toString }= 1번지{int a /  toString}
		TestB4 tb = new TestB4(); //{int b / toString} -{int a /  ------- }= 2번지{int b / toString} -{int a /  ------- }
		ta = new TestB4();        //{int a /  toString }=3번지{int b / toString} -{int a /  ------- }
		tb = (TestB4) ta;         //{int b / toString} -{int a /  ------- }=3번지[{int b / toString} -{int a] /  ------- }
		System.out.println(tb);
	}

}
/*
 * 	  Object
			↑							  
  	  TestA2	int a /  toString
			↑
	  TestB2	int b / toString
 * 
 */

// 업캐스팅은 부모가 자식을 담는거고 이 논리적사고는 우리가 일반적으로 접할 수 있는 흔하고 흔하디 흔한 ㅇㅇ

/*
 다운캐스팅은 자식이 부모를 담는거고 자식에서 쓸 수 있는 기능이 부모에게는 없을 수 있고 그럼 오류가 생기니 
 타입캐스팅으로 부모클래스를 자식 클래스처럼 변환 (뭐 값이 달라지는건 아니고 참조하는 방식이 달라짐)
 → 다운캐스팅은 자식 클래스에서만 사용할 수 있는 기능에 접근하기 위해 부모 클래스를 자식 클래스로 변환하는 과정
 
 */
 

//다운캐스팅은 자식 클래스의 특화된 기능이 필요할 때만 필요하고, 
//부모 클래스에서 제공하는 일반적인 기능만 사용하려면 다운캐스팅 없이도 가능합니다.