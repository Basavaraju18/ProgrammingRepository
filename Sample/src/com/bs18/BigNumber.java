package com.bs18;

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) 
	{
		//		int[] arr1= {1, 2, 3, 4, 5};
		//		for(int i=0; i<arr1.length; i++) {
		//			System.out.print(arr1[i]+" ");
		//		}


		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		int[] array = new int[size];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			System.out.print("Element " + (i +1 ) + ": ");
			array[i] = scanner.nextInt();
		}

		scanner.close();

		// Display the entered array
		System.out.println("Entered array elements:");
		for (int i = 0; i < size; i++) {
			System.out.println("Element " + (i + 1) + ": " + array[i]);
		}
	}
}
