package com.array;

import java.util.Arrays;

final class SecondMaximum {
	
	private static void shift() {
		int a1=34;
		a1=a1>>>3;
		System.out.println(a1);
	}
	
	
	private static void ascendingOrder() {
		int[] arr= {1, 2, 43, 54, 32, 21, 0, 34};
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		for(int i=0; i<arr.length; i++)
//		System.out.print(arr[i]+" );
	
		for(Integer a1: arr) {
			System.out.print(a1+" ");
		}
		
//		String result = Arrays.toString(arr);
//		System.out.println(result);

	}
	
	private static void swapFirstAndLastCharacterInWords() {
		String h1="Hello World";
//		String[] words=;
	}

	public static void main(String[] args) {
//		ascendingOrder();
		shift();

		//        int[] arr = {30, 10, 50, 20, 40, 100, 200};
		//
		////        int max = Integer.MIN_VALUE;
		//        int max = 0;
		////        int secondMax = Integer.MIN_VALUE;
		//        int secondMax = 0;
		//
		//        for (int i = 0; i < arr.length; i++) {
		//            if (arr[i] > max) {
		//                secondMax = max;
		//                max = arr[i];
		//            } else if (arr[i] > secondMax && arr[i] != max) {
		//                secondMax = arr[i];
		//            }
		//        }
		//
		//        // Printing the second maximum element
		//        System.out.println("Second maximum element: " + secondMax);
		//    }


//		int[] arr= { 10,3,97, 39,11, 9,65, 33};
//
//		int max=0,  sMax=0, tMax=0;
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]>max) {
//				tMax=sMax;
//				sMax=max;
//				max=arr[i];
//			}
//
//			else if(arr[i]>sMax && arr[i]!=max) {
//				tMax=sMax;
//				sMax=arr[i];
//			}
//			else if(arr[i]>tMax && arr[i]!=sMax) {
//				tMax=arr[i];
//			}
//		}
//		System.out.println(tMax);
//		System.out.println(sMax);
//		System.out.println(max);

		
//		int[] arr= {19, 92, 03, 14, 45, 26, 7};
//		int max=0;
//		int sMax=0;
//		
//		for(int i=0; i<arr.length; i++) 
//		{
//		 if(arr[i]>max) 
//		 	{
//			 sMax=max;
//			 max=arr[i];
//			 
//		 	}
//		 else if(arr[i]>sMax && arr[i] != max)
//		 	{
//			 sMax=arr[i];
//		 	}
//		}
//			System.out.println(sMax);
	
	}
}
