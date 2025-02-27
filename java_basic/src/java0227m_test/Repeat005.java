package java0227m_test;

public class Repeat005 {
	public static void arr2() {
		char[][] arr2 = {{'a','b','c'}, {'d','e','f'}};
		
		for(int i = 0; i<arr2.length; i++) {
			for(int j = 0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	

	public static void main(String[] args) {
		arr2();

	}

}
