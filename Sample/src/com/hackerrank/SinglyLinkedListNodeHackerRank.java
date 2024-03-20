package com.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SinglyLinkedListNodeHackerRank {

	private static List<Integer> removeDupicatesAndReverse(List<Integer> list) {
		
//		Set<Integer> set = new LinkedHashSet<Integer>();

		Set<Integer> set = new TreeSet<Integer>();

		for (int i = 0; i < list.size()-1; i++) {
			set.add(list.get(i));
		}
		
//		for (int i = list.size()-1; i > 0; i--) {
//			set.add(list.get(i));
//		}
		
		
		
		List<Integer> resList = new ArrayList<>(set);
		Collections.reverse(resList);
		return resList;
	}


	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);  
		list.add(4);  
		list.add(1);  
		list.add(5);  
		list.add(2);  
		list.add(3);  
		list.add(4);  
		// 1 4 1 2 3 4



		List<Integer> res= removeDupicatesAndReverse(list);
		System.out.println(res);
	}

}
