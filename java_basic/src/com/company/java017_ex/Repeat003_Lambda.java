package com.company.java017_ex;


interface InterTest21 { void   test(); }  
interface InterTest22 { void   test(int a); }  
interface InterTest23 { int    test(); }  
interface InterTest24 { int    test(int a); }  


public class Repeat003_Lambda {
	public static void main(String[] args) {
		
		//람다식으로 구현하시오.
		
		//x y = () -> {};
        // Q1. test1.test();                     //안녕
        InterTest21 IT21 = () -> { System.out.println("안녕"); };
        IT21.test();

        // Q2. test2.test(2);                     //안녕안녕
        InterTest22 It22 = (int a) -> { System.out.println("안녕".repeat(a)); };
        It22.test(2);

        // Q3. System.out.println(test3.test());  //3
        InterTest23 test3 = () -> { return 3; }; // test()는 3을 반환
        System.out.println(test3.test());  

        // Q4. System.out.println(test4.test(3)); //30
        InterTest24 test4 = (int a) -> { return a * 10; }; 
        System.out.println(test4.test(3)); 
	}
}