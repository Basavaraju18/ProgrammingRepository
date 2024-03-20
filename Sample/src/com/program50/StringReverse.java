package com.program50;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the String/Name");
		String s1 = ip.next();
		String s2="";
		for (int i =s1.length()-1; i >=0; i--) {
			s2=s2+s1.charAt(i);

		}
		if(s1.equals(s2)) {
			System.out.println("String palindrome");
		}else {
			System.out.println("String is not apalindrome");
		}


	}

}
