package com.array;

import java.util.Scanner;

public final class CharArray {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the characters");
		
		char[] c1=ip.next().toCharArray();
		
		for(int i=0; i<=c1.length-1; i++)
		{
			System.out.print(c1[i]+" ");
		}
		
		
//		for(char c : c1) 
//			System.out.print(c+" ");
		
	}

}


/** 
 * The toCharArray() method is a built-in method in Java that belongs to the String class. It converts the string to a character array. So, 	
 * when you use ip.next().toCharArray(), you are taking the input as a string using ip.next() and then converting that string to a character 	
 * array.
 */