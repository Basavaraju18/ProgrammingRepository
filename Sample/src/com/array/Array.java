// Remember that arrays in Java are zero-indexed, so when accessing elements or iterating over an array, the index starts from 0 and goes up to length - 1.
package com.array;

import java.util.Arrays;
import java.util.Scanner;

final class Array {
	
	public void sampleArray1() {
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter the array size");
	int size = ip.nextInt();
	int arr[] = new int[size];
	System.out.println(arr.length);
	//this loop is to enter/ takes the array elements
	System.out.println("Enter the array elements");
	for(int i=0; i<arr.length; i++) {
		arr[i]=ip.nextInt();
	}
	
	System.out.println("The array elements are");
	System.out.print("{ ");
	for(int j=0; j<arr.length; j++) {
		System.out.print(arr[j]);
		if(j< arr.length-1)
		System.out.print(", ");
	}
	System.out.print(" }");
	}
	
	private void reverseTheArray() {
		int[] arr= {10, 20, 30, 40};
		int[] rev= new int[arr.length];
		
		for (int i =0; i<arr.length; i++) {
			rev[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(rev));
	}


	public static void main(String[] args) throws Exception {

		
		Array a1 = new Array();
		a1.sampleArray1();
//		a1.reverseTheArray();
		
	/*  int[] arr = new int[4];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		 */


		//		int[] arr= {1, 2, 3, 4, 5};  //In this case, you don't need to specify the size of the array explicitly because the compiler will 										determine the size based on the number of elements you provide in the initializer list.
		//		System.out.println(arr.length);
		//		System.out.println("====using for loop=====");
		//		for (int i = 0; i < arr.length; i++) {
		//			if(i==0) 
		//				System.out.print("{ ");
		//			System.out.print(arr[i]+" ");
		//			if(i==arr.length-1)
		//				System.out.print("}");
		//		}

//		Scanner ip = new Scanner(System.in);
//		System.out.println("Enter the size of the array");
//		int size = ip.nextInt();
//		int[] arr = new int[size];
//		
//		System.out.println("Enter the array elements of "+size);
//		for (int a = 0; a < arr.length; a++) {
//			arr[a] = ip.nextInt();
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		ip.close();
	}
}
