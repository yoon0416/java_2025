package java0227m_test;

public class Repeat004 {
	
	public static void arr1() {

		String[] arr = new String[] {"a", "b", "c"};

        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
	}
}

	public static void main(String[] args) {
		arr1();

	}

}
/*
0. new를 이용하여 다음과 배열을 작성한다.
1. 배열명 : arr
2. 값     : a  b   c
3. for + length 를 이용하여  배열안의 a,b,c을 출력하시오.
*/