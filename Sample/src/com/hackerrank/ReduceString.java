package com.hackerrank;

public class ReduceString {

	private static void superReducedString() {

		//		System.out.println(11%2);
		String s1="aabccddd";
		char[] c = s1.toCharArray();

		int count = 0;
		for (int i = 0; i < c.length; i++) {

			for (int j = i+1; j < c.length; j++) {

				if(c[i] == c[j]) {
					count++;
					c[j]=' ';
				}
			}
			if(count%2 != 0) 
				System.out.println(c[i]);
		}
	}

	//====================================================================	

	private static  void sample123() {

		StringBuilder s1 = new StringBuilder("helloooooo");
		int i =1;
		s1.delete(i-1,  i +1);
		System.out.println(s1);
	}
	
	//====================================================================
	public static String superReducedString(String s) {
		// Write your code here
		StringBuilder sb = new StringBuilder(s);
		int i = 1;

		while (i < sb.length()) 
		{
			if (sb.charAt(i - 1) == sb.charAt(i)) {
				sb.delete(i - 1, i + 1);
				i = 1;
			} else {
				i++;
			}
		}

		if (sb.length() == 0) 
			return "Empty String";
		
		return sb.toString();
	}


	
	public static void main(String[] args) {   // aabbccdsb --> dsb

		//		superReducedString();
		String s1 = "aabbccd";
		String res = superReducedString(s1);
				System.out.println(res);
//		sample123();
	}
}
