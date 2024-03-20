package com.array;

import java.util.Arrays;

public class RotataeTheArray {

	private static void clockwise() {

		int[] arr = {1,2,3,4,5,6,7,8};

		int first = arr[0];
		for(int i = 0; i < arr.length-1; i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=first;

		String res = Arrays.toString(arr);
		System.out.println(res);
	}
	
	//==================================================
	
	private static void antiClockWise() {
		System.out.println("Anticlockwise Rotation");
		int[] arr = {1,2,3,4,5,6,7,8};
		
		int last = arr[arr.length - 1];
		
		for(int i = arr.length-1; i > 0; i--) {
			arr[i]=arr[i - 1];
		}
		arr[0]= last;
		
		String res = Arrays.toString(arr);
		System.out.println(res);
	}
	
	public static void main(String[] args) {

		clockwise();
		antiClockWise();
	}

}
