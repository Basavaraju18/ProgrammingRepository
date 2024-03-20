package com.jsp.raghu;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArray {
	
	public void  arraySum() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of thhe array");
		int size =ip.nextInt();
		int[] arr = new int [size];
		
		System.out.println("Enter the array elements");
		for(int i=0 ; i<arr.length; i++) {
			arr[i]=ip.nextInt();
		}
		double sum=0;
		for(int j=0; j<arr.length; j++) {
			sum=sum+arr[j];
		}
		System.out.println(sum);
	}

	
	public static void arraySumNormal() {
		int[] arr= {10, 5,20, 40, 40};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
		private static void  maxNum() {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = ip.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=ip.nextInt();
		}
		int max=0;
		for(int j=0; j<arr.length; j++) {
			if(arr[j]>max) {
				max=arr[j];
			}
		}
		System.out.println(max);
	}
		
		private static void maxNumberInArrrayInGenaral() {
			int max=0;
			
			int arr[] = {10, 39, 34, 58, 38, 0, -12};
			
			for(int i=0; i<arr.length; i++) {
				int min=arr[1];
				if(arr[i]<min) 
					min=arr[i];
				
			}
			System.out.println(max);

		}
	public static void main(String[] args) {
//		arraySumNormal();
//		  maxNum();
		  maxNumberInArrrayInGenaral();
		
	}
}
