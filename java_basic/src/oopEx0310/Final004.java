package oopEx0310;

class User004{
	char division;
	String jumin;
	
	User004(){
		super();
		division = 'A';
		jumin = "123456-12345687";
	} 
	
	 User004(char division, String jumin) {
	        this.division = division;
	        this.jumin = jumin;
	    }
	
	@Override
	public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]";
	}
	
	
}

public class Final004 {

	public static void main(String[] args) {
		User004 c1 = new User004('b',"200101-12345b7");
		User004 c2 = new User004();

		System.out.println(c1);
		System.out.println(c2);
	}

}
