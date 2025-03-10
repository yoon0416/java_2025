package com.company.java015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

//1. 콜렉션프레임워크 - 동적배열
//2. 배열의 단점개선 - 한가지자료형의 사이즈 고정

public class Collection001_List {

	public static void main(String[] args) {
		//Step1. Array
		String[] arr = new String[3];
		arr[0] = "헐크";
		System.out.println(Arrays.toString(arr));
		
		//Step2. 동적배열 ( add-추가, get-가져오기, size-개수, remove-삭제, contains-포함 )
		List list = new ArrayList(); //여러자료형 - 공간은 내가 원하는 만큼
		list.add("one");
		list.add(1);
		list.add(3.14);
		list.add('A');
		System.out.println(list);
		
		
		//Step3. <>
		// 
		//List<String> list2 = new ArrayList<>();
		//List<String> list2 = new LinkedList<>();
		//List<String> list2 = new Vector<>();
		//ArrayList<String> list2 = new ArrayList<String>();
		
		//String 이라는 자료형만 담을 수 잇는 동적배열
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("two"); //인덱스 0번째
		// list2.add(2);
		
		
		//Step4. add, get, size, remove, contains
		list2.add("three"); //인덱스 1번째
		list2.add("for"); //인덱스 2번째
		System.out.println("갯수 > "+list2.size());
		System.out.println("꺼내오기 > "+list2.get(1));
		System.out.println("포함여부 > "+list2.contains("two"));
		System.out.println("삭제 > "+list2.remove(1));
		System.out.println(list2);
		
	}//end psvm

}//end class










//




