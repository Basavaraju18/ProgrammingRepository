package com.array;

public class SortheArray {
	
	private static int maxMumArray(int[] arr) {
		
		int max=0;
		int secondMax=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			
			else if(arr[i]>secondMax && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		
		return secondMax;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {6,2,5,3,3,6};
		
		int maxMumArray = maxMumArray(arr);
		System.out.println(maxMumArray);
	}
}
