package com.Integer;

import java.util.Arrays;
import java.util.Scanner;



public class ReturningDigits {


	// taking number grater than zero and storing them into array and printing them
	private static void secondMethodByMe() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=ip.nextInt();

		int count = 0;
		int tempNum=num;
		while(tempNum>0)
		{
			count++;
			tempNum/=10;
		}
		//		int size=count;
		int[] arr=new int[count]; 
		int index = arr.length-1;

		tempNum=num;
		while(tempNum>0)
		{
			int last = tempNum%10;
			arr[index]=last;
			tempNum/=10;
			index--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void lastDigit() 
	{
		int num=12345;
		int[] arr=new int[5];
		int index = arr.length-1;

		while(num > 0)
		{
			int last=num%10;
			arr[index]=last;
			num/=10;
			index--;
		}


		//		int sum=(arr[arr.length-1]) + (arr[arr.length-2]);
		//		System.out.println(sum);
		for(int i=0; i<arr.length; i++) {
			//			if(i==arr.length-1 || i==arr.length-2) {
			//				
			System.out.println(arr[i]);
		}
		//		}

		//	System.out.println(Arrays.toString(arr));   // --> it prints the hash code of the array object.
	}

	private static void swapFirstAndLastLettersInEachWords() {

		String s1="Hello World";
		//		
		//		int count=1;
		//		char[] c1=s1.toCharArray();
		//		for (int i = 0; i < s1.length(); i++) {
		//			if(c1[i] == ' ')
		//				count++;
		//		}

		String[] ss= s1.split(" ");
		//		String[] words=new String[count];



		for(int i=0; i<ss.length; i++) {
			if(ss[i] != null) {
				char[] c=ss[i].toCharArray();

				if(c.length > 1) {
					char temp=c[0];
					c[0]=c[c.length-1];
					c[c.length-1]=temp;
				}
				System.out.print(c);
				System.out.print(" ");
			}
		}

	}


	public static void main(String[] args) {

		//		lastDigit();
		//		secondMethodByMe();
		//		swapFirstAndLastLettersInEachWords();
	} 
}
