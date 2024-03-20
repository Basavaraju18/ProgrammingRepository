package com.character;

import java.util.Scanner;

public final class OccurenceOfCharacter {

	private static void countOccurence(String s1) {
		
		char[] ch=s1.toCharArray();
		int n=ch.length;

		for(int i=0; i<n; i++) 
		{
			int count=1;

			for(int j=i+1; j<n; j++) 
			{
				if(ch[i] == ch[j]) 
				{
					count++;
					ch[j]=' ';
				}

			}
			if(ch[i]!=' ')
				System.out.println(ch[i]+ " --> "+count);
		}
	}

	
	private static void countCharacters(String s1) {

		char[] ch=s1.toCharArray();
		int  count=0;
		for (int i = 0; i < ch.length; i++) {
			count=1;
			for(int j=i+1; j<ch.length; j++) 
			{
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ') {
				System.out.print(ch[i]);
			}
		}
	}
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = ip.nextLine();
		ip.close();
		countOccurence(s1);
//		countCharacters(s1);
	}
}









