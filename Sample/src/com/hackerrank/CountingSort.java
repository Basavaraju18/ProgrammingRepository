package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class CountingSort {

	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here

		ArrayList<Integer> res = new ArrayList<>();
		for(int i=0;i<7;i++){
			res.add(0);
		}
		for(int i=0;i<arr.size();i++){
			int a = res.get(arr.get(i))+1;
			res.set(arr.get(i),a);
		}
		return res;

	}
	public static void main(String[] args) {
		
        List<Integer> l1 = List.of(1, 2, 3,4,5,6);
		System.out.println(countingSort(l1));
	}

}

