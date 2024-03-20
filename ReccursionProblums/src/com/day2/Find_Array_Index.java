package com.day2;

public class Find_Array_Index {
	
	static int indexOf(int[] a, int ele, int index) {
		if(index<0) {
		return -1;
	}
	if(a[index]==ele) 
		return index;
		
		return indexOf(a, ele, index-1);
	}
	
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		System.out.println(indexOf(a, 4, a.length-1));
	}
}