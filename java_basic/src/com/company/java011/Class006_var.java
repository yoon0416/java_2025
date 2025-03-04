package com.company.java011;

class A{
	//멤버변수
	int a = 10; // 인스턴스변수
	static String company = "(주) 동물농장"; //명시적초기화
	static{company = "(주) 동물농장-joy";}

	//멤버함수
	void method() {int a = 3000; System.out.println(a);}
	void show() {System.out.println(this.a);}
	
	A(){}
	A(int a){this.a=a;} // 인스턴스변수 < 
	@Override public String toString() {return "A[a ="+a+"]";}

}


public class Class006_var {

	public static void main(String[] args) {
		//클래스변수
		System.out.println(A.company);
		//인스턴스변수
		A a1 = new A(3); System.out.println(a1);
		A a2 = new A(7); System.out.println(a2); a2.method();
	}

}
/*
- 메서드 영역:
ㄴ Class006_var.class, A.class, method(), show(), static String company;, A()

- 힙 영역:
ㄴ 객체가 생성될 때 인스턴스 변수인 int a를 포함한 객체가 힙에 저장됨,  new A()

- 스택 영역:
ㄴ method() 안에 있는 지역 변수 int a;, (a1, a2 > 참조변수)

----------------------------------------------------------------------------
- 메서드 영역: 
> 클래스에 대한 정보 저장
ㄴ클래스, 메서드, 생성자, static이 붙은 변수 및 메서드


- 힙:
> 동적 메모리 할당을 위해
ㄴ 객체(new로 생성된 객체), 배열, 인스턴스 변수(클래스의 객체에 속하는 변수라 힙에 저장)


- 스택
> 지역변수와 메서드 호출을 관리
ㄴ 지역변수, 메서드 호출 시 매개변수, 참조변수


＠초기화 순서

기본값	명시적초기화	초기화블록	생성자
4-1) 기본값	   : String,객체 - null / int-0
4-2) 명시적초기화 : int a= 10; //중요 콘텐츠 명시적으로 알림
4-3) 초기화블록  : {a=10; b=20;} 여러개 초기화시
4-4) 생성자     : 최종은 생성자에서 사용함, 인스턴스변수 초기화



*/