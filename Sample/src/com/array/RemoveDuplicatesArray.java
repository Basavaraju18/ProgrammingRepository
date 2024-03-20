package com.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArray {

	public static void main(String[] args) {

		int[] arr = {2, 3, 1, 5, 5, 3, 6, 3, 4, 6, 7, 8, 7, 5, 4, 2};

		Set<Integer> al = new LinkedHashSet<>();

		for(int num : arr) {
			al.add(num);
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(al.toString());

	}

}
