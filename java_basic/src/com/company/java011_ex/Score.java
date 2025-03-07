package com.company.java011_ex;

public class Score {
    private String name;
    private int kor, eng, math, total;
    private double aver;
    private String p, s, rank;

    
    public Score() {this.name = this.p = this.s = this.rank = "";}

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.aver = total / 3.0;
        this.p = (aver >= 60) ? "합격" : "불합격";
        this.s = (aver >= 90) ? "장학생" : "";
        this.rank = getRank();
    }

    
   
    @Override
	public String toString() {return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";}



	public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getKor() {return kor;}

    public void setKor(int kor) {this.kor = kor;}

    public int getEng() {return eng;}

    public void setEng(int eng) {this.eng = eng;}

    public int getMath() {return math;}

    public void setMath(int math) {this.math = math;}

    public int getTotal() {return total;}

    public void setTotal(int total) {this.total = total;}

    public double getAver() {return aver;}

    public void setAver(double aver) {this.aver = aver;}

    public String getP() {return p;}

    public void setP(String p) {this.p = p;}

    public String getS() {return s;}

    public void setS(String s) {this.s = s;}

    public String getRank() {
       int stars = (int) aver / 10;
       return "*".repeat(stars); //문자반복
        
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
	
	
	
	
	public static void info() {
		 System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	     System.out.println("이름 \t 국어 \t 영어 \t 수학 \t 총점 \t 평균 \t 합격여부 \t 장학생 \t 랭킹");
	     System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
	}
	public void show() {
		this.total = this.kor+this.eng+this.math;
		this.aver = this.total/3.0;
		this.p = this.aver <60 ? "불합격": "합격";
		this.s = this.aver >=95 ?"장학생":"";
		int stars = (int) aver / 10;
		rank = "*".repeat(stars); 
		
	     System.out.printf("%s \t %d \t %d \t %d \t %d \t %.2f \t %s \t %s \t %s\n",this.name, this.kor, this.eng, this.math, this.total, this.aver, p, s, rank);
	}
	
}//end class
