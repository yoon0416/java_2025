package com.company.java011;


class FinalEx extends Object{ //1. object - 자바팀이 객체틀 만들어놓음! 2. extends 상속(앞에 객체 그대로 사용)
	// static String tree = "4-5"; //식목일
	final static String tree = "4-5"; //식목일
	String name;
	
	final void show() {System.out.println(FinalEx.tree+"/"+name);}

}//end class

class Mydate extends FinalEx{
//	@Override
//	void show() {
//		super.show();
//	}
	
}//end class

public class Final001 {

	public static void main(String[] args) {
//		FinalEx.tree = "4-6";
		System.out.println("식목일 - 나무심는날, 기념일(공유,변경안되는값) > "+FinalEx.tree);
		
	}

}
