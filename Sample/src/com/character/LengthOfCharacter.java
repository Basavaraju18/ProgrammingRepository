package com.character;

import java.util.Scanner;

public final class LengthOfCharacter {

	public static void LengthOfString(char[] s) {

		String vowles="";
		for(int i=0; i<s.length; i++)
		{
			if(s[i]=='a'|| s[i]== 'e' || s[i] =='i' || s[i]== 'o' || s[i]== 'u')
			vowles=vowles+s[i];
		}
		System.out.println(vowles);

	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the String");
		char[] s1=ip.next().toCharArray();
		LengthOfString(s1);

	}
}
