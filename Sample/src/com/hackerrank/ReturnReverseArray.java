package com.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnReverseArray {	
	
	
	private static List<Integer> returnReverseArray(List<Integer> list) {

		int start = 0;
		int end = list.size()-1;

		while(start < end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp); 

			start++;
			end--;
		}

		return list;
	}


	private static int[] reverseArray(int[] arr) {

		int start = 0;
		int end = arr.length-1;
		
		while(start < end ) {
			int temp = arr[start];
			start = arr[end];
			end = temp;
		}
		return arr;
	}
	

	public static void main(String[] args) {


		List<Integer> list = List.of(1, 2, 3, 4, 5);
		
        // Convert the list to ArrayList because List.of() returns an immutable list
//		List<Integer> returnReverseArray = returnReverseArray(new ArrayList<>(list));
//		System.out.println(returnReverseArray);
		
		int[]  arr = {1, 2, 3, 4, 5};
		
		int[] res = reverseArray(arr);
		
		System.out.println(Arrays.toString(res));
		

	}
}
