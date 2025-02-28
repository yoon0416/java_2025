package com.company.java010;
//alt + shift + s
class Product{
	String name;
	int price;
	
	public Product(String name, int price) {super(); this.name=name; this.price=price;} 

	//생성자: 객체가 생성될 때 변수의 초기화를 위해 실행되는 특별한 메서드
	public Product() { 
		System.out.println("원하는 값으로 초기화-수동생성시 컴파일러 자동생성 취소");
		}
	@Override public String toString() {return "Product [name =" +name +",price="+price+"]";
}//end class



public class Class004_Constructor {

	public static void main(String[] args) {
		Product p1 = new Product(); //수동으로 작성하면 디폴트생성자 깨짐 super 그거 해야함
		System.out.println(p1);
	}//end psvm

}//end class 
}
/* 
컴파일 실행 시
1. 메서드 영역에 Product.class, Class004_Constructor.class 파일이 생성됨
2. main() 메서드를 만나 static이므로 static 메서드 영역에 main()이 호출됨
3. main() 메서드 내에서 Product 객체 p1이 생성되며 Product() 생성자가 호출됨
4. Product() 생성자에서 super()를 호출하여 Object 클래스의 생성자를 실행
5. System.out.println(p1);을 통해 Product 객체의 메모리 주소가 출력됨
*/