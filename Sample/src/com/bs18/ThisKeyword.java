package com.bs18;

public class ThisKeyword {


	public void one() {
		System.out.println("first method");
	}

	public void second() {
		this.one();
		System.out.println("Second method");
	}

	public void third() {
		this.second();
		System.out.println("Third method");
	}

	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword();
		t.third();
	}

}
