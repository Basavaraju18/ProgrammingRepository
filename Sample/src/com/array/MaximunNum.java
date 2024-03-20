package com.array;

import java.util.Scanner;

final class MaximunNum {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = ip.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=ip.nextInt();
		}
		int max=arr[0]; // we assuming arr[0] is first element in array and it is the maximum element array
		for(int j=0; j<arr.length; j++) {
			if(arr[j] > max) {
				max=arr[j];
			}
		}
		System.out.println(max);
	}
}
