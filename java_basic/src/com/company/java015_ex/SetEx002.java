package com.company.java015_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class UserInfo2{
	private int no; private  String name; private  int age; 


	public UserInfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.age =age;
		this.name= name;
	}
	
	@Override
	public String toString() {
		return "번호: " + no + ", 이름: " + name + ", 나이: " + age ;
	}

	public int getNo() { return no; }  public void setNo(int no) { this.no = no; }  public String getName() { return name; }  public void setName(String name) { this.name = name; }  public int getAge() { return age; }  public void setAge(int age) { this.age = age; }

	//Set, Map 중복허용 1)hashCode 2) equals   
	@Override
	public int hashCode() {
		return Objects.hash(no, name, age); // 객체기반생성확인
	}

	@Override
	public boolean equals(Object obj) { //객체 안 값이 같은지 확인
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	} 
	
	
}


public class SetEx002 {

	public static void main(String[] args) {
		Set<UserInfo2> users = new HashSet<>(); 
		
		users.add(new UserInfo2(1, "아이언맨" , 50));
		users.add(new UserInfo2(2, "헐크" , 40));
		users.add(new UserInfo2(3, "캡틴" , 120));
		
		//향상된 포문
		for(UserInfo2 us : users) {System.out.println(us.getNo()+us.getName()+us.getAge());}
		
		System.out.println("------------------");
		
		//iterator
		Iterator <UserInfo2> iter = users.iterator(); //1. Set 모으기 
		while(iter.hasNext()) { //2. 처리대상 확인
			 
			UserInfo2 u = iter.next(); //3.꺼내오기
			System.out.println(u.getNo()+"/"+u.getName()+"/"+u.getAge());
		}
		
		System.out.println("--------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하슈");
		String inputname = sc.next();
		
		iter = users.iterator(); //1.모으기
		while (iter.hasNext()) { // 2. 처리대상 확인

			UserInfo2 u = iter.next(); // 3.꺼내오기
			if (u.getName().equals(inputname)) {
				System.out.println(u.getNo() + "/" + u.getName() + "/" + u.getAge());
			}
			else {System.out.println("해당 이름의 사용자를 찾을 수 없습니다.");break;}
		}
		
		
		
		
//		 boolean found = false;
//	        for (UserInfo2 user : users) {
//	            if (user.getName().equals(inputname)) {
//	                System.out.println(user);
//	                found = true;
//	                break;
//	            }
//	        }
//
//	        if (!found) {
//	            System.out.println("해당 이름의 사용자를 찾을 수 없습니다.");
//	        }

	        
	        
	        
		
	}//end psvm

}//end class


/*
1. UserInfo2    Dto 클래스만들기  - 속성 : private int no; private  String name; private  int age;
2. users   HashSet만들기
3. 다음의 데이터 넣기
   new UserInfo(1, "아이언맨" , 50) , new UserInfo(2, "헐크" , 40) , new UserInfo(3, "캡틴" , 120)
4. 향상된 for / Interator 이용해서 데이터 출력
5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력
*/