package com.string;

import java.util.Scanner;

public final class NoOfWords  {

	private static void noOfWords() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the words");
		String s1=ip.nextLine();
		int count=0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);
	}
	
	public static void main(String[] args) {
		noOfWords();
	}
}

