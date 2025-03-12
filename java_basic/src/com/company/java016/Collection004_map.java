package com.company.java016;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class Collection004_map {

	public static void main(String[] args) {
		//key, value
		Map<String, String> map = new HashMap();
		map.put("one", "하나");
		map.put("two", "둘");
//		map.put("one", "하나"); 		키값이 같으면 덮어씀
		map.put("three", "세엣");
		
		System.out.println(map);
		System.out.println(map.get("one")); // key 값 주고 value 받기
		System.out.println(map.size()); //갯수
		
		System.out.println(map.remove("three")); //삭제 key Object(객체)
		System.out.println(map);
		
		System.out.println(map.containsKey("two")); // 찾고 boolean
		
		System.out.println(map.keySet()); //key 모으기
		System.out.println(map.values()); //value 모으기
		System.out.println(map.entrySet()); //key와 value 모으기 Set <Entry <String, String>>
		
		//출력 향상된 for
		for(Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey()+"/"+m.getValue());
		}
		
		
		//출력 iter - ver1
		// 1. key모으기 / 2. 처리대상확인 hasNext / 3. 값 꺼내오기
		Iterator <String> iter = map.keySet().iterator(); //iter→[one,two]
		
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(key+" / "+map.get(key));
		}
		
		//출력 iter - ver2
		// 1. key모으기 / 2. 처리대상확인 hasNext / 3. 값 꺼내오기

		Iterator <Entry <String, String>> iter2 = map.entrySet().iterator();
		
		while(iter2.hasNext()) {

		Entry <String, String> temp = iter2.next();
		
		System.out.println(temp.getKey()+" "+temp.getValue());
		
		}
		
		
	}//end psvm

} // end class


/*
List : ##5.   기차      인덱스여부 [O  ] ,  중복허용여부 [ O ] ,  [ add, get, size, remove, contains ] 
Set  : ##6.   주머니   인덱스여부  [ X ] ,  중복허용여부  [X  ]  ,   [ add, get(x) 향상된 for/lterator, size, remove, contains ] 
Map  : ##7.   사전      [ key-value ] - 쌍(Entry),        [ get(Key) 향상된 for/lterator, size, remove, contains ] 
*/