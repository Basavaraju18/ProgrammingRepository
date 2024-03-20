package com.string;

import java.util.Scanner;

final class StringReverse {
	
	public static void main(String[] args) {
		Scanner ip  = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = ip.next();
		String rev="";
		for (int i=s1.length()-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
	}

}
