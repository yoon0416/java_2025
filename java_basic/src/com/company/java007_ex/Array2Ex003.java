package com.company.java007_ex;

public class Array2Ex003 {

	public static void main(String[] args) {
		//1. new 연산자 이용하여 다차원배열만들기
		//2. for + length 이용해서 대입   
		//3. for + length 이용해서 출력 
		//   101   102   103
		//   104   105   106
		int[][]arr = new int[2][3];
		int num=1;
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}//end psvm

}//end class
