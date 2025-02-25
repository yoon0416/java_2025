package com.company.java007_ex;

public class ArrayEx006 {

    public static void main(String[] args) {
        double arr[] = new double[5];

       
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.1 + i * 0.1;  
        }

        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.1f ", arr[i]); 
        }
    }
}