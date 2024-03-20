package com.raghu.gromming;

import java.util.Arrays;

public final class CovertingToString {
	void arraysToString() {
	int a[] = {12, 34, 45, 56};
	int i = a[0];
	System.out.println(i);
	String string = Arrays.toString(a);
	System.out.println(string);
	
	
	char[] c= {'a', 'b', 'c', 'd'};
	System.out.println(c[2]);
	String string2 = Arrays.toString(c);
	System.out.println(string2);
	String s1 = new String(c);
	System.out.println(s1+" ");
	
	String s2 = "Basavaraj";
	char[] charArr = s2.toCharArray();
	
	System.out.println(charArr);
	
	}
	
	protected static void normalStringPalindrome() {
		String s1 = "level";
		String rev="";
//		System.out.println(s1.length());
		for(int i = s1.length()-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	public static void main(String[] args) throws InterruptedException {
		  normalStringPalindrome();
	}

}
