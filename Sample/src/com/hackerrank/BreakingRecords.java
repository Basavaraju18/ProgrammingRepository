package com.hackerrank;

import java.util.List;

public class BreakingRecords {
	
	private static List<Integer> breakingRecord(List<Integer> l1) {
		
		int highMax = l1.get(0);
		int hmCount = 0;
		int lowMax = l1.get(0);
		int lmCount = 0;

		for (int i = 0; i < l1.size(); i++) {
			if(l1.get(i) > highMax) {
				hmCount++;
				highMax=l1.get(i);
			}
			else if(l1.get(i) < lowMax) {
				lmCount++;
				lowMax=l1.get(i);
			}
			
		}
		
		List<Integer> res = List.of(hmCount, lmCount);
		
		return res;
	}

	
	public static void main(String[] args) {

		List<Integer> l1 = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
		List<Integer> breakingRecord = breakingRecord(l1);
		System.out.println(breakingRecord);
		
	}

	
}
