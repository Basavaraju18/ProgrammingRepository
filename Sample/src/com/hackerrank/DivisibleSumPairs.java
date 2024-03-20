package com.hackerrank;

import java.util.List;

public class DivisibleSumPairs {

	private static int divisibleSumPairs(int size, int sum, List<Integer> ar) {

		int count = 0;
		for(int i = 0; i <ar.size(); i++ ){

			for(int j = i+1; j < ar.size(); j++){
				int s= ar.get(i) + ar.get(j);
				if( s % sum == 0)
					count++;
				
			}

		}
		return count;

	}

	public static void main(String[] args) {

		int size = 6;

		int sum = 3;

		List<Integer> ar = List.of(1, 3, 2, 6, 1, 2);

		int res =divisibleSumPairs(size, sum, ar);
		System.out.println(res);
	}

}
