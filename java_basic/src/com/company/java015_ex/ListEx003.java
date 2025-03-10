package com.company.java015_ex;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


class UserInfo{
	private  String name; private  int age;
	public UserInfo(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + " " + age;
	}
	public String getName() { return name; }  public void setName(String name) { this.name = name; }  public int getAge() { return age; }  public void setAge(int age) { this.age = age; }
	
}//end class




public class ListEx003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<UserInfo> users = new ArrayList<>();
		
		
		 users.add(new UserInfo("아이언맨" , 50));
		 users.add(new UserInfo("헐크" , 40));
		 users.add(new UserInfo("캡틴" , 120));

		 
		 for(int i=0; i<users.size();i++) {
			 UserInfo uf = users.get(i);
			 System.out.println(uf.getName()+uf.getAge());
		 }
		 System.out.println("--------------");
		 
		 for(UserInfo uf : users) {
			 System.out.println(uf.getName()+uf.getAge());
		 }
		
		 System.out.println("--------------------");
		 
		System.out.println("원하는 유저의 이름을 선택하세요 :");
		String inputuser = sc.next();
		
		if(inputuser.equals("아이언맨")) {
			System.out.println(users.get(0));
		}
		else if(inputuser.equals("헐크")) {
			System.out.println(users.get(1));

		}
		else if(inputuser.equals("캡틴")) {
			System.out.println(users.get(2));

		}
		 
		 
			 
	} //end psvm

}//end class



/*
연습문제3)  Collection  Framework
패키지명 : com.company.java015_ex
클래스명 : ListEx003
1. UserInfo    Dto 클래스만들기    - 속성 :  private  String name; private  int age;
2. users ArrayList 만들기
3. 다음의 데이터 넣기
   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
4. for+size / 향상된 for 이용해서 데이터 출력
5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력

> 원하는 유저의 이름을 입력하세요    _예) 아이언맨
"아이언맨" , 50
*/