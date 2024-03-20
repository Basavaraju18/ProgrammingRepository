
//6)SWEET DISTRIBUTION

package com.array;
	
	import java.util.Arrays;
	import java.util.Scanner;

	public class SweetDistribution {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        long[] sweetWeights = new long[n];

	        // Read sweet packet weights
	        for (int i = 0; i < n; i++) {
	            sweetWeights[i] = scanner.nextLong();
	        }

	        // Sort the sweet weights in ascending order
	        Arrays.sort(sweetWeights);

	        // Distribute sweets between hands to minimize the difference in load
	        long leftHand = 0;
	        long rightHand = 0;
	        for (int i = n - 1; i >= 0; i--) {
	            if (leftHand <= rightHand) {
	                leftHand += sweetWeights[i];
	            } else {
	                rightHand += sweetWeights[i];
	            }
	        }

	        // Calculate the difference in load between both hands
	        long difference = Math.abs(leftHand - rightHand);

	        // Output the minimum difference in load
	        System.out.println(difference);

	        scanner.close();
	    }
	}



