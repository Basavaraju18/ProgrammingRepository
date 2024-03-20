package com.grooming.mcq;

public class MathsFunctions {


	public static void addToInt(int x, int amountToAdd) {

		x = x + amountToAdd;
	} 
	
	public static void main(String[] args) { 
		int a = 15;
		int b = 10;
		MathsFunctions.addToInt(a, b);
		System.out.println(a); 

	}
}
