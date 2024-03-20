package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumberInArray {
	
	private static int[] missingArraySolver(int[] arr) {
		
		Arrays.sort(arr);
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		for (int i = arr[0]; i < arr[arr.length-1] ; i++) {
			if(!set.contains(i))
			System.out.print(i+" ");
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {2,2,2,9,5};
		
		 missingArraySolver(arr);
	}

	

}
