package com.bs18;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		//		int arr[]=new int[5];
		int size=ip.nextInt();

		int arr[] = new int[size];
		//		arr[0]= 10;
		//		arr[1]= 20;
		//		arr[2]= 30;
		//		arr[3]= 40;
		//		arr[4]= 50;

		System.out.println("Enter " + size + " integer values:");
		for (int i = 0; i < size; i++) {
			arr[i] = ip.nextInt();
		}

		System.out.println("You entered the following values:");
		for (int num : arr) {
			System.out.println(num);
		}
		System.out.println("=================================");
		System.out.println();
		System.out.println("=================================");


		//		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				System.out.print("{ ");
			}
			System.out.print("["+arr[i]+"]");

			if(i<=arr.length-2) {
				System.out.print(", ");
			}

			if(i==arr.length-1) {
				System.out.println(" }");
			}

		}
		ip.close();
	}
}
