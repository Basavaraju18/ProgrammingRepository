package com.hackerrank;

public class LeftRotationArray {

	private static int[] leftRotation(int number, int[] arr) {

		for (int i = 0; i < number; i++) {
			int first = arr[0];
			
			for (int j = 0; j < arr.length-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1] = first;
		}
		return arr;
	}
   
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		int number = 2;
		int[] res = leftRotation(number, arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
}
