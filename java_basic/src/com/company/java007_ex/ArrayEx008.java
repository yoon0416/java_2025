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
	    int[] rank = new int[5];
	    
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
	    //평균
	    
	    for(int i=0; i<aver.length; i++){ // i = 랭킹 인덱스
            rank[i] = 1; //1등으로 초기화
           
            for (int j = 0; j < aver.length; j++) { // j = aver 인덱스                           
                if(aver[i]<aver[j]){   //기준데이터가 나머지데이터라 비교했을때 적으면 rank[i] 카운트
                    rank[i]++; //랭킹값 올라감                 
                }              
            }          
        }      
	    // 공부순서 컨트롤파트+2차원배열+동적배열 > 상속 > ?

	    
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
	    System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 평균 \t 합격여부   장학생    등수");
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n");
	    
	    for(int i=0; i<kor.length; i++) {
	    System.out.printf("%s\t%d \t %d \t %d \t %d \t %s \t %s \t %d등\n",name[i],kor[i], eng[i], mat[i], aver[i], hap[i], jang[i], rank[i]);
	    }
	    


	} //end psvm

} //end class
