package com.company.java009_ex;

public class Method005_ex {

	public static int add(int x, int y) {return x+y;}
	
	public static int add(byte x, byte y) {return x+y;} //1
	public static int add(short x, short y) {return x+y;} //2
//	public static long add(int x, int y) {return x+y;} //3    // 이름은 같지만 매개변수(파라미터) 똑같음 오버로딩 x
	public static long add(long x, long y) {return x+y;}//4
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
