package com.hackerrank;

public class StringStoringInArray {

	private void method() {
		// TODO Auto-generated method stub


		String s1 = "hi hello how are you";
		char[] c1 = s1.toCharArray();
		String[] sr = new String[5];
		String sub="";
		for(int i = 0; i < c1.length; i++) {
			if(c1[i] != ' ') {
				 sub=sub+c1[i];
				 
			}
		}
	}
	public static void main(String[] args) {

	}
}
