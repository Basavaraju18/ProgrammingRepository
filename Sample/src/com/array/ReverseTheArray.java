package com.array;

import java.util.Arrays;

public final class ReverseTheArray {
	
//	static void reverseArray(int[] arr) 
//	{
//		int start = 0;
//		int end = arr.length-1;
//		while(start <end)
//		{
//			//Swap the element at start and end
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//
//			//Move towards the center
//			start++;
//			end--;
//		}
//	}
//
//	public static void main(String[] args) 
//	{
//		int[] arr= {1, 2, 3, 4, 5};
//		reverseArray(arr);
////		System.out.println("After swapping: "+ Arrays.toString(arr));
//		
//		System.out.println("Printing array elements");
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.print(arr[i]+" ");
//		}
//	}
//	
	
	public static void main(String[] args) {
		int[] arr= {21, 12, 23, 14, 15};
		int start=0; 
		int end=arr.length-1;
		while(start < end)
		{
			int temp =arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.println("After swapping "+Arrays.toString(arr));
	}

}

/**
 * After doing reverse logic in the reverse method we have to pass the arr variable to the reverse method and after doing all this 
 * we have to print array elements by taking one of this methods 1 type method is Arrays.toString(arr) And another one is by taking for loop 
 */
