package com.string;

import java.util.Scanner;

class LastLetterInWords {
	
	
	private static void byManoj() {
		String s1=" Hello world ";
		String temp="";
		char[] ch=s1.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if((i==ch.length-1 && ch[i] !=' ') || (ch[i] !=' ' && ch[i+1]==' ' )) {
				temp=temp+ch[i];
			}
		}
		System.out.println(temp);
	}
	
	
	private static void lastLetters() {
		
		String s1 = " Hello world how are you";

		String temp="";
		char[] c=s1.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if((i==c.length-1  && c[i] !=' ' ) ||(c[i] !=' ' && c[i+1]==' ')) {
				temp=temp+c[i];
			}
		}
		System.out.println(temp);
		
		
	}
	
	
	private static void lastLettersByMe() {

		String s1 = "Hellof worldc";
		char[] c = s1.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
             if((i == c.length-1 && c[i] != ' ')|| (c[i] != ' '  && c[i+1]==' ')) {
			System.out.println(c[i]);
			}
		}
	}
	private static void lastWords() {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the String");
		
		String s1 ="BASAVARAJrt DS yug ";

		for (int i = 0; i < s1.length(); i++) {
			char currentChar = s1.charAt(i);

			if (currentChar == ' ') {
				System.out.print(s1.charAt(i - 1) + " ");
			}
			
			else if(i == s1.length() - 1) {
				System.out.println(s1.charAt(i));
			}
		}
	}
	
	
	
	private static void patternName() {
		String s1 = "BASAVA";
		char[] c=s1.toCharArray();
		
		for (int i = 0; i < s1.length(); i++) 
		{
			
			for (int j = 0; j < s1.length(); j++) 
			{
				if(i+j==5) 
					System.out.println(s1.charAt(i));
				
			}
		}
	}         
	

	private static void printEvenCharacter() {
		String s1="BASAVARAJ DS";
		char[] c=s1.toCharArray();
		
		for(int i=1
				; i<c.length; i++) {
			if(i%2==0 ) {
				System.out.println(c[i]);
			}
		}
		
	}
	
	
	private static void swapFirstAndLastLetter() {
		String s1="Hello world";
		char[] c=s1.toCharArray();
		char f=' ';
		for (int i = 0; i < c.length; i++) {
			if(c[i] != ' ') {
				 f=c[i];
			}
			if(c[i] != ' ' && c[i+1]==' ' ) {
				f=c[i];
			}
		}
		
	} 
	
	
	public static void main(String[] args) {
//		firstWords();
		byManoj();
//		arrayList();
//		lastWords();
//		patternName();
//		lastLetters();
//		printEvenCharacter();
//		lastLettersByMe();
//		swapFirstAndLastLetter();
	}
}


