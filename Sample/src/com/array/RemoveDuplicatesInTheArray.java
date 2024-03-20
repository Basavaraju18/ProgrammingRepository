package com.array;

public class RemoveDuplicatesInTheArray {

	private static int[] sortArrayAsscendingOrder() {

		int[] arr= {1,3,4,6,9,5,2,8,6,7,2,1,6,9,6,8};

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		return arr;

	}
	
	

	private static void removeDuplicates(int[] arr) {

		

		int[] t=new int[arr.length];

		int len=arr.length;
		int j=0;

		for(int i=0; i<len-1; i++)
		{
			if(arr[i] != arr[i+1])
			{
				t[j++]=arr[i];
			}
		}
		t[j++]=arr[len-1];


		for(int   i=0; i < j; i++) {
			System.out.print(t[i]+" ");
		}

	}



	public static void main(String[] args) {
		int[] r=sortArrayAsscendingOrder();
		removeDuplicates(r);
	}

}
