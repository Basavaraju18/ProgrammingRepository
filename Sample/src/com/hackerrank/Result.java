package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Result {
	
	

		/*
		 * Complete the 'simpleArraySum' function below.
		 *
		 * The function is expected to return an INTEGER.
		 * The function accepts INTEGER_ARRAY ar as parameter.
		 */

	
		public static int simpleArraySum(List<Integer> ar) {
			// Write your code here



			int sum=0;
			for(int ele:ar){
				sum=sum+ele;

			}

			return sum;

		}
		public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.println("En"
					+ "ter the size of the array");
			int size = ip.nextInt();
			
			List<Integer> arr = new ArrayList<Integer>();
			System.out.println("Enter the array elements");
			for (int i = 0; i < arr.size(); i++) {
				arr.add(ip.nextInt()) ;
			}
			int res=simpleArraySum(arr);
			System.out.println(res);
		}


}
