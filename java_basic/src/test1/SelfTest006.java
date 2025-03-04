package test1;
import java.util.Scanner;
public class SelfTest006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력");
		int kor = sc.nextInt();
		
		if(kor >=90) {
			System.out.println("수");
		}
		else if(kor >=80) {
			System.out.println("우");
		}
		else if(kor >=70) {
			System.out.println("미");
		}
		else if(kor >=60) {
			System.out.println("양");
		}
		else {
			System.out.println("가");
		}

	}

}

/*
* 여러개의 조건
	[1]국어점수를입력해주세요 __입력받기
	90점이상이라면 수	 / 80점 이상이라면 우/ 70점 이상이라면 미 /60점이상이라면 양 / 그 이외 가
*/