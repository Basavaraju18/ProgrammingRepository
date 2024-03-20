package com.bs18;

public class Character {
	
	public static void main(String[] args) {
		String s="arun"; char count = 1;
		for(int i=0; i<=s.length()-1; i++) {
			char c=s.charAt(i);
			 System.out.print(c+" ");
			count++;
			
		}
		
		System.out.println(count);
	}

}
