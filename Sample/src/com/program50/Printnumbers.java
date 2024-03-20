package com.program50;


public class Printnumbers {
	
	public static void main(String[] args) {
	
		int n=1234;
		int modular=n%10;	 	// Ampersand(%) == gives the last digit of the numbers
		int div=n/10;			// division(/)  == it removes the last digit from the number
		System.out.println(modular);
		System.out.println(div);
		
	}
}
 