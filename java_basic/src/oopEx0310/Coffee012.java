package oopEx0310;

public class Coffee012 {
	
	String name;
	int price; int num;
	
	public Coffee012(String name, int num, int price) {
		this.name=name; this.num=num; this.price=price;
	}
	public Coffee012() {
		name = "아메리카노";
		num = 1;
		price = 2000;
	}
	public void show() {
		System.out.println("=====커피");
		System.out.println("커피명 : "+name);
		System.out.println("커피잔수 : "+num);
		System.out.println("커피가격 : "+ price);
	}
	
	
	public static void main(String[] args) {
		Coffee012 a1 = new Coffee012("까페라떼",2,4000);
		a1.show();
		Coffee012 a2 = new Coffee012();
		a2.show();

	}

}
