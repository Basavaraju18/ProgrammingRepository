package com.jsp;


public class StringIdeol {
	
	private static boolean stringPalindrome() {
		
		String s1 = "level";
		String s2 = "";
		for(int i=s1.length()-1; i>=0; i--) {
			s2=s2+s1.charAt(i);
		}
		return s1.equals(s2);
	}
	

	public static void main(String[] args) {
	
		boolean result = stringPalindrome();
		if(result) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}


}
