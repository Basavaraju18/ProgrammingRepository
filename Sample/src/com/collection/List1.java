package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public final class List1 {
 
	private static void arrayList() {
		
		
		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		

		for(Integer a1 : a) {
			System.out.print(a1+" ");
		}
	}
	
	private static void queue1() {
		Queue<Integer> q1 = new LinkedList<>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		
		for(Integer q12: q1 ) {
			System.out.println(q12);
		}

	}
	public static void main(String[] args) {
		arrayList();
		System.out.println("=====");
		queue1();
	}
}
