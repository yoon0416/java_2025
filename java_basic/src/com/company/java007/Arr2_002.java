package com.company.java007;

public class Arr2_002 {

    public static void main(String[] args) {
        int [][]arr = new int[2][3];  
        int num = 1;  
        
        // 2차원 배열을 순회하면서 값을 넣기
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num; 
                num++;  
            }
        }
        
        // 배열 출력
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");  
            }
            System.out.println();  
        }
        
    }//end psvm
} //end class
