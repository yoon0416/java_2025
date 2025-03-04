package com.company.java011_ex;

public class Score2 {
	private String name;   // 셋팅 setName() ,가져오기 getName()
	   private int kor, eng, math;  // setKor , getKor /  setEng , getEng / setMath , getMath
	   private double avg;
	   private String pass;
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	
	@Override
	public String toString() {
		return "Score2 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass="
				+ pass + "]";
	}
	public Score2() {
		super();
	}
	public Score2(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (kor + eng + math)/3.0;
		this.pass = (avg >= 60) ? "합격" : "불합격"; 
	}
	
	

}
