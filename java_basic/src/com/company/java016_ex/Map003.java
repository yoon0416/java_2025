package com.company.java016_ex;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map003 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };

		String shap = "#";
		
		for (String s : data) { //값넣기
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1); // 키가 있으면 기존 값에 1을 더함
                
            } 
            else {
                map.put(s, 1); // 키가 없으면 처음 추가할 때 1로 설정
                
            }
        }
		System.out.println(map); //출력1
		
		Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();

		while (iter.hasNext()) {

			Entry<String, Integer> temp = iter.next();
			
			System.out.println(temp.getKey()+":"+shap.repeat(temp.getValue())+temp.getValue());
			
		}
		
	     	List<Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet()); //동적배열 타입 entryList 만들었음 new있다
	       
	     	entryList.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue()); 
	     	//동적배열 entryList를 정렬하는 메서드 실행 > entry1과 2 선언 > entry2의 value값이 1의 value값보다 크다면 내림차순 반대는 오름차순
	        
	    	 System.out.println("보험왕 > "+entryList.get(0).getKey()); 		
	    	 // entryList는 동적배열 타입 객체라서 인덱스 존재 내림차순으로 하엿으니까 젤 큰 값 0에 있음 그래서 보험왕 구할려면 인덱스0의 key값 구하면 끝
		String king; int a=0;
		for(String x : map.keySet()){
			if (map.get(x)>a) {king=x;a=map.get(x);}
		}
		
	}//end psvm

} //end class

/*
1. 주어진조건
String[] data = { "A","D","B","D","B","D","B","C","E","C","B" };
HashMap<String, Integer> map = new HashMap<>();

2. 다음과 같이 출력하시오.
{A=1, B=4, C=2, D=3, E=1}
A:#1
B:####4
C:##2
D:###3
E:#1
보험왕 > [B]

a,b,c,d 개수찾기 count++

rank로 count 젤 많은 애 보험왕?


*/