// Array is a collection of homogeneous data.
// Array is a predefined class which is present in java.lang package.
// Array is index based.
package com.bs18;

public class Array{
	
	public static void main(String[] args) {
	int arr[]= {1, 2, 3, 4, 5};
//	int ans=arr[1];
	 
	   
//	 arr[0]=5; arr[1]=10; arr[2]=20; arr[3]=30; arr[4]=40; 
	int arr1[]= {1, 2, 3, 4, 5};
	System.out.println("Its the size of the array "+arr1.length);
//	 String comma=",";
	 
	 for (int i=0; i<arr1.length; i++) {
		 if(i==0) {
			 System.out.print("{ ");
		 }
		
		 System.out.print("["+arr[i]);
		 System.out.print("]");
		 
		 if(i<=arr.length-2) {
			 System.out.print(", ");
		 }
		 if(i==arr.length-1) {
			 System.out.println(" }");
		 }
	 }
	 
	 
//	System.out.println(arr[0]);
//	System.out.println(arr[2]);
//	System.out.println(arr[1]);
//	System.out.println(arr[3]);
//	System.out.println(arr[4]);
	// https://brainly.in/question/41724704
	
	}
}
