package com.array;

public class ReverseEverywords{


	private static void reverseEveryWordsInTheString() {
		String s1="I love India";

		String[] s2=s1.split(" ");
		String rev="";

		for (int i = 0; i < s2.length; i++) {

			for (int j = s2[i].length()-1; j >=0; j--) {
				rev	= rev+s2[i].charAt(j);
			}
			
			System.out.print(rev+" ");
			
			rev="";
		}
	}
	public static void main(String[] args) {
		//		reve1();
		reverseEveryWordsInTheString();
	}
}