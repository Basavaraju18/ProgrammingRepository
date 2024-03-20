package com.staticinnerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StaticInnerClass {
	static class DescComparator implements Comparator<Integer>
	{
		static int a=10;
		int b=20;
		@Override
		public int compare(Integer o1, Integer o2) {
			return -o1.compareTo(o2);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(DescComparator.a);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(24);
		al.add(53);
		al.add(83);
		al.add(63);
		al.add(53);
		
		Comparator<Integer> mycom=new DescComparator();
		Collections.sort(al);
		
	}

}
