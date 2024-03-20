package com.hackerrank.string;

public class FunnyString {
	
	private static String sample(String s) {
	
//		char c1=a; c2= b, c, d,;
		 char[] c = s.toCharArray();
	        int count = 0;

	        for (int i = 0; i < c.length - 1; i++) {
	            int dif = Math.abs( c[i] -  c[i + 1]);
	            int revDif = Math.abs( c[c.length - i - 1] -  c[c.length - i - 2]);

	            if (dif == revDif) {
	                count++;
	            }
	        }

	        if (count == c.length - 1) {
	            return "Funny";
	        } else {
	            return "Not Funny";
	        }

	}
	

	private static  String stringDiffence(String s) {

		char[] c = s.toCharArray();
		int count=0;
		
		
		 for (int i = 0; i < c.length - 1; i++) {
	            int dif = Math.abs((int) c[i] - (int) c[i + 1]);
	            int revDif = Math.abs((int) c[c.length - i - 1] - (int) c[c.length - i - 2]);

	            if (dif == revDif) {
	                count++;
	            }
	        }
		 
		 
		if(count == c.length-1) {
			return "Funney";
		}

		else {
			return "Not Funney";
		}
	}
	public static void main(String[] args) {

		String res = stringDiffence("lmnop");
		System.out.println(res);
		
		String s=sample("abcdef");
		System.out.println(s);
	}

}
