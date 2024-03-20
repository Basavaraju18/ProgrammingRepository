package com.darshan;

import java.util.Scanner;

public class Array {
	//Java Program to illustrate how to declare, instantiate, initialize  
	//and traverse the Java array.  
//	class Testarray{  
		public static void array1(){  
			int a[]=new int[5];//declaration and instantiation  
			a[0]=10;//initialization  
			a[1]=20;  
			a[2]=30;  
			a[3]=40;  
			a[4]=50; 
			//traversing array  
//			for(int i=0;i<a.length;i++)//length is the property of array  
//				System.out.println(a[i]);
			
			for(Integer i: a) {
				System.out.println(i);
			}

		}
		
		
		public static void array2() {
			Scanner ip=new Scanner(System.in);
			System.out.println("Enter the array size");
			int size = ip.nextInt();
			int[] array=new int[size];
			
			System.out.println("Enter he array elements");
			for(int i=0; i<size; i++) {
				array[i]=ip.nextInt();
			}
			
			// Now you have the array with user input values
			System.out.println("Array elements");
			for(int i=0; i<array.length; i++) {
				if(i==0) {
					System.out.print("{ ");
				}
				System.out.print(array[i]);
				if( i<=array.length-2) {
					System.out.print(", ");
				}
				if(i==array.length-1) {
					System.out.print(" }");
				}
				
				
			}
			ip.close();
			
		}
		
		public static void main(String args[]){  
//			array1();
		array2();
			
	}
	
}
