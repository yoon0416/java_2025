package java0224_5mtest;
import java.util.Scanner;
public class Repeat002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = null;
		
		char input = sc.next().charAt(0);		
		switch(input) {
		case 'a':
			a = "apple";
			break;
		case 'b':
			a = "banana";
			break;
		case 'c':
			a = "coconut";
			break;
		}
		System.out.println(a);
		

	} //end psvm

} //end class