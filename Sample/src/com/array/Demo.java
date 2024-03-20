package com.array;

import java.util.Arrays;

public class Demo {
	
	private static void tirdMax() {

		int[] arr= {1, 2,3,4,5,6,7,8,9,5,10};
		int max=0;
		int smax=max;
		int tmax=smax;
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				tmax=smax;
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax && arr[i] != max) {
				tmax=smax;
				smax=arr[i];
			}
			else if(arr[i]>tmax && arr[i] != smax) {
				tmax=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(smax);
		System.out.println(tmax);
	}
//	===========================================================
	
	private static void usingSort() {
		int[] arr= {1, 3, 5, 2, 7, 9, 2, 55, 2, 6};
		int[] temp2= new int[arr.length];
		
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if((arr[i] != arr[j]) && (arr[i]>arr[j] )) 
				{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
//		System.out.println(arr[arr.length-3]);
	}
	
	public static void main(String[] args) {
		
//		tirdMax();
		usingSort();
		
		
	}

}
