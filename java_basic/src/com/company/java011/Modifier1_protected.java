package com.company.java011; //1.java011폴더

import com.company.java011_ex.Cat; 

class Cat2 extends Cat{ //Cat2: java011 / Cat: java011_ex
	public void show() {
		public_=10;
		protected_=20; // extends 사용가능 - 상속받은 자식만
//		package_=30;   // 같은폴더에서 사용가능 - 폴더다름
//		private_=40;   // Cat 클래스에서만 사용 - 게터세터 ㄱ
		
		System.out.println(public_+"/"+protected_);
		
	}
	
}//end class //2. extends Cat의 기능 사용[상속]


public class Modifier1_protected{

	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.show();
		
		cat2.public_=100;
//		cat2.protected_ =200; //extends 없기 때문에 불가 extends Cat 그래서 cat2에서만 가능

	} //end psvm

} //end class
