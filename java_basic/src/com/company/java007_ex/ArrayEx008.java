package com.company.java007_ex;

public class ArrayEx008 {

	public static void main(String[] args) {
		String[] name={"아이언맨","헐크","캡틴","토르","호크아이"};
		int[] kor={100,20,90,70,35};   
	    int[] eng={100,50,95,80,100};
		int[] mat={100,30,90,60,100};
	    int[] aver=new int[5];
	    String[] hap= new String[5];
	    String[] jang = new String[5];
	    
//       1. 평균구하시오.
//	     2. 합격,불합격   -  평균이 60점이상이면 합격, 아니면 불합격으로 처리하시오.
//	     3. 장학생   - 평균 95점이상이면 장학생으로 처리하시오. 
	    
	    for(int i = 0; i<kor.length; i++) {
	    	aver[i] = (kor[i]+eng[i]+mat[i])/3;	
	    	if(aver[i] >=60) {
	    		hap[i] = "합격";
	    	}
	    	if(aver[i] <60) {
	    		hap[i] = "불합격";
	    	}
	    	if(aver[i]>=95) {
	    		jang[i] = "장학생";
	    	}
	    	else {
	    		jang[i] = " ";
	    	}
	    } //end for
	    
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
	    System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 평균 \t 합격여부  장학생");
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
	    
	    for(int i=0; i<kor.length; i++) {
	    System.out.printf("%s\t%d \t %d \t %d \t %d \t %s \t %s \n",name[i],kor[i], eng[i], mat[i], aver[i], hap[i], jang[i]);
	    }
	    


	} //end psvm

} //end class
