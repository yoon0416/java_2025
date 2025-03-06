package com.company.java_ex_0306;

class A{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}
	
}

public class TestArr {

	public static void main(String[] args) {
		A[] arr = new A[3];
		arr[0] = new A(); arr[1] = new A(); arr[2] = new A();
		
		for(A fo : arr) {
		System.out.println(fo);
		}
	}

}
