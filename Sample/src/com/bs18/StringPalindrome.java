package com.bs18;

public class StringPalindrome {
	
	public static void reverseString(){
		String s1="Basava";
		for (int i =s1.length()-1; i>=0; i--) {
			System.out.print(s1.charAt(i));
			
		}
	}
	
	public static void reverseStringWhile() {
	    String s1 = "Basava";
	    int length = s1.length();
	    int i = length - 1;

	    while (i >= 0) {
	        System.out.print(s1.charAt(i));
	        i--;
	    }
	}

	
	public static void checkStringPalindrome(){
		String s1="LEVEL";
		String s2="";
		
		for (int i =s1.length()-1; i>=0; i--) {
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		reverseString();
		System.out.println("---------");
		reverseStringWhile();
//		checkStringPalindrome();
	
	}

}
