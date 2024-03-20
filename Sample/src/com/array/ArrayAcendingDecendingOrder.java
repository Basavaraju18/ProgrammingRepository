package com.array;

public final class ArrayAcendingDecendingOrder {

	public static  void decendOrderOfArray() 
	{
		int[] arr= {200, 18, 100, 300, 600, 900, 400};

		for(int i=0; i<arr.length; i++) 
		{

			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[j]>arr[i]) 
				{
					int	temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}

	}

	private static void ascendOrderArray() 
	{
		int[] arr= {200, 100, 300, 600, 900, 400};

		for(int i=0; i<arr.length; i++) 
		{

			for(int j=i+1; j<arr.length; j++) 
			{
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(arr[i]);
		}

	}


	public static void main(String[] args) {
		ascendOrderArray();
	}
}








//for(int i=0; i<arr.length; i++) {
//	
//	for(int  j=i+1; j <arr.length; j++) {
//		if(arr[i]>arr[j]) {
//			int temp=arr[i];
//			arr[i]=arr[j];
//			arr[j]=temp;
//		}
//	}
//	
//}
//for(int i=0; i<arr.length; i++) {
//	System.out.println(arr[i]);
//} 