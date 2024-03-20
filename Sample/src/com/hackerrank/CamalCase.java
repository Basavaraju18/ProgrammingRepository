package com.hackerrank;

public class CamalCase {
	
	private static int campleCasse(String s1) {
		
		char[] c1 = s1.toCharArray();
		
		int count = 1;
		for (int i = 0; i < c1.length; i++) {
			if(c1[i] > 65 && c1[i] < 90  ) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		
		String s1 = "oneTwoThree";
		int res = campleCasse(s1);
		System.out.println(res);
	}

	

}
