package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ArrayElementsComparision {

	private static List<Integer> comaparision(List<Integer> a, List<Integer> b) {


		int c1=0;
		int c2=0;

		for (int i = 0; i < a.size(); i++) {


			if(a.get(i) > b.get(i)) {
				c1++;
			}

			else if(a.get(i) < b.get(i)) {
				c2++;
			}

			if(a.get(i) == b.get(i)) {
				c1=c1+0;
				c2=c2+0;
			}

		}
		List<Integer> res = new ArrayList<Integer>();
		res.add(c1);
		res.add(c2);

		return res;


	}

	public static void main(String[] args) {

		List<Integer> a= new ArrayList<Integer>();
		a.add(1);
		a.add(9);
		a.add(3);
		System.out.println("================");
		System.out.println(a.size());
		
		System.out.println("================");
		
		List<Integer> b= new ArrayList<Integer>();
		b.add(3);
		b.add(2);
		b.add(1);


		List<Integer> res=comaparision(a, b);

		for(Integer i : res) {
			System.out.print(i+" ");
		}
	}

}
