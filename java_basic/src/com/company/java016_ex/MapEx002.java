package com.company.java016_ex;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


class UserInfo{
	private String name;
	private int age;
	
	UserInfo(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 : "+name+"\t나이: "+age;
	}
	UserInfo(){super();}
	
	public String getName() { return name; } public void setName(String name) { this.name = name; } public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	
	
	
}

public class MapEx002 {

	public static void main(String[] args) {
		Map<Integer, UserInfo> map = new HashMap<>();
		map.put(1,new UserInfo("아이언맨", 50));
		map.put(2,new UserInfo("헐크", 40));
		map.put(3,new UserInfo("아이언맨-new", 50));


		Iterator <Entry <Integer, UserInfo>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {

		Entry <Integer, UserInfo> temp = iter.next();
			System.out.println(temp.getKey()+" "+temp.getValue());
		}
		
	}//end psvm

}//end class

/*
Q1. HashMap만들기
Q2. 아래데이터 넣기
map.put(  1,  new UserInfo("아이언맨"    , 50) );  // 1 넣어도 Integer( 클래스, 객체 )
map.put(  2,  new UserInfo("헐크"       , 40) );  // wrapper 클래스
map.put(  3,  new UserInfo("캡틴"       , 120) ); // boxing
map.put(  1,  new UserInfo("아이언맨-new", 50) ); 

Q3. Iterator로 출력하기 - 사용자정보 

*/