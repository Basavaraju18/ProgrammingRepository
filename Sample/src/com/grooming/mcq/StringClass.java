package com.grooming.mcq;

public class StringClass {
	
	public static void main(String[] args) {
		
		String s1="java";
		String s2="Java";
		
		StringBuilder sb1= new StringBuilder();
		sb1.append("ja").append("va");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}

}


/** A. true is printed out exactly once. 
B. true is printed out exactly twice. 
C. true is printed out exactly three times. 
D. true is printed out exactly four times. 
E. The code does not compile. 
*/