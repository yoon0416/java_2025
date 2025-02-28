package com.company.java010_ex;
class Area1{
	static double pi = 3.14159;
	static int rect(int a, int b) {
		return a * b;
	} // *
	static double triangle(int c, int d) {
		return (c*d)/2;
	}//* /2
	
}//end class

public class StaticEx001{
	  public static void main(String[] args) {  
	   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
	   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
	   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
	  }
	}
