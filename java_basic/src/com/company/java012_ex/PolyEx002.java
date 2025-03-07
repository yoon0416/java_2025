package com.company.java012_ex;

class Parent7  extends Object{
	   int x = 100;
	   public Parent7() { super(); }
	   void method() { System.out.println("Parent Method"); }
	} 
	class Child7 extends Parent7 {
	   int x = 200;
	   public Child7() { super(); }
	   @Override  void method() { System.out.println("Child Method"); }
	}
	public class PolyEx002 {
	   public static void main(String[] args) {
	      Parent7 p = new Child7();     // Parent7 타입의 변수 p가 Child7 객체 참조 (업캐스팅)
	      // Q3.  Parent7 p   보장하는 범위   
	      //  x = 100, void method()는 오버라이딩
	      // x=200 method() - x=100 / ㅇㅂㄹㅇㄷ
	      
	      // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()  
	      // x = 200 , method() { System.out.println("Child Method"); } - x=100/ㅇㅂㄹㅇㄷ
	      
	      Child7 c = new Child7();     
	      System.out.println("p.x = " + p.x);  // Q5. 출력되는 내용  >  p.x = 100
	      p.method();  // Q6. 출력되는 내용    > Child Method
	      System.out.println("c.x = " + c.x);   // Q7. 출력되는 내용 >  c.x = 200
	      c.method();   // Q8. 출력되는 내용  >  Child Method
	   }
	}
