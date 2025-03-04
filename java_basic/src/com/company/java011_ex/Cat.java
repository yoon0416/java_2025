package com.company.java011_ex;

public class Cat {
	public int public_;
	protected int protected_;
	int package_;
	private int private_;
	
	//알트쉬프트에스겟터셋터
	public int getPrivate_() {return private_;}
	public void setPrivate_(int private_) {this.private_ = private_;} //Cat 내부에서만 접근가능
	//캡슐화때매 씀
	
/*
 캡슐화가 필요한 경우:

클래스의 내부 데이터나 상태를 외부에서 직접 접근하거나 수정할 수 없게 하여 데이터 무결성을 보호하려는 경우 private을 사용하고 getter/setter를 활용
예를 들어, 비밀번호나 나이 같은 중요한 데이터는 외부에서 임의로 수정되거나 접근되지 않도록 private으로 만들고, 
필요한 경우 setter에서 유효성 검사를 하거나 getter에서 계산된 값을 반환할 수 있음
*/
	 
	
}
