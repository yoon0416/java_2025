package com.company.java011;

class User002 {
	   final String nation = "Korea";   
	   final String jumin;   
	   String name;

	   public User002() { jumin="00000"; }
	   
	   public User002(String jumin, String name) {
	      this.jumin = jumin;
	      this.name = name;
	   }

	@Override public String toString() {
		return "User002 [nation=" + nation + ", jumin=" + jumin + ", name=" + name + "]";
	}
	   
	}
	class FinalEx1{
	   public static void main(String[] args) {
	      User002 user1 = new User002("123456-1234567", "아이유");
	      System.out.println(user1);   
	      
//	      user1.nation = "USA";      //final 상수에 값 변경시도
//	      user1.jumin  = "123123-1234321";  //final 상수 값 변경시도
	      user1.name = "IU"; 
	      System.out.println(user1);   
	   }
	}
	 
/*
	- 메서드 영역: FinalEx1.class / User002.class / nation / jumin
	- 힙: new User002("123456-1234567", "아이유");
	- 스택: 
	
	----------------------------------------------------------------------------
	- 메서드 영역: 
	> 클래스에 대한 정보 저장
	ㄴ클래스, 메서드, 생성자, static이 붙은 변수 및 메서드, final


	- 힙:
	> 동적 메모리 할당을 위해
	ㄴ 객체(new로 생성된 객체), 배열, 인스턴스 변수(클래스의 객체에 속하는 변수라 힙에 저장)


	- 스택:
	> 지역변수와 메서드 호출을 관리
	ㄴ 지역변수, 메서드 호출 시 매개변수, 참조변수
	
	

	
	*/