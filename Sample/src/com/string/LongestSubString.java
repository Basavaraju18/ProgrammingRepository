package com.string;

public class LongestSubString {

	private static void subString() {
		
		String s1="Hi hello how are you";
		
		String[] s2=s1.split(" ");
		
		String max="";
		int subStr=s2[0].length();
		for (int i = 0; i < s2.length; i++) {
			
			if(s2[i].length()>subStr) {
				max=s2[i];
				subStr=s2[i].length();
			}
			
		}
		System.out.println(max);
		

	}
	public static void main(String[] args) {
		subString();
	}

}
