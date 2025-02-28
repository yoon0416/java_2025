package com.company.java009_ex;
import java.util.Scanner;

class MyPrice001{
	  String name;  int price;
	  void input() {
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("상품 이름 입력 > ");
		  this.name = sc.next();
		  System.out.println("상품 가격 입력 > ");
		  this.price = sc.nextInt();
		  
	  }
	  
	  void show() {
		  System.out.println("상품정보입니다\n");
		  System.out.printf("상품이름 : %s  / 상품가격 : %d",this.name,this.price);
	  }
	  
}//end class

public class ClassEx002 {

	public static void main(String[] args) {
		MyPrice001   p1 = new MyPrice001(); //객체생성 > 객체 = p1
        p1.input();
        p1.show();

	} //end psvm

}//end class

/* 클래스(설계도) - 인스턴스화(실제객체) - 객체(인스턴스들,,,,)/인스턴스 p1.name
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]  MyPrice001.class / ClassEx002
------------------------------------------------------------------------------
[heap:동적]      		           	|[stack:잠깐빌리기]
28번째:                                 p1.show(); 1번지.show();
27번째:     {name=apple, price=1000}    p1.input(); 1번지.input();{}
26번째:1번지 {name=null, price=0}     ←  p1: 1번지
						         	|
------------------------------------------------------------------------------
*/