package com.character;

import java.util.Arrays;
import java.util.Scanner;

public final class SortChar {

	private static void sortCharUsingSorts(char[] s) {
		System.out.println("========");
		Arrays.sort(s);  
        System.out.println(Arrays.toString(s));  
        System.out.println("========");
       
	}   
	private static void sortUsingNormalForLoop(char[] s) {
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i]+" "); 
		}
		
	}
	
	private static void sortUsingForEachLoop(char[] s) {

		for (char c : s) {
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		try(Scanner ip = new Scanner(System.in)){
		System.out.println("Enter the character");
		char[] c1 = ip.nextLine().toCharArray();
		
		sortCharUsingSorts(c1);
		sortUsingNormalForLoop(c1);
		sortUsingForEachLoop(c1);
		}
	}
}
