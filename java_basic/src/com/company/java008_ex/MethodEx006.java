package com.company.java008_ex;
import java.util.Scanner;

public class MethodEx006 {

	    public static void who_are_you(String [][] users){
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("id를 입력하세요");
	    	String newId = sc.next();
	    	
	    	for(int i = 0; i < users.length; i++) {
	    		if(users[i][0].equals(newId)) {
	    			System.out.println(users[i][0]+"는"+users[i][2]+"사람입니다.");
	    			break;
	    		}
	    		else {System.out.println("똑바로 입력하세유");break;}
	    	}
	    	
	    }//end 메서드

	
	    public static void who_pass_change(String[][] users) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("아이디 입력 : ");
	        String inputId = sc.next();
	        System.out.println("비밀번호 입력 : ");
	        String inputPw = sc.next();

	        boolean Found = false;  

	        for (int i = 0; i < users.length; i++) {
	            if (users[i][0].equals(inputId) && users[i][1].equals(inputPw)) {
	            	Found = true; 
	                System.out.println("변경하실 비밀번호 입력 :");
	                String newPw = sc.next();
	                users[i][1] = newPw; 
	                System.out.println("[정보확인] : " + users[i][0] + ", " + users[i][1] + ", " + users[i][2]);
	                break; 
	            }
	        }

	        if (!Found) {
	            System.out.println("유저를 확인하세요"); 
	        }
	    }


	
	public static void main(String[] args) {
		   // 변수
		   String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
		                      { "bbb" , "222"   , "호주"       } ,       // 10 11 12
		                      { "ccc"  , "333"   , "중국"      }};      // 20 21 22
		   
		   who_are_you(users);    
		   
		   who_pass_change(users); 
		   
		


	} //end psvm

} //end class

/*who_pass_change(users); 
//public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}

아이디를 입력해 주세요 > bbb
비밀번호를 입력해 주세요 > 123
유저를 확인해주세요!

아이디를 입력해 주세요 > bbb
비밀번호를 입력해 주세요 > 222
변경하실 비밀번호를 입력해주세요123
정보확인 : [bbb, 123, 호주]*/

