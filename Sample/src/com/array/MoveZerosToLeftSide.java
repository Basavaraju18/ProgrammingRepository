package com.array;

import java.util.Arrays;

public class MoveZerosToLeftSide {

	public static void main(String[] args) {

		 int[] arr = {2, 0, 3, 0, 4, 5};

	        int last = arr.length - 1;

	        for (int i = arr.length - 1; i >= 0; i--) {
	            if (arr[i] != 0) {
	                arr[last] = arr[i];
	                last--;
	            }
	        }

	        while (last >= 0) {
	            arr[last] = 0;
	            last--;
	        }

	        System.out.println(Arrays.toString(arr));

		
	}

}
