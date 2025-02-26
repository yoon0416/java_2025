package com.company.java007_ex;

public class ArrayEx010 {

    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int num = 1;
        
        
        for (int j = 0; j < arr[0].length; j++) { // 칸만 1234로 만들어줌
            arr[0][j] = num;
            num++;
        }
        
        
        for (int i = 0; i < 4; i++) { //1234 만든거 4번반복 출력
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[0][j] + " ");
            }
            System.out.println();
        }
    }
}
