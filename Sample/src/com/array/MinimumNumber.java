package com.array;

import java.util.Scanner;

public class MinimumNumber {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=ip.nextInt();
		int[] arr=new int[size];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=ip.nextInt();
		}
		int max=Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(arr[0]);
	}
}
