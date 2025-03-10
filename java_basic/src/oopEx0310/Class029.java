package oopEx0310;

class Sawon005{
	int pay = 10000;
	
	static int su =10;
	static int basicpay = pay; //pay는 인스턴스 변수인데 클래스 변수에 할당하려고 함 오류
	static int basicpay2;
	static {basicpay2=20000;}
	
	public static void showSu() {System.out.println(su);}
	public static void showPay() {System.out.println(this.pay);} // 클래스에서는 this 사용 불가
	public void showAll001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
	public static void showAll002() {
		showAll001(); //showAll001 메서드는 인스턴스 메서드 하지만 002는 클래스 메서드 그래서 충돌 인스턴스 메서드는 객체 생성되어야만 호출
		System.out.println(this.pay); //클래스 메서드에서 this 메서드 사용불가
	}
}

public class Class029 {

	public static void main(String[] args) {
		Sawon005 sola = new Sawon005();
		sola.showAll001();

	}

}
