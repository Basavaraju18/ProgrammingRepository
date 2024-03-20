package com.string;

import java.util.Scanner;

public final class VowelsCount {
	
	private static void countVowles() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1 = ip.nextLine();
		char[] ch=s1.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++) {
			char c=ch[i];
			if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		countVowles();
	}

}
