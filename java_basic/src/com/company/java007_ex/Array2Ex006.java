package com.company.java007_ex;

public class Array2Ex006 {

    public static void main(String[] args) {
        // datas 배열 초기화
        int[][] datas = {  
            {  10, 10, 10 ,10}, 
            {  20, 20, 20 ,20}, 
            {  30, 30, 30 ,30}, 
        };
        
        // 결과를 저장할 result 배열 초기화 (datas 크기 + 1)
        //출력문 보면 마지막에 총합임
        int[][] result = new int[datas.length + 1][datas[0].length + 1];
        
        // datas 배열의 각 값을 result 배열에 복사하고 행 합계를 계산
        for (int i = 0; i < datas.length; i++) {
            int hap = 0;  // 각 행의 합을 저장할 변수
            for (int j = 0; j < datas[i].length; j++) {
                result[i][j] = datas[i][j];  // datas에서 값 복사
                hap += datas[i][j];  // 행 합계 계산
            }
            result[i][datas[0].length] = hap;  // 행 합계를 마지막 열에 저장
        }
        
        // 각 열의 합을 계산하여 result 배열의 마지막 행에 저장
        for (int j = 0; j < datas[0].length; j++) {
            for (int i = 0; i < datas.length; i++) {
                result[datas.length][j] += datas[i][j];  // 열 합계를 마지막 행에 누적
            }
        }
        
        // 결과 배열을 출력
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");  // 값 출력
            }
            System.out.println();  // 줄바꿈
        }
    }//end psvm
}//end class
