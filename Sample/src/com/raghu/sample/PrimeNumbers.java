package com.raghu.sample;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumbers {

	private static void checkEven() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int fn=ip.nextInt();
		System.out.print("Enter the Second Number : ");
		int ln=ip.nextInt();

		int[] arr=new int[ln-fn];
		System.out.println("Enter the "+(ln-fn)+" array elements");
		for(int i=fn; i<ln; i++) {
			arr[i-fn]=ip.nextInt();
		}

		System.out.println("the highest number is :");
		for (int i = 0; i < arr.length; i++) 
		{
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
				System.out.println(Arrays.toString(arr));

	}
	public static void main(String[] args) {
		checkEven();

	} 

}
