package com.functionalinterface;

public class Lamda {

	public static void main(String[] args) {
		Operation a1=(a,b)->a/b;  // lambda expression
	
		System.out.println(a1.calculate(230, 30));
	}
	
}
