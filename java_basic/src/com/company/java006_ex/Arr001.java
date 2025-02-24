package com.company.java006_ex;

public class Arr001 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		int arr1[] = new int[3];
		int[] arr2 = null; //공간은 있지만 값을 넣지 않음
		int[] arr3 = {1,2,3};
		/* 1번지{1,2,3} ← arr2:1번지
		 *
		 */
		
		System.out.println(arr3);
		System.out.println(arr3.length);
		System.out.println("인덱스 0 : "+arr3[0]);
		System.out.println("인덱스 1 : "+arr3[1]);
		System.out.println("인덱스 2 : "+arr3[arr3.length-1]);
		
		int[] arr4 = {1,2,3,4,5};
		for(int i = 0; i<arr4.length; i++) {
		System.out.print(arr4[i]+" ");
		}
		System.out.println();
		
		double arr5[] = {1.1,1.2,1.3};
		for(int i = 0; i<arr5.length; i++){
			System.out.print(arr5[i]+" ");
		}
		
	} //end psvm

} //end class
