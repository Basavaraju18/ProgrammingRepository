package com.jsp;

public class StringConcatination {
	
	public static void main(String[] args) {
		
		String s1 = "java";
		String s2 = "programming";
		
		String s7 = "javaprogramming";
		
		String s4 = s1 + s2;  // new String (s1+s2)
		String s5=s1+s2;
		
		String s3 = s1.concat(s2); // new String(s1+s2)
		String s6=s1.concat(s2);
		// when we done  concationation using new + operator or concat() it will folow the new key word way of object creation 
		System.out.println(s4==s5);
		System.out.println(s3==s6);
		System.out.println(s7==s4);
		
		/**
		 * 
		 *  String builder hascode is not overrided
		 *   equals method is not over rided
		 *   
		 */
		
		
	}

}
