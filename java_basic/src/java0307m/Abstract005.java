package java0307m;


/*
 ----------------------------------------------
     Fruit
↑	    ↑	    ↑
Apple  Banana  Coconut
----------------------------------------------
 */

abstract class Fruit {
	@Override public String toString() { return "Fruit "; }
	public abstract void myfruit();
}  

class Apple extends Fruit{

	@Override
	public void myfruit() { System.out.println("사과는 빨갛다");  }

	@Override
	public String toString() { return "Apple"; }}
class Banana extends Fruit{

	@Override
	public void myfruit() { System.out.println("코코넛은 코코하다."); }

	@Override
	public String toString() { return "Banana"; }}

class Coconut extends Fruit{

	@Override
	public void myfruit() { System.out.println("사과는 빨갛다");  }

	@Override
	public String toString() { return "Coconut"; }}

public class Abstract005 {
  public static void main(String[] args) {  
	  	Fruit [] fruits = {new Apple() , new Banana() , new Coconut()};
	  	
	  	for (Fruit f : fruits) {
	  		f.myfruit();
	  	}
 
  }
}