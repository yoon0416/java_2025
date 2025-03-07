package test1;

public class SelfTest017 {

    public static void main(String[] args) {
        int[][] arr = new int[4][5];  
        int value = 1;  
        
        for(int i = 0; i < arr.length; i++) { //배열에 값 넣기
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value++;
            }
        }

        for(int i = 0; i < arr.length; i++) { //출력
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();  
        }
    }
}

/*
이차원배열
	1.4*5 배열만들기
	2.배열에 1~20까지 데이터 입력
	3.다음과 같이 출력하기 
	
	1	2	3	4	5
	6	7	8	9	10
	11	12	13	14 	15
	16	17	18	19	20
*/
