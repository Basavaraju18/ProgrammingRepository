package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array_By_NthTime {




	private static void arrayRotation() {
		int[] ar1= {1, 2, 3, 4, 5 ,6 ,7, 8,9};
		System.out.println(Arrays.toString(ar1));
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the times you want to rotate the aary");
		int times=ip.nextInt();
		
		for (int i = 0; i < times; i++) {
			
			int first=ar1[0];
			for (int j = 0; j < ar1.length-1; j++) {
				ar1[j]=ar1[j+1];
			}
			ar1[ar1.length-1]=first;
		}
		System.out.println(Arrays.toString(ar1));
	}

	public static void main(String[] args) {
		arrayRotation();
//		int [] a= {1, 2, 3, 4, 5 ,6 ,7, 8,9};
//		//		System.out.println(Arrays.toString(a));
//		Scanner ip= new Scanner(System.in);
//		System.out.println("\nEnter how many times we want to rotate an array");
//		int times=ip.nextInt();
//		ip.close();
//
//		for (int j = 0; j < times; j++) {
//
//			int first=a[0];
//
//			for (int i = 0; i < a.length-1; i++) {
//				a[i]=a[i+1];
//			}
//			a[a.length-1]=first;
//		}
//		System.out.println(Arrays.toString(a));
	}

}
