package com.array;

final class SameElementsInArray {

	private static void sameElements() {
		int[] arr= {10, 20, 20, 30, 40, 50, 10, 60};
		int arr2= 0;
		for (int i = 0; i < arr.length; i++) 
		{
			
			for (int j =i+1; j < arr.length; j++) 
			{
				if(arr[i]==arr[j])
				{
					 System.out.print(arr[j]+" ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		sameElements();
		
	}
}
