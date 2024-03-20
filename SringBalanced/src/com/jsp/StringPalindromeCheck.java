package com.jsp;

public class StringPalindromeCheck {
	
	public static void main(String[] args) {
		
		String s1 = "abbacabba";
		
		/**
		 * 
		
		StringBuilder sb = new StringBuilder(s1); // String to StringBuilder
		sb.reverse();
		
		String rv=sb.toString();  // StringBulider to String
		boolean re = s1.equals(rv);
		System.out.println(re);
		 */
		
//		boolean re =s1.equals(new StringBuilder(s1).reverse().toString());
//		System.out.println( s1+ " ia a Palindrome "+ re);
		
//		StringBuilder sb = new StringBuilder(s1);
//		
//		StringBuilder rv = sb.reverse();
//		System.out.println(rv);
//		String st = new String(rv);
//		if(s1.equals(st)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not a palindrome");
//		}
		
			StringBuilder sb = new StringBuilder(s1);
			StringBuilder rv = sb.reverse();
			String sRev = new String(rv);
			
			if(s1.equals(sRev)) {
				System.out.println("String is palindrome");
			}else {
				System.out.println("String i not palindrome");
			}
		
	}

}
