package com.string;

public class FindTheDuplicaatesInArrayOfStrings {

	
	public static void main(String[] args) {

		String[] s1 = {"abc", "bca", "cba", "abc", "aab", "bca"};

		
		for (int i = 0; i < s1.length; i++) {
			
			for (int j = i+1; j < s1.length; j++) {
				
				if(s1[i].toString().equals(s1[j].toString())) {
					System.out.println(s1[i]);
				}
			}
		}
		
	}
}
