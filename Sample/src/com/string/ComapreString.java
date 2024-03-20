package com.string;

import java.util.Scanner;

public class ComapreString {

	public static boolean compareStrings(String s1, String s2) {
		// Check if lengths are different
		if (s1.length() != s2.length()) {
			return false;
		}

		// Compare characters one by one
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				return false;
			}
		}

		// If all characters match, the strings are equal
		return true;
	}


	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = ip.nextLine();
		
		System.out.println("Enter the Second String");
		String s2 = ip.nextLine();
		
		System.out.println(compareStrings(s1, s2));
	}
}
