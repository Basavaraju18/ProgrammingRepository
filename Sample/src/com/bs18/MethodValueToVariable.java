package com.bs18;

public class MethodValueToVariable {

static	int a=sampleMethood();
	
	static int sampleMethood(){
		System.out.println("a value will be 10");
		return 0;
	}
	public static void main(String[] args) {
		System.out.println(a);
		
	}
}
