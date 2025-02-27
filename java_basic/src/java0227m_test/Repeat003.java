package java0227m_test;

public class Repeat003 {
	//for버전 메소드
	public static void for1() {
		for(int i =100; i<=300; i+=100) {
			System.out.print(i+" ");
		}
	}
	
	//while버전 메소드
	public static void while1() {
		int i=100;
		while(i<=300) {
			System.out.print(i+" ");
			i+=100;
		}
	}
	//do while버전 메소드
	public static void dowhile1() {
		int i=100;
		do {
			System.out.print(i+" ");
			i+=100;
		}while(i<=300);
	}
	
	
	public static void main(String[] args) {
		for1();
		System.out.println("\n---------------");
		while1();
		System.out.println("\n---------------");
		dowhile1();

	}

}
