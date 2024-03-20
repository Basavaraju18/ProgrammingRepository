package com.string;

import java.util.Scanner;

final class NumberOfCharaccter {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=ip.nextLine();
		int count=0;
		for (int i = 0; i < s1.length(); i++) {
			count++;
		}
		System.out.println(count);
	}

}
