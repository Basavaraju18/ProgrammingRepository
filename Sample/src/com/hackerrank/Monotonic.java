package com.hackerrank;

public class Monotonic {

	private static boolean monotonic(int[] arr) {

		boolean increasing = false;
		boolean decreasing = false;

		for (int i = 0; i < arr.length-1; i++) {


			if(arr[i] <= arr[i+1]) {

				increasing = true;
			}
			else 
			{
				decreasing = true;
			}
		}

		return !(increasing && decreasing);
	}


	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 6, 7, 89, 90};

		boolean res = monotonic(arr);
		System.out.println(res);
	}


}
