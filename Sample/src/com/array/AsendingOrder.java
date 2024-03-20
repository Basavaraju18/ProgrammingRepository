package com.array;

import java.util.Arrays;

final class AsendingOrder {


	private static void ascendingOrder() {


		int[] arr = {30, 10, 50, 20, 40,};


		int max=0;
		for(int i=0; i<arr.length; i++) 
		{

			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}
	
	private static void secondMethod() {

		int[] arr= {10, 34, 22, 10, 77, 87, 18, 04};
		
					for(int i=0; i<arr.length; i++)
					{
						for(int j=i+1; j<arr.length; j++)
						{
							if(arr[i]>arr[j])
							{
								int temp=arr[i];
								arr[i]=arr[j];
								arr[j]=temp;
							}
						}			
						
					}
					
			System.out.println(Arrays.toString(arr));		
	}
	public static void main(String[] args) {

//		ascendingOrder();
		secondMethod();

	}

}
