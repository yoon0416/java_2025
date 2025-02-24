package com.company.java006_ex;

public class RepeatEx009 {

	public static void main(String[] args) {
		
		//for문
		char alpha ='A';
		
		for(int i=0; i<6; i++) { //줄 6개
			for(int j=0; j<5 && alpha <='Z'; j++) { //1줄에 5개 출력할꺼 근데 alpha가 'z'까진 가야지 끝낼꺼임 앞 조건 j가 false가 되면 뒤 z조건은 보지도 않고 끝
				System.out.print(alpha++); //A에 계속 증감시켜 알파벳 순서 abc쭉 나오게 하기
			}
			System.out.println(); //줄 바뀌면 엔터
		}
		
		
		
		
		
		//while----------------
		System.out.println("while------------------------------");
		
		alpha = 'A';
		 int i = 0;
	        while (i < 6) { // 6 rows
	            for (int j = 0; j < 5 && alpha <= 'Z'; j++) { 
	                System.out.print(alpha++);
	            }

	            System.out.println();
	            i++;
		}
	        
	        
	        
	        
	        
		//dowhile------------------------------
	        System.out.println("dowhile------------------------------");

	   alpha = 'A'; 
	   i = 0;

       do {
           for (int j = 0; j < 5 && alpha <= 'Z'; j++) { // 한 줄에 알파벳 5개 출력
               System.out.print(alpha++); // 알파벳 출력 후 증가
           }

           System.out.println(); // 줄 바꿈
           i++;
       } while (i < 6 && alpha <= 'Z'); // 6줄까지 출력, 알파벳이 'Z'까지 출력되면 종료
       
       
       
       
       
   } //end psvm
} //end class