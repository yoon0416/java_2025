package ex_m_0311;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class UserInfo{
	private  String name; private  int age;
	public String getName() { return name; } public void setName(String name) { this.name = name; } public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	UserInfo(String name, int age){this.name=name; this.age=age;}
	UserInfo(){}
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
	
}

public class Hi {

	public static void main(String[] args) {
		ArrayList<UserInfo> user = new ArrayList<>();
		user.add(new UserInfo("아이언맨" , 50));
		user.add(new UserInfo("헐크" , 40));
		user.add(new UserInfo("캡틴" , 120));
		
		System.out.println("for+size()");
		for(int i = 0; i<user.size(); i++) {
			System.out.println(user.get(i));
		}//end for.size
		
		System.out.println("-------------------------");
		System.out.println("향상된 for");
		for(UserInfo u : user) {
			System.out.println(u);
		}//향상된 for 끝
		
		System.out.println("\nArrayList 끝\n");
		//---------------------------------------
		
		Set<UserInfo> user2 = new HashSet<>();
		
		user2.add(new UserInfo("아이언맨" , 50));
		user2.add(new UserInfo("헐크" , 40));
		user2.add(new UserInfo("캡틴" , 120));
		
		System.out.println("Iterator");
		Iterator <UserInfo> iter = user2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("----------------------");
		
		System.out.println("향상된 for");
		for(UserInfo u2 : user2) {
			System.out.println(u2);
		}
		
		System.out.println("----------------------");
		
		HashSet<UserInfo> user3 = new HashSet<>();
		user3.add(new UserInfo("아이언맨" , 50));
		user3.add(new UserInfo("헐크" , 40));
		user3.add(new UserInfo("캡틴" , 120));
		
		for(UserInfo s : user3) {
			System.out.println(s.getName()+"/"+s.getAge());	
		}
	
		
	}//end psvm

}//end class

/*
Q1.   다음 빈칸을 채우시오
1. 콜렉션프레임워크
- [     ##1.   ]의 단점을 개선한 클래스 [##2.     ]만 저장가능   ( 동적배열 )
- 저장공간의 크기를 [##3.      ]으로 관리함.


∴1: 배열, 2: 객체, 3: 동적



2. 핵심 인터페이스 [##4. 3개    List , Set Map   ]
- 인터페이스를 통해서 틀이 잡혀 있는 방법으로 
  다양한 컬렉션 클래스를 이용함.

  List : ##5.   기차      인덱스여부 [O  ] ,  중복허용여부 [ O ] ,  [ add, get, size, remove, contains ] 
  Set  : ##6.   주머니   인덱스여부  [ X ] ,  중복허용여부  [X  ]  ,   [ add, get(x) 향상된 for/lterator, size, remove, contains ] 
  Map  : ##7.   사전      [ key-value ] - 쌍(Entry),        [ get(Key) 향상된 for/lterator, size, remove, contains ] 

∴ ##5 인덱스여부 O, 중복허용여부 O, 순서가있음
   ##6 인덱스여부 X, 중복허용여부 X, 순서가 없음
   ##7. key-value, ?

Q2.  ArrayList, HashSet 을 작성하시오.
1. UserInfo    Dto 클래스만들기    - 속성 :  private  String name; private  int age;
2. users ArrayList 만들기
3. 다음의 데이터 넣기
   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
4. for+size / 향상된 for 이용해서 데이터 출력
 

5. sets  HashSet 만들기
6. 다음의 데이터 넣기
   new UserInfo("아이언맨" , 50) , new UserInfo("헐크" , 40) , new UserInfo("캡틴" , 120)
7. for+size / 향상된 for 이용해서 데이터 출력
*/