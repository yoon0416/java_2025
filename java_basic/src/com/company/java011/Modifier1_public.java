package com.company.java011;

import com.company.java011_ex.Cat;

public class Modifier1_public {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.public_ = 10; //public 아무데서나 접근 가능
//		cat.protected_  안보임
//		cat.package_ 안보임
//		cat.private_ 안보임
		cat.setPrivate_(100);
		System.out.println(cat.getPrivate_());
		
	}
}
