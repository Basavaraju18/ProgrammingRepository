package com.array;

import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInTheArray {

	private static void printDuplicates() {
		String s1="";
		int[] arr= {4,3,3,6,4,1,2};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j] && !s1.contains(String.valueOf(arr[i]))) {
					s1+=arr[i]+" ";
				}
			}
		}
		System.out.println(s1);
	}
	
	
	private static void printuniqueElementsInArray() {
		
		int[] arr = {4, 3, 3, 6, 4, 1, 2, 7};
        Set<Integer> uniqueElements = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            // Check if arr[i] is not equal to any element before it
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            // If arr[i] is unique, add it to the set
            if (isUnique) {
                uniqueElements.add(arr[i]);
            }
        }

        System.out.println(uniqueElements);
    }


	public static void main(String[] args) {
//		printDuplicates();
		printuniqueElementsInArray();
	}
}
;