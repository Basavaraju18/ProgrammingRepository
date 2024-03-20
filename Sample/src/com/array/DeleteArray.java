package com.array;

import java.util.Scanner;

class DeleteArray{
	
	
	private static void deleteArrayByNumber() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of the element");
		int size =ip.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the array elements");
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=ip.nextInt();
		}
		System.out.println("Enter eh number you want to delete");
		int num=ip.nextInt();
		
	
		for(int i=0; i<arr.length; i++) 
		{
			
			if(arr[i] !=num )
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}
	// =================================================
	
	
	private static void deleteArrayByIndex() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the size of the array : ");
		int size = ip.nextInt();
		
		int[] arr= new int[size];
		
		System.out.println("Enter the "+size+" elements");
		for(int i=0; i<arr.length; i++ ) {
			arr[i]=ip.nextInt();
		}
		
		System.out.println("Enter the index you want to delete");
		int delete=ip.nextInt();
		
		if( delete < 0 || delete > size) 
			System.out.println("Array index out of range");
		
		else {
		
		for(int i=0; i<arr.length; i++) 
		{
			if(i != delete) 
				System.out.print(arr[i]+" ");
		}
	}
}
	public static void main(String[] args) {
//		deleteArrayByNumber();
		deleteArrayByIndex();
	}

}