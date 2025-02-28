package com.company.java010;

class Car31{} //생성자 car31() - 컴파일러가 기본생성자를 자동생성
class Car32{ 
	String color;
	//alt + shift + s ★밑에서 3번째
	//오버로딩시 - [수동]으로 생성자를 만들면 컴파일러가 기본생성자를 자동생성취소

	public Car32(String color) {this.color = color;}
	public Car32() { this.color = "black"; } //기본생성자는 
	
} //end Car32 class

public class Class003_Constructor {

	public static void main(String[] args) {
		Car31 car1 = new Car31(); //객체생성 3-1.new(heap 메모리 빌리고 car1 객체생성), 3-2 Car31()초기화 3-3. car1 번지
		System.out.println(car1); //com.company.java010.Car31@2f92e0f4
		
		Car32 car2 = new Car32();
		System.out.println(car2+"\t"+car2.color); //com.company.java010.Car32@5305068a	null

		Car32 car3= new Car32("red");
		System.out.println(car3+"\t"+car3.color);
	}

}
/*
--------------------------------------------runtime data area
[method영역: 클래스, static, final] class Car31 / class car32 / class Class003_Constructor ##1
--------------------------------------------------------
[heap영역: 동적]           |  [stack영역:지역] 
8번째: 1번지{  }                  ←car1 : 1번지
 						 |   main ##2
--------------------------------------------------------


-스택:  메서드가 호출될 때마다 생성되는 지역 변수와 메서드 호출을 위한 공간
-힙: 동적으로 생성된 객체가 저장되는 공간
-메서드: 클래스와 관련된 정보를 저장하는 공간
(public먼저 접근 static 메모리 바로 접근)

- Car31() = 생성자로, 객체 초기화
- new Car31(); = 힙(Heap) 메모리를 할당하여 Car31 객체를 생성합니다.
- car1은 스택(Stack)에 저장된 참조 변수로, 힙에 생성된 Car31 객체의 주소


*/