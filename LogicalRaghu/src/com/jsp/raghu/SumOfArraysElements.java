package com.jsp.raghu;

import java.util.Scanner;

public class SumOfArraysElements {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.println("enter the array size");
		int size = ip.nextInt();
		int[] arr1 = new int[size];
		System.out.println("enter the "+size+" Elements of array");
		for(int i=0; i<size; i++) {
			arr1[i]=ip.nextInt();
		}
		double sum=0.0;
		
		for(int j=0 ; j<arr1.length; j++) {
			sum=sum+arr1[j];
		}
		double avg=sum/size;
		System.out.println("Sum of "+size+" elements are "+ sum);
		System.out.println("Avg of "+size+"array are "+avg);
	}
}
