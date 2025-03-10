package com.company.java015;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//1. 컬렉션프레임워크 - [배열]의 단점을 개선한 [객체]만 저장가능 (동적배열)
//2. List, Set, Map
// LIst - index O, 중복 허용 O, add/get(번호)/size/remove/contains
// Set - index X, 중복 허용 X, add/향상된for, Iterator/size/remove/contains

public class Collection003_Set {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("one"); 
		list.add("one"); 
		list.add("two"); 
		list.add(new String("three")); //객체
		System.out.println(list.size()+"/"+list); //4
		
		Set<String> set = new HashSet<>(); //주머니 : index X, 중복허용 X
		set.add("one"); 
		set.add("one"); //중복!
		set.add("two"); 
		set.add(new String("three")); //객체
		System.out.println(set.size()+"/"+set); //3 중복 x
		
		
		//add, get X, size, remove, contains
		
		//Set<int> set2 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>(); //int 숫자자료형, 객체만 저장
		//int → Integer / float → Float / double → Double,,,, 래퍼클래스(Wrapper Class)
		set2.add(1);
		set2.add(new Integer(2)); // Integer e = new Integer(2);
		set2.add(3); //Integer e = 1;
		int a = 1; //값      기초값 (primitive type)
		Integer e = 1; //부품객체 - boxed - 객체화 - 부품객체
		
		System.out.println(a +"/"+e); //1/1
		System.out.println(/*a.byte*/ "/"+e.byteValue());
		// 1) 부품객체(클래스) = 기초값 boxed
		// 2) 클래스가 만들어놓은기능들 사용 가능 Wrapper
		//int → Integer / float → Float / double → Double,,,, 래퍼클래스(Wrapper Class)
		// 3) Integer.parseInt, Double.parseDouble, String.valueOf
		
		// for + size - get > system.out.println("get"+set2.get(번호));
		for(Integer e1 : set2) {System.out.println(e1);} //꺼내오기 향상된 for
		
		System.out.println("----------------------------");
		
		Iterator <Integer> iter = set2.iterator(); //1. 줄을 서시오! iter → [1,3]
		while(iter.hasNext()) { //2. 처리대상 확인 iter  [→1,3]
			 
			System.out.println(iter.next());//3.꺼내오기
		}
	}

}
