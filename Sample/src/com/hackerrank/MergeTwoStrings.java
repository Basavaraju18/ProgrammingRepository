package com.hackerrank;

public class MergeTwoStrings {

	private static void method01() {
		String s1 = "Hello";
		String s2 = "Bye";

		String res="";
		int i = 0, j = 0;

		while(i < s1.length() || j < s2.length()) {

			if(i < s1.length()) {
				res+=s1.charAt(i);
				i++;
			}

			if(j < s2.length()) {
				res+=s2.charAt(j);
				j++;
			}
		}
		System.out.println(res);
	}

	public static void main(String[] args) {
		method01();

	}

}

