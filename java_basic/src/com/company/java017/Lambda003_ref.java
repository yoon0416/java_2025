package com.company.java017;


class RefClass {void method(String str) {System.out.println(str);};}

interface InterUsing{void inter(RefClass c, String str);
}

public class Lambda003_ref {

	public static void main(String[] args) {
		//1. 익명 클래스
		InterUsing a1 = new InterUsing() {
			@Override public void inter(RefClass c, String str) { 
				c.method(str); 
			}
		};
		a1.inter(new RefClass(), "Hello :) ");
		
		//2. 람다 x y = () -> {};
		InterUsing a2 = (RefClass c,String str) -> {c.method(str);};
		a2.inter(new RefClass(), "Hello :( ");
		
		//3. :: 표현식 (참조)
		InterUsing a3 = RefClass::method;
		a3.inter(new RefClass(), "Hello :>");
		
		
		//4
		InterBasic basic1 = (int a, int b)->{return Math.max(a, b);};
		System.out.println(basic1.method(10, 3));
		
		//5
		InterBasic basic2 = (a,b)->Math.max(a, b);
		System.out.println(basic2.method(10, 3));
		
		//6
		InterBasic basic3 = Math::max;
		System.out.println(basic2.method(10, 3));
		
		//--------------
		//1
		InterEx1 ex1 = str ->str.length();
		System.out.println("ABC");
		
		InterEx1 ex11 = String::length;
		System.out.println("ABC");
		//2
		InterEx2 ex2 = num -> System.out.println(num);
		ex2.method(100);
		
		InterEx2 ex22 = System.out::println;
		ex22.method(100);
		
		
	}//end psvm

}//end class
interface InterBasic{int method(int a,int b);	}
interface InterEx1{int method(String str);}
interface InterEx2{void method(int num);}



