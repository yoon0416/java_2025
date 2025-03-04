package test1;

public class SelfTest016 {

	public static void main(String[] args) {
		int[][] arr = {{100,101,102},{200,201,202}};
		
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
/*
이차원배열
	1. 2*3배열만들기
	2. for구문을 이용하여 다음과 같이 데이터 입력
	3. for구문을 이용하여 다음과 같이 데이터 출력
	   100	101 102
	   200	201 202
*/