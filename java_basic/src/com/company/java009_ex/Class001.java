package com.company.java009_ex;
// 1. 클래스는 부품객체
// 2. 클래스는 속성(멤버변수)과 행위(멤버함수)
class A1{}

public class Class001 {

	public static void main(String[] args) { //jvm - main 구돟시점
		//int i; 자료형 변수명;
		A1 a = new A1(); //3-1. 1번지 new(heap 공간 빌리기) 3-2. A1() 초기화
		                 // 3-3. a는 주소
		//com.company.java009_ex.A1@2f92e0f4
		System.out.println(a);
		A1 a2 = new A1();
		A1 a3 = new A1();
		
	} //end psvm

} //end class001
/* 9번째줄 : A1 a = new A1();
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보] A1.class , Class001.class
------------------------------------
[heap:동적]      |[stack:잠깐빌리기]
1번지 : A1{}     ← a(1번지)
				|main 
------------------------------------
*/