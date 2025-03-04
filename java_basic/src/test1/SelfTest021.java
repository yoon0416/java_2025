package test1;

public class SelfTest021 {
	
	public static int print(int a, int b) {return a+b;}
	public static double print(double a, double b) {return a+b;}
	
	public static void main(String[] args) {
		System.out.println(print(3,5));
		System.out.println(print(1.2,3.4));

	}

}

/*
함수(4) : 메서드오버로딩
	1. 다음의 결과가 나오게 메서드를 구현하시오		    
	print(3,5);			결과값 :   8 출력
	print(1.2,3.4);		결과값 :   4.6출력
*/