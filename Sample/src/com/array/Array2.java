package com.array;

import java.util.Scanner;

final class Array2 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter teh size of the array");
		int size=ip.nextInt();
		System.out.println("Enter the array elemets");
		int a[]=new int[size];
		
		for(int i=0 ; i<size; i++) {
			a[i]=ip.nextInt();
		}
		System.out.println("Printed array elements are : ");
		
		for(int j=0; j<size; j++) {
			System.out.println(a[j]+" ");
		}
	}
}
