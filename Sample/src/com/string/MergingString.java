package com.string;

public class MergingString {

	public static void main(String[] args) {

		String s1 = "abc";
		String s2 = "123";
		

		int i = 0;
		int j = 0;
		String res = "";
		while(i < s1.length()  || j < s2.length() ) {

			if(i < s1.length() ) {
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

}
