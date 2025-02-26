package com.company.java008_ex;

public class MethodEx001_1 {
    public static void test1(int a) {
        System.out.println(a);
    }

    public static void test2(double b) {
        System.out.println(b);
    }

    public static void hap(int c, int d) {
    	int num = c;
    	for(int i = c; i < d-1; i++) {
    		num++;
    	}
        System.out.println(c + d + num);
    }

    public static void disp(int e) {
        for (int i = 1; i <= e; i++) {
            System.out.print("*");
        }
    }

    public static void main(String[] args) {
        test1(10);    
        test2(1.2);   
        hap(3, 5);    
        disp(7);      
    }
}
