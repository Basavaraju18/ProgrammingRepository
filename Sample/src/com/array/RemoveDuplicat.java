package com.array;

import java.util.Arrays;

public class RemoveDuplicat {

	private void removeDuplicates() {
	        int[] arr = {10, 20, 20, 30, 40, 50, 10, 60};
	        int length = arr.length;

	        // Loop through the array to compare each element with the rest
	        for (int i = 0; i < length - 1; i++) {
	        	
	            for (int j = i + 1; j < length; j++) {
	            	
	                // If a duplicate is found, move the last element to this position and reduce the array length
	            	
	                if (arr[i] == arr[j]) {
	                    arr[j] = arr[length - 1];
	                    length--;
	                    j--; 
	                    // Check the same index again as it now contains a new element from the end
	                }
	            }
	        }

	        // Create a new array with the non-duplicate elements
	        int[] result = new int[length];
	        System.arraycopy(arr, 0, result, 0, length);

	        // Print the array without duplicates
	        System.out.println("Array after removing duplicates:");
//	        for (int num : result) {
//	            System.out.print(num + " ");
//	        }
	        System.out.println(Arrays.toString(result));
	    }

	    public static void main(String[] args) {
	    	RemoveDuplicat a1 = new RemoveDuplicat();
	        a1.removeDuplicates();
	    }
	

		
//			System.out.println(s);
	}
