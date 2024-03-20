package com.bs18;

public class DeleteArrayElement {
	
	public static void main(String[] args) {
	
		String[] s1 = {"abc", "bbc", "acd", "acd", "bbc"};
		
		for (int i = 0; i < s1.length; i++) {
		
			for (int j = i+1; j < s1.length; j++) {
				
				if(s1[i]==s1[j]) {
					System.out.println(s1[i]);
				}
			}
		}
		
	}

}
