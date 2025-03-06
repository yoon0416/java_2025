package com.company.java_ex_0306;

class A11 {
	int a; //1번

	A11() {
	}

	A11(int a) { //2번
		this.a = a;
	}

	 void show() {} // 뒤에 실행할 명령어? 그게 없음 //3번

	void show(int a) //위에랑 중복 오버로딩 조건도 안맞음
	{
		this.a = 11;
		System.out.println(this.a);
	}

	 void classMethod() { //4번
		this.a = 12; //스태틱에 this씀 this는 인스턴스변수에서만
	}

	int show2() { //5번
		int a = 0; //초기화
		return a;
	}
}

public class RepeatQ123 {

	public static void main(String[] args) {
		{
			A11 a1 = new A11();
		}

	}

}


