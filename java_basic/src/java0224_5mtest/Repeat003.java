package java0224_5mtest;

public class Repeat003 {

	public static void main(String[] args) {
		//for문으로 102030출력
		for(int i=0; i<=30; i++) {
			if(i !=0 && i%10 ==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n-----------------");
		
		//while
		int i = 0;
		while(i<=30) {
			if(i != 0 && i%10 ==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("\n-----------------");
		
		//do while
		i = 0;
		
		do {
			if(i !=0 && i%10 ==0) {
				System.out.print(i+" ");
			}
			i++;
		}while(i<=30);
		
		
		

	} //end psvm

} //end class
