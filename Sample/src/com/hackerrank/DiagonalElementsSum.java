package com.hackerrank;

import java.util.Scanner;

public class DiagonalElementsSum {

	public static void main(String[] args) {
		Scanner ip  = new Scanner(System.in);
		int[][] matrix = new int[3][3];
		
		System.out.println("Enter elements for 3X3 matrix: ");
		
		for(int i=0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("Enter elements at position " + (i +1) + ", "+ (j + 1) + ": ");
				matrix[i][j] = ip.nextInt();
			}
		}
//		int[][] matrix= {
//
//				{1, 2, 3},
//				{2, 1, 3},
//				{2, 1, 3}
//
//		};

		// Display the original matrix
		System.out.println("Original matrix: ");
		displayMatrix(matrix);

		// Calculate and display the sum of both diagonals

		int mainDiagonalSum = calculateMainDiagonalSum(matrix);
		int antiDiagonalSum = calculateAntiDiagonalSum(matrix);

		System.out.println("Sum of the main diagonal elements: " + mainDiagonalSum);
		System.out.println("Sum of the main diagonal elements: " + antiDiagonalSum);

		calculateSumOfDiagonalElements(mainDiagonalSum, antiDiagonalSum);
	}

	private static void calculateSumOfDiagonalElements(int a, int b) {;

	int sum=a+b;
	System.out.println(sum);

	}

	private static void displayMatrix(int[][] matrix) {

		for(int i = 0; i < matrix.length; i++) {

			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int calculateAntiDiagonalSum(int[][] matrix) {

		int sum = 0;

		for(int i =0; i <matrix.length; i++) {
			sum += matrix[i][matrix.length - 1 - i]; // Adding the anti diagonal elements
		}

		return sum;
	}

	private static int calculateMainDiagonalSum(int[][] matrix) {

		int sum = 0;

		for (int i = 0; i < matrix.length; i++) 
		{
			sum += matrix[i][i];
		}

		return sum;
	}

}
