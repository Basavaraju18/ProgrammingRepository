package com.grooming.mcq;

import java.util.ArrayList;
import java.util.List;

public final class ArrayCode {

 
	public static void main(String[] args) {
		int[] array= {6, 9, 8};
		List<Integer> list=new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
	}
}
