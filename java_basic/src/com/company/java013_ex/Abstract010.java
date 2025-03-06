package com.company.java013_ex;

abstract class Score{
	private String name;
	private int kor, eng, math;
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	public int getKor() { return kor; }

	public void setKor(int kor) { this.kor = kor; }

	public int getEng() { return eng; }

	public void setEng(int eng) { this.eng = eng; }

	public int getMath() { return math; }

	public void setMath(int math) { this.math = math; }

	public Score(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
}
class ScoreDto  extends Score{
	private String jang;
	private String star;
	private String pass;

	public ScoreDto(String name, int kor, int eng, int math) {
		super(name, kor, eng, math);
		
	}
	public String getJang() { return jang; }
    public void setJang(String jang) { this.jang = jang; }
    public String getStar() { return star; }
    public void setStar(String star) { this.star = star; }
    public String getPass() { return pass; }
    public void setPass(String pass) { this.pass = pass; }
}


//----------------------------------------------------------

abstract class Process extends Score {
	
}

class Total extends Process{}

class Avg extends Process {}

class Jang extends Process{}

class Star extends Process{}

class Pass extends Process{}


abstract class Print{
	abstract void show(ScoreDto std);
	abstract void show(ScoreDto []std);
}

class StdPrint extends Print{

	@Override
	void show(ScoreDto std) {}

	@Override
	void show(ScoreDto[] std) {}
	
}



public class Abstract010 {

	public static void main(String[] args) {
		ScoreDto std = new ScoreDto("헐크",100,100,90);
		Process process = null;
		
		Print print = null;
		
		print = new StdPrint();
		print.show(std);

	}

}
