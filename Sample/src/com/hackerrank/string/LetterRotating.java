package com.hackerrank.string;

public class LetterRotating {

	public static String caesarCipher(String s, int k) {

		char[] ch = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				char base = Character.isUpperCase(ch[i]) ? 'A' : 'a';
				ch[i] = (char) ((ch[i] - base + k) % 26 + base);
			}
		}

		return String.copyValueOf(ch);
	}
	public static void main(String[] args) {

		String s1 = "abcdefgh";
		int num = 2;
		System.out.println("Before swapint: "+ s1);
		String res = caesarCipher(s1, num);
		System.out.println("After swaping: "+ res);
	}

}
