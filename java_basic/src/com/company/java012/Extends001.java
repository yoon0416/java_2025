package com.company.java012;

/*
1. 클래스는 부품객체
2. 상태(멤버면수)와 행위(멤버함수)
3. 상속 - 재활용
    
    
    
 
 */
class A1 extends Object {
	int a;

	public A1() { //Object ()
		super();
	}
	
}

class B1 extends A1 { //A1 ()
	int b;

	public B1() {
		super();
	}
	
}

class C1 extends B1 { //B1 ()
	int c;

	public C1() {
		super();
	}

	public void show() {
		System.out.println(a + "/" + b + "/" + c);
	}
}


public class Extends001 {

	public static void main(String[] args) {
		C1 c1 = new C1(); c1.a=1; c1.b=2; c1.c=3;
		c1.show();

	} //end psvm

}//end class
/*

- 메서드영역: A1.class, B1.class, C1.class, public Extends001.class 
- 힙: int a,b,c ← 인스턴스변수, A1(), B1(), C1() ← 객체 but A1(),B1()은 객체생성을 아직 안했기 때문에 힙에 따로저장 x 생성하면 힙에저장
- 스택: c1 ← 참조변수

- 순서:  
1. 클래스 로딩: C1.class, B1.class, A1.class, Extends001.class 로딩 (메서드 영역).
2. main 메서드 실행: C1 c1 = new C1(); 코드 실행.
3. C1() 생성자 호출:
   - C1의 생성자가 호출되고, super()로 B1() 생성자 호출.
4. B1() 생성자 호출:
   - B1의 생성자가 호출되고, super()로 A1() 생성자 호출.
5. A1() 생성자 호출:
   - A1의 생성자가 호출되고, super()로 Object() 생성자 호출.
6. Object() 생성자 호출:
   - Object 클래스의 기본 생성자 호출.
7. 객체 초기화:
   - C1 객체의 필드 a, b, c를 초기화하고, c1.show()가 실행되어 결과를 출력.
   
 ※
 - main 메서드는 먼저 실행되지만, 객체 생성 코드인 C1 c1 = new C1();를 만나면, 그 뒤로 생성자 쪽으로 제어가 넘어가며 객체 생성 과정이 시작됩니다.
 - 그 후, 객체 생성이 끝나면 main 메서드의 나머지 코드들이 실행됩니다.
------------------------------------------------
- 메서드 영역: 
> 클래스에 대한 정보 저장
ㄴ클래스, 메서드, 생성자, static이 붙은 변수 및 메서드


- 힙:
> 동적 메모리 할당을 위해
ㄴ 객체(new로 생성된 객체), 배열, 인스턴스 변수(클래스의 객체에 속하는 변수라 힙에 저장)


- 스택
> 지역변수와 메서드 호출을 관리
ㄴ 지역변수, 메서드 호출 시 매개변수, 참조변수
*/