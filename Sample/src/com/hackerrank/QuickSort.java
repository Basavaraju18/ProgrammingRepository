package com.hackerrank;
	
/** test Cases
 *  1) 0 -3 6 4 -10 8 -5 2 -7  -->   -3 -10 -5 -7 0 6 4 8 2
 *  2) 2 10 3 7 9 4 6 12 8     -->     2 10 3 7 9 4 6 12 8
 *  3) 45 25 46 48 28 6 13 5 36 44 7 4 11 30 24 34 15 31 38 49    -->   25 28 6 13 5 36 44 7 4 11 30 24 34 15 31 38 45 46 48 49
 */  

	import java.util.ArrayList;
	import java.util.List;

	public class QuickSort {

	    public static List<Integer> quickSort(List<Integer> arr) {
	        if (arr.size() <= 1) {
	            return arr;
	        }

	        int pivotIndex = arr.size() / 2;
	        int pivot = arr.get(pivotIndex);

	        List<Integer> less = new ArrayList<>();
	        List<Integer> greater = new ArrayList<>();
	        List<Integer> equal = new ArrayList<>();

	        for (int i = 0; i < arr.size(); i++) {
	            int element = arr.get(i);
	            if (element < pivot) {
	                less.add(element);
	            } else if (element > pivot) {
	                greater.add(element);
	            } else {
	                equal.add(element);
	            }
	        }

	        List<Integer> sorted = new ArrayList<>();
	        sorted.addAll(quickSort(less));
	        sorted.addAll(equal);
	        sorted.addAll(quickSort(greater));

	        return sorted;
	    }

	    public static void main(String[] args) {
	        List<Integer> input1 = List.of(0, -3, 6, 4, -10, 8, -5, 2, -7);
	        List<Integer> result1 = quickSort(input1);
	        System.out.println("Input 1: " + input1);
	        System.out.println("Output 1: " + result1);

	        List<Integer> input2 = List.of(2, 10, 3 ,7 ,9 ,4 ,6, 12, 8);
	        List<Integer> result2 = quickSort(input2);
	        System.out.println("Input 2: " + input2);
	        System.out.println("Output 2: " + result2);

	        List<Integer> input3 = List.of(45, 25 ,46 ,48 ,28 ,6 ,13 ,5, 36, 44 ,7 ,4, 11 ,30 ,24 ,34 ,15 ,31 ,38, 49 );
	        List<Integer> result3 = quickSort(input3);
	        System.out.println("Input 3: " + input3);
	        System.out.println("Output 3: " + result3);
	    }
	}


