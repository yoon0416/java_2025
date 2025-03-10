package com.company.java015_ex;

import java.util.HashSet;import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Score{
	private String name;
	private int kor;private int math;private int eng;

	public Score(String name, int kor, int math, int eng) {
		this.name=name;
		this.kor=kor;
		this.math=math;
		this.eng=eng;
	}

	@Override
	public int hashCode() { return Objects.hash(name, kor, math, eng); }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return eng == other.eng && kor == other.kor && math == other.math && Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { this.name = name; }  public int getKor() { return kor; }  public void setKor(int kor) { this.kor = kor; }  public int getMath() { return math; }  public void setMath(int math) { this.math = math; }  public int getEng() { return eng; }  public void setEng(int eng) { this.eng = eng; }
	
	
    public int getTotal() {
        return kor + math + eng;
    }

   
    public double getAvg() {
        return getTotal() / 3.0;
    }
}

public class SetEx004 {

	public static void main(String[] args) {
		Set<Score> scores = new HashSet<>(); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new  Score("아이언맨",30,40,50)); 
		scores.add(new Score("헐크"   ,40,60,70)); 
		scores.add(new  Score("캡틴",80,90,100));

		Iterator <Score> iter = scores.iterator(); //1. Set 모으기 
		while(iter.hasNext()) {
		Score s = iter.next();
		System.out.println(s.getName()+" "+s.getKor()+" "+s.getMath()+" "+s.getEng());
		}
		
		Iterator <Score> iter2 = scores.iterator(); //1. Set 모으기 
		while(iter2.hasNext()) {
		Score s = iter2.next();
		System.out.println("이름 : "+s.getName()+"\t국어: "+s.getKor()+"\t수학: "+s.getMath()+"\t영어: "+s.getEng()+"\t총점 : "+s.getTotal()+"\t평균: "+String.format("%.2f", s.getAvg()));
		}
	}

}

/*
1. HashSet 만들기  
2. 아래데이터 넣기
scores.add(new  Score("아이언맨",30,40,50)); 
scores.add(new  Score("아이언맨",30,40,50)); 
scores.add(new  Score("아이언맨",30,40,50)); 
scores.add(new Score("헐크"   ,40,60,70)); 
scores.add(new  Score("캡틴",80,90,100));
> 갯수는 3개로 나오게 만들기   ( hashCode, equals)

3. Iterator로 출력하기 - 사용자정보,총점, 평균
*/