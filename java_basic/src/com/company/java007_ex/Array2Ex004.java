package com.company.java007_ex;

public class Array2Ex004 {

	public static void main(String[] args) {
		char[][]arr = new char[2][3];
		char num = 'A';
		
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
