package com.raghu.sample;

import java.util.Scanner;

public class OutOfNumberHowmanyEvenAndHowManyOdd {

	private static void even() {
		Scanner ip  = new Scanner(System.in);
		System.out.println("Enter the array elements");
		int[] arr=new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i]=ip.nextInt();
		}
		
		for(int i=0; i<5; i++) {
			if(arr[i]%2==0)
			System.out.println(arr[i]);
		}
		
		for(int a1 : arr) {
			System.out.println(a1);
		}
//		System.out.println(Arrays.toString(arr));
		
	}
	
	private static  void isOdd() {
	Scanner ip = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int[] arr=new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i]=ip.nextInt();
		}
		
		
		for(int i=0; i<5; i++) {
			if(arr[i]%2 != 0) {
				System.out.println(arr[i]);
			}
		}
		System.out.println("============");
		
		for(int i1 :  arr) {
			if(i1 %2 != 0) {
				System.out.println(i1);
			}
		}
		
	}
	
	public static void main(String[] args) {
//		even();
		isOdd();
	}
}
