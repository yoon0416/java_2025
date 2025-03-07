package java0307m;

interface  Animal{
	String NAME="홍길동";    
	void eat();			 
}
 
class Saram implements Animal{ 
	@Override public void eat() {  
		NAME = "아이유"; //name은 final(상수)이기 때문에 수정 불가능하다
		System.out.println(NAME + "이 밥을 먹어요.");
	}
}
public class Interface001_basic {
  public static void main(String[] args) {
	 Animal  ani =  new Animal();   //인터페이스와 추상클래스는 new 불가능
	 Animal  ani = null; //이름 같은거 있어서 그럼
	 ani  = new Saram();  ani.eat();
  }
}
