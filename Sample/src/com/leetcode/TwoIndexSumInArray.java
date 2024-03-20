package com.leetcode;

import java.util.Scanner;

public final class TwoIndexSumInArray {


	public int[] twoSum(int[] nums, int target) {

		int[] index= {-1, -1};
		for(int i=0; i<nums.length; i++) {

			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					index[0]=i;
					index[1]=j;

					return index;
				}
			}
		}

		return index;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=ip.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=ip.nextInt();
		}
		System.out.println("Enter the target element");
		int target=ip.nextInt();
		TwoIndexSumInArray a1=new TwoIndexSumInArray();
		int[] result = a1.twoSum(arr, target);

		//Print the result

		if(result[0] != -1) {
			System.out.println("["+result[0]+", "+result[1]+"]");
		}
		else {
			System.out.println("no such elements are found");
		}
	}
}
