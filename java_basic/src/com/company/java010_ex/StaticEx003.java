package com.company.java010_ex;

//-- class Sawon3작성해주세요 
//1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
//2. 인스턴스메서드, 클래스메서드 구분하시오.
//3. 오류나는 이유는?

class Sawon3{ 
	static int pay=10000;    
    static int su=10;     
     
    static int basicpay=pay;   
     
    static int basicpay2;    
    
    public static void showSu() {   System.out.println(su);  }          
    public static void showPay() {   System.out.println(pay);  }    
  
    public static  void  showAll001() {   
       System.out.println(su);  
       System.out.println(pay);  
    } 
    
    public static  void  showAll002() {   
        Sawon3.showAll001();    
       System.out.println(pay);
    } 
    
}//end class 


public class StaticEx003{
  public static void main(String[] args) {
//   Sawon3 sola = new Sawon3();  
   Sawon3.showAll001();
   
  } //end psvm
}//end class


/*
●어플리케이션은 어떻게 실행되는가?

- 어플리케이션(앱) 정의: 사용자가 사용할 기능을 제공하는, 컴퓨터가 실행할 수 있는 명령어들의 집합

- 메모리: 실행된 앱이 상주하는 곳

- cpu : 명렁어를 실행하는 주체


메모리 영역

- 메서드 : 메서드 영역은 클래스에 대한 정보를 저장, 클래스 정의, 메서드 코드, 그리고 정적 변수(static 변수) 등이 저장
    ㄴ 클래스 정보: 클래스의 정의(필드, 메서드, 클래스 변수 등)가 저장
    ㄴ 정적 변수(static 변수): static으로 선언된 변수는 메서드 영역에 저장
    ㄴ 정적 메서드(static 메서드): static 메서드는 메서드 영역에 저장


- 힙 : 동적 메모리 할당을 위해 사용되는 메모리 영역, 객체를 생성할 때, 즉 new 키워드를 사용할 때 생성되는 모든 객체는 힙 영역에 할당
   ㄴ 객체: new 키워드를 사용하여 생성한 객체들이 저장
   ㄴ 배열: 배열도 객체로 간주되므로 힙에 저장


- 스택: 지역 변수와 메서드 호출을 관리하는 영역
   ㄴ지역 변수: 메서드 내에서 선언된 기본 데이터 타입의 변수와 객체 참조 변수가 저장
   ㄴ메서드 호출 정보: 메서드가 호출될 때마다 그 메서드의 지역 변수와 메서드 정보를 저장


void score(int a){ system.out.println(("골"+a);} 여기에서는 score라는 메서드랑 안에 처리하는 값인 프린트문 이것들은 메서드 매개변수인 a는 스택

지역 변수 (Local Variable)
지역 변수는 메서드, if, for 등의 블록 안에서 선언된 변수입니다.
메서드가 실행될 때 생성되고, 해당 메서드가 종료되면 메모리에서 제거됩니다.
스택(Stack) 영역에 저장됩니다.

인스턴스 변수 (Instance Variable)
인스턴스 변수는 클래스 내에서 메서드 밖에 선언된 변수입니다.
객체가 생성될 때 해당 객체의 힙(Heap) 영역에 저장됩니다.
객체의 상태를 나타내며, 해당 객체가 존재하는 동안 메모리에서 유지됩니다.

인스턴스 변수와 힙의 관계:
인스턴스 변수는 클래스의 객체에 속하는 변수이기 때문에, 해당 객체가 힙에 저장됩니다.


생성자, 메서드 > 메서드영역
매개변수 > 스택
----------------------------------
- 메서드 영역:
ㄴ클래스 정의, 메서드 코드, 정적 변수(static 변수)와 정적 메서드

- 힙 영역:
ㄴ객체(new로 생성된 객체), 배열, 그리고 인스턴스 변수(객체와 함께 저장됨)

- 스택 영역:
ㄴ지역 변수, 메서드 호출 시 매개변수


메모리 영역과 그에 해당하는 저장 대상들
1. 메서드(Method) 영역
클래스 정보: 클래스 정의와 그 클래스에 속하는 모든 메서드 및 필드 정보가 저장됩니다.
예: class Car의 정의, 메서드 public void displayInfo() 등.
정적 변수(static 변수): static 키워드로 선언된 변수들이 저장됩니다.
예: static int count;
정적 메서드(static 메서드): static 메서드도 메서드 영역에 저장됩니다.
예: public static void main(String[] args)
2. 힙(Heap) 영역
객체: new 키워드를 사용하여 생성된 모든 객체가 힙에 저장됩니다.
예: Car myCar = new Car("Tesla", 2022);
배열: 배열도 객체로 간주되므로 힙에 저장됩니다.
예: int[] arr = new int[10];
인스턴스 변수: 클래스에서 메서드 밖에 선언된 변수들(인스턴스 변수)은 객체가 생성될 때 해당 객체의 힙에 저장됩니다. 인스턴스 변수 자체는 힙에 저장되지 않지만, 그 값은 힙에 생성된 객체 내에 저장됩니다.
예: String model, int year와 같은 인스턴스 변수는 Car 객체에 포함되어 힙에 저장됩니다.
3. 스택(Stack) 영역
지역 변수: 메서드, if, for 등의 블록 안에서 선언된 변수들은 스택에 저장됩니다. 메서드 호출 시 생성되고 메서드 종료 시 사라집니다.
예: 메서드 내에서 선언된 int a = 10;이나 String b = "Hello"; 같은 지역 변수들.
매개변수: 메서드 호출 시 전달된 매개변수도 스택에 저장됩니다.
예: void score(int a)에서 a는 스택에 저장됩니다.
4. 추가 설명
객체와 배열은 힙에 저장되지만, 객체를 가리키는 참조 변수는 스택에 저장됩니다. 예를 들어, Car myCar = new Car("Tesla", 2022);에서 myCar는 스택에 저장되고, 실제 객체(Car 객체)는 힙에 저장됩니다.


최종 정리:
메서드, 생성자는 메서드 영역에 저장됩니다.
매개변수는 스택 영역에 저장됩니다.
객체와 배열은 힙 영역에 저장됩니다.
참조 변수는 스택 영역에 저장됩니다.

객체는 생성자를 호출할 때만 만들어집니다.
생성된 객체는 힙에 저장되며, 객체를 참조하는 변수는 스택에 저장됩니다.


*예외처리 


try {
    // 예외가 발생할 수 있는 코드
} catch (ExceptionType e) {
    // 예외가 발생했을 때 실행할 코드
}












*/