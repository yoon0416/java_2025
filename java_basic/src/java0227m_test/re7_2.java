package java0227m_test;

public class re7_2 {
	public static void hi() {System.out.println("hi");}
	public static void hi(int a) {System.out.println("hi "+a+" 님");}
	public static String hi(String a) {return "hi sally";}
	
	public static void main(String[] args) {
		  hi();   // hi 출력
		    hi(1);   // hi 1 님! 출력
		    System.out.println( hi("sally") );   // hi sally 출력


	}

}
