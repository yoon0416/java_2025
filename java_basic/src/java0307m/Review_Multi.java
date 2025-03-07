package java0307m;


class Papa{
	int money = 10;
	public Papa() {}
	public Papa(int money) {this.money = money;}
	public String toString() {return "Papa [money = "+money+"]";}
}

class Son extends Papa{
	int money = 150;
	int car = 2;
	public Son() {super();}
	public Son(int money) {this.money = money;}
	public Son(int money, int car) {this.money=money;this.car=car;}
	public String toString() {return "Son [money = "+money+",car="+car+"]";}
}

public class Review_Multi {

	public static void main(String[] args) {
		Papa p1 = new Papa();
		System.out.println(p1);
		
		Son s2 = new Son();
		System.out.println(s2);
		
//		Son s3 = new Papa();
//		System.out.println(s3);
		
		Papa p4 = new Son();
		System.out.println(p4);
		System.out.println(p4.money);
		
		Papa p5 = new Son();
		Son s5 = (Son) p5;
		System.out.println(s5);
		System.out.println(s5.money);
	}

}
