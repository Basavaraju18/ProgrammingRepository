package com.character;

public class Abc {

	public static String hackerrankInString(String s) {
		
		String h = "hackerrank";
		int j=0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == h.charAt(j)) {
				j++;
			}
			if (j == h.length()) {
				break;
			}
		}
		return j == h.length()? "YES":"NO";

	}
	public static void main(String[] args) {

		String s = "hackerrank";
		String res = hackerrankInString(s);
		System.out.println(res);
	}

}
