package com.company.java002;
import java.util.Scanner;
public class Print001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.줄바꿈");
		
		System.out.print("2. 줄바꿈 안됨 print");
		System.out.println("- 줄바꿈은 println 사용해야함");
		
		System.out.println(10+3);
		System.out.println(10+3+"+"+1+2);
		System.out.println("1+2=3");
		
		//알아서 연습
		int age = 24;
		String name = "안윤기";
		
		System.out.println("내 이름은 "+name+"이고 나이는 "+age+"살입니다");
		System.out.printf("내 이름은 %s이고 나이는 %d살입니다.",name,age);
		System.out.println("");
		
		//입력문
		System.out.println("이름을 입력하세요: ");
		String name2 = sc.next();
		
		System.out.println("나이를 입력하세요: ");
		int age2 = sc.nextInt();
		
		System.out.printf("이름은 %s이고 나이는 %d살 입니다.",name2,age2);
	}

} //end class





