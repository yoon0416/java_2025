package com.company.java003;

public class casting001 {

	public static void main(String[] args) {
		//#1. 형변환 - 자동타입변환
		//byte < short < int < long < float < double
		byte by = 1;
		short sh = 2;
		int in = 4;
		long l = 8L;
		float f = 3.14f;
		double d = 3.14;
		
		sh = by; // 정수(2) - 정수(1)
		in=by; // 정수(4) - 정수(1)
		l=by; // 정수(8) - 정수(1)
		
//		l = f; //정수(8) - 실수(4) 정수 < 실수
		f = l; // 실수(4) - 정수(8)
		
		//#2. 형변환 - 강제타입변환

		by = (byte)in; //정수(1) - 정수(4)
		int in2 = (int)1.2; //정수(4) - 실수(8)
		
		//q1
		System.out.println( (int)1.5 + (int)2.7);
		
	}

}
