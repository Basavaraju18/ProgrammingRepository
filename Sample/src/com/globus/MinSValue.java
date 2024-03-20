package com.globus;

import java.util.Scanner;
public class MinSValue {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Read input values
		int K = scanner.nextInt();
		int M = scanner.nextInt();
		
		// Calculate the minimum S value
		long minS = calculateMinimumS(K, M);
		
		// Output the result
		System.out.println(minS);

		scanner.close();
	}
	// Function to calculate the minimum S value
	private static long calculateMinimumS(int K, int M) {
		// Calculate the minimum S value based on the number of chunks
		// and the number of 1s in each chunk
		
		long minS = (1L << K) - M;
		return minS;
	}
}