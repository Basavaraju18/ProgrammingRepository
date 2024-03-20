package com.mrk.innoapps;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SplitArray {

	public static void main(String[] args) {
//		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int length=ip.nextInt();
		
		int[] array=new int[length];
//		int maxLength = 3;
		
		 System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < length; i++) {
//	            System.out.print("Element " + (i + 1) + ": ");
	            array[i] = ip.nextInt();
	        }

	        System.out.print("Enter the maximum length of each subarray: ");
	        int maxLength = ip.nextInt();

		List<int[]> splitArrays = splitArray(array, maxLength);

		// Display the split arrays
		for (int i = 0; i < splitArrays.size(); i++) {
//			System.out.println("Split Array " + (i + 1) + ": " + Arrays.toString(splitArrays.get(i)));
			System.out.println(Arrays.toString(splitArrays.get(i)));
		}
	}

	private static List<int[]> splitArray(int[] array, int maxLength) {
		List<int[]> splitArrays = new ArrayList<>();

		for (int i = 0; i < array.length; i += maxLength) {
			int endIndex = Math.min(i + maxLength, array.length);
			int[] subarray = Arrays.copyOfRange(array, i, endIndex);
			splitArrays.add(subarray);
		}

		return splitArrays;
	}
}