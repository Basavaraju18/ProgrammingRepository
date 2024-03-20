package com.string;

public class RemoveDuplicatesString {


	private static void method1() {
		String s1 = "welcome to java";
		char[] c = s1.toCharArray();

		for (int i = 0; i < c.length; i++) {
			// Skip if the character is already marked as a duplicate
			if (c[i] == ' ')
				continue;

			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					// Mark duplicate characters with a space
					c[j] = ' ';
				}
			}

			// Print the non-duplicate character
			System.out.print(c[i]);
		}
	}

	private static void method2() {
		
		String s1="Hi Chaithra how are you";
		char[] c=s1.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' ') {
				continue;
			}
			
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]) {
					c[j]=' ';
				}
			}
			System.out.print(c[i]);
		}
	}

	public static void main(String[] args) {
//		method1();
		method2();
	}
}
