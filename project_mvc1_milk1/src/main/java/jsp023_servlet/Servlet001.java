package jsp023_servlet;

public class Servlet001 {
	private int a;
	private int b;
	
	public Servlet001() {
		super();
	}
	public Servlet001(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() { return a; }

	public void setA(int a) { this.a = a; }

	public int getB() { return b; }

	@Override
	public String toString() {
		return "Servlet001 [a=" + a + ", b=" + b + "]";
	}
	public void setB(int b) { this.b = b; }

	
	
}//end class
