package com.company.java011;

/*class Cat2{
	
}*/

//The type Cat2 is already defined
//Modifier1_protected에서 Cat2 클래스 작성해서


public class Modifier3_package {

	public static void main(String[] args) {
		Cat2 cat = new Cat2();
		//import 안해도 사용가능
		cat.public_=10;
//		cat.protected_=20; //외부라서 사용불가 extends를 사용한 cat2에서만 사용가능
//		cat.package_=30; //같은폴더에서만 사용가능하기 때문에 불가능
//		cat.private_=40; //getters + setters
		cat.show();
	}

}
