package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumElement {
	
	private  void minimumSecondElement() {

		int[] arr= {12, 34, 54, 56, 79, 23 ,07};
		System.out.println("======================");
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(24);
		list.add(10);
		list.add(3);
		list.add(25);
		
		Collections.sort(list);
		for(Integer i : list) {
		System.out.println(i);
		}
		System.out.println("======================");

		int min=Integer.MAX_VALUE;
		int secondMin=min-1;
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]<min)
			{
				secondMin=min;
				min=arr[i];
			}
			
			else if(arr[i]<secondMin && arr[i]!=min)
			{
				secondMin=arr[i];
			}
		}
		System.out.println(secondMin);
	}
	public static void main(String[] args) {
		MinimumElement m1=new MinimumElement();
		m1.minimumSecondElement();
	}

}
