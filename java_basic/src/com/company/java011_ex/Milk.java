package com.company.java011_ex;

public class Milk {
	private int  mno;   
	@Override
	public String toString() {
		return "Milk [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	private String mname;  
	private  int mprice;  

}
