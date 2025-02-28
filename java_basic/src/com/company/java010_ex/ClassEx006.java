package com.company.java010_ex;

class Score{
	  String stdid; int kor,eng,math,total;
	  double avg;   
	  void total() { //총점구해주기
		  total = kor+eng+math;
	  }
	 
	  void avg() { //평균구하기
		  total();
		   avg = total/3.0;
	   }  
	  void info() { //학생정보출력  ※힌트2)  info(){    total();  avg();     }  다른메서드에서 메서드 사용가능
		  avg();
		  total();
		  System.out.println("학번 \t kor \t eng \t math \t total \t avg");
//		  System.out.println(stdid+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t");
		  System.out.printf("%s %d \t %d \t %d \t %d \t %.2f",stdid,kor,eng,math,total,avg);
	  }     

	  public Score(){ //기본값 뭐 넣으라고 안해서 그냥 만들기만 했슴다
		  super();
	  }
	  public Score(String stdid,int kor, int eng, int math){
		  this.stdid = stdid;
		  this.kor = kor;
		  this.eng = eng;
		  this.math = math;
	  }

	}//end Score.class



public class ClassEx006 {

	public static void main(String[] args) {
		Score  s1= new Score("std1234" , 100, 100 , 99 ); 
		   s1.info();


	}//end psvm

} //end class
/*
출력내용 :
학번   kor   eng   math   total   avg
std1234   100   100   99   299   99.67
*/