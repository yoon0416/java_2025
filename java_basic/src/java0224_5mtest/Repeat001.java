package java0224_5mtest;
import java.util.Scanner;
public class Repeat001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = null;
		
		char input = sc.next().charAt(0);		
		if(input == 'a') {
			a = "apple";
		}
		else if(input == 'b') {
			a = "banana";
		}
		else if(input =='c') {
			a = "coconut";
		}
		System.out.println(a);

	}

}
