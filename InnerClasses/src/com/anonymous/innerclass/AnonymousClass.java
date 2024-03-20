package com.anonymous.innerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousClass {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(24);
		al.add(53);
		al.add(83);
		al.add(53);
		
		Comparator<Integer> mycom=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
		};
		Collections.sort(al, mycom);
		System.out.println(al);
	}

}
// define the class followed by what object creation