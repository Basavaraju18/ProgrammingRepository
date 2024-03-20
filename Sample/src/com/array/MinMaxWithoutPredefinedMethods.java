package com.array;	
	
	public class MinMaxWithoutPredefinedMethods {
	    public static void main(String[] args) {
	        int[] array = {1, 23, 45, 12, 56, 7, 89, 34 };

	        // Initialize variables to store minimum and maximum
	        int min = array[0] ; //23
	        int max = array[0] ; //23
	       
	        
	        // Iterate through the array to find minimum and maximum
	        for (int i = 1; i < array.length; i++) {

	            if (array[i] < min) {  
	                min = array[i];
	            }
	            if (array[i] > max) {
	                max = array[i];
	            }
	        }

	        System.out.println("Minimum element: " + min);
	        
	        System.out.println("Maximum element: " + max);
	    }
	}


