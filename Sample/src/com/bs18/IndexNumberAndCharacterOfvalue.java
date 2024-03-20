package com.bs18;

import java.util.Scanner;

public class IndexNumberAndCharacterOfvalue {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		String s3=ip.nextLine();
		String s1 = "level";
		System.out.println(s3.length());
		System.out.println("");
		for(int i=0; i<=s1.length()-1; i++ ) {
			System.out.println("Index of "+ i+" Value is "+s1.charAt(i));
		}
		
	}

}
