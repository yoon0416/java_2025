package com.company.java011_ex;

public class ClassArrEx1 {
    public static void main(String[] args) {
        
        Apple[] apples = new Apple[3];
        
       
        apples[0] = new Apple("RED", "iron", 2, 1000);
        apples[1] = new Apple("GREEN", "hulk", 1, 1500);
        apples[2] = new Apple("GOLD", "captain", 3, 2000);
        
        
        for (Apple one : apples) {
            System.out.println(one);
        }
    }
}
