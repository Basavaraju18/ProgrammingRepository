package com.globus;


import java.util.Scanner;

public class BridgeCost {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Read the number of test cases
		int T = scanner.nextInt();
		
		scanner.nextLine(); // Consume the newline
		// Iterate through each test case
		while (T-- > 0) {
			// Read the input values for the test case
			
			String[] input = scanner.nextLine().split("");
			double a = Double.parseDouble(input[0]);
			
			double b = Double.parseDouble(input[1]);
			
			double c = Double.parseDouble(input[2]);
			
			double h = Double.parseDouble(input[3]);
			
			double s1 = Double.parseDouble(input[4]);
			
			double s2 = Double.parseDouble(input[5]);
			
			// Use binary search to find the optimal bridge position
			double left = 0;
			
			double right = c;
			
			while (right - left > 1e-6) {
				
				double mid = (left + right) / 2;
				
				double cost1 = calculateTotalCost(a, b, c, h, s1, s2, mid);

				double cost2 = calculateTotalCost(a, b, c, h, s1, s2, mid +
						1e-6); // A small epsilon for precision
				if (cost1 < cost2) {
					right = mid;
				} else {
					left = mid;
				}
			}
			// Print the minimal total cost rounded to two decimal places
			System.out.printf("%2f%n"+ calculateTotalCost(a, b, c, h, s1, s2, left));
		}
		scanner.close();
	}
	// Function to calculate the total cost for a given bridge position (x)
	private static double calculateTotalCost(double a, double b, double c, double h, double s1, double s2, double x) {
		double roadAtoBridge = Math.sqrt(a * a + x * x);
		
		double roadBtoBridge = Math.sqrt(b * b + (c - x) * (c - x));
		
		return roadAtoBridge * s1 + roadBtoBridge * s1 + h * s2;
	}
}


