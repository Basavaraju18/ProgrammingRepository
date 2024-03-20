package com.localinnerclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LocalInnerClass {
	public static void main(String[] args) {
		 class DescComparator implements Comparator<Integer>
			{
				static int a=10;
				int b=20;
				@Override
				public int compare(Integer o1, Integer o2) {
					return -o1.compareTo(o2);
				}
			}
			
		    
			
			
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(23);
			al.add(24);
			al.add(53);
			al.add(83);
			al.add(53);
			
			Comparator<Integer> mycom=new DescComparator();
			Collections.sort(al, mycom);
			Collections.sort(al);
			System.out.println(al);
			
			System.out.println(DescComparator.a);
			System.out.println(new DescComparator().b);
			
		}

}
