package com.company.java015_ex;

import java.util.HashSet;
import java.util.Set;

public class SetEx001 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("red");set.add("blue");set.add("green");
		
		System.out.println(set.size()+"/"+set); //3 중복 x
		for(String e1 : set) {System.out.println(e1);}
		
	}

}
/*
연습문제1)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : SetEx001
다음과 같이 코드를 작성하시오.
 1.  Hash이용해서 colors 만들기
 2. red, green, blue ,green 데이터 추가
 3. 출력
 4. 갯수출력  
*/