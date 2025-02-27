package java0227m_test;
import java.util.Scanner;
public class Repeat001 {

	public static String ver(char a) {
		if(a == 'j') {return "java";}
		else if(a == 'h') {return "html";}
		else if(a=='c') {return "css";}
		return null;
		
	}
	public static void main(String[] args) {
		System.out.println("j || h || c를 입력하세요");
		Scanner sc = new Scanner(System.in);
		char b = sc.next().charAt(0);
		
		System.out.println(ver(b));

	}

}
