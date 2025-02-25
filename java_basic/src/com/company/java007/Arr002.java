package com.company.java007;

import java.util.Arrays;

public class Arr002 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		int arr2[] = new int[3];

		System.out.println(arr2);
		
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 30;
		System.out.println(Arrays.toString(arr2));
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

}
