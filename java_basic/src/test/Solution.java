package test;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);
	        int answer = 0;
	        int age = sc.nextInt();
	        
	        if(age<=120 && age >0){
	            answer = (2022 - age)+1;
	        }
	        
	        
	        System.out.println(answer);
	    
	}
    
}
// https://school.programmers.co.kr/learn/courses/30/lessons/120820 코테 입문