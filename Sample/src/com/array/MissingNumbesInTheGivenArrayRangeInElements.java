package com.array;

public class MissingNumbesInTheGivenArrayRangeInElements {

	private static void missingNumberPrinting() {

		int[] arr= {1, 5};

		for (int i = 0; i < arr.length-1; i++) {
			int f=arr[i]+1;
			int l=arr[i+1];

			while(f<l) {
				System.out.print(f+" ");
				f++;
			}
		}

	}
	public static void main(String[] args) {
		missingNumberPrinting();
	}
}
