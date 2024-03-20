package com.character;

public class CountCharacters {

	private static void countEveryWord() {
		String s1="karthik";
		char[] c1=s1.toCharArray();
		int count=0;
		for (int i = 0; i < c1.length; i++) {
			
			count=1;
			for (int j = i+1; j < c1.length; j++) {
				if(c1[i]==c1[j]) {
					count++;
					c1[j]=' ';
				}
			}
			
			if(c1[i]!=' ')
				System.out.println(c1[i]+" --> "+count);
		}
	}

	public static void main(String[] args) {
		countEveryWord();
	}

}
