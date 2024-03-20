package com.globus;

import java.util.Scanner;

public class PebbleGame {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		int testCase = 1;
		
		while (scanner.hasNextLine()) {
		
			String bitString = scanner.nextLine().trim();
			
			int operations = solvePebbleGame(bitString);
			
			System.out.println("Game# " + testCase +":" + operations);
			
			testCase++;
		}
	}

	public static int solvePebbleGame(String bitString) {
		int operations = 0;
		
		int n = bitString.length();
		
		char[] bits = bitString.toCharArray();
		
		for (int i = 0; i< n; i++) {

			if (bits[i] == '1') {
				
				operations++;
				
				// Flip the current bit and all bits to the right
				for (int j = i; j < n; j++) {
					bits[j] = (bits[j] == '0') ? '1' : '0';
				}
			}
		}
		return operations;
		
		
	}
}
