package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004{ 
	
	public static int process_total(int kor, int eng, int math) {return kor+eng+math;}
	public static float process_avg(int total) {return (float) (total / 3.0);}
	public static String process_pass(double avg, int kor, int eng, int math) {
        if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
            return "합격";
        } else if (kor < 40 || eng < 40 || math < 40) {
            return "재시험";
        } else {
            return "불합격";
        }
    }
	public static String process_scholar(double avg) {
		if(avg>=95) {
			return "장학생";
		}
		return null;
	}
	public static String process_star(double avg) {
        int stars = (int) avg / 10;
        return "*".repeat(stars); //문자반복
    }
	
	public static void process_show(String name,int kor,int eng,int math,int total,float avg,String pass,String jang,String star) {
		 System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: ");
	      System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부 \t 장학생 \t 랭킹");
	      System.out.println("--------------------------------------------------------------------------------------------");
//	      System.out.println(name+kor+eng+math+total+avg+pass+jang+star);
	      System.out.printf("%s \t %d \t %d \t %d \t %d \t %.1f \t %s \t         %s \t %s",name, kor, eng, math, total, avg,pass,jang,star);
	}
	
	
	   public static void main(String[] args) {
	      /////////////////////(1)  변수
	      String name  = ""; 
	      int kor, eng, math, total ;
	      float avg = 0.0f; 
	      String pass = "";
	      String jang = "";
	      String star= ""; 
	      String level_kor="" , level_eng="" , level_math=""; //왜있지
	      String re = ""; //얜 뭐지
	      Scanner sc = new Scanner(System.in);
	      
	      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
	      System.out.println("이름을 입력하세요: ");
	      name = sc.next();
	      System.out.println("국어점수 입력하세요: ");
	      kor = sc.nextInt();
	      System.out.println("영어점수 입력하세요: ");
	      eng = sc.nextInt();
	      System.out.println("수학점수 입력하세요: ");
	      math = sc.nextInt();
	      
	      /////////////////////(3) 처리 : 
	      total = process_total(kor , eng, math);    // 1. 총점처리
	      
	      avg = process_avg(total);    //2.  평균처리
	      
	      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	      pass = process_pass(avg , kor, eng, math);  
	      
	      //////// 4. 평균이 95점이상이면 장학생
	      jang = process_scholar(  avg  ); 
	      
	      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
	      star = process_star(avg);  
	      
	      
	      /////////////////////(4) 출력
	     
	      process_show(name, kor, eng, math, total, avg, pass, jang, star);
	    
	      sc.close();
	   }
}// end main
