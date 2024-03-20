package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample1 {

	private static void oneHasMap() {
		//Non-generic
		System.out.println("LinkedHashMap");

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "arun");
		map.put(2, null);
		map.put(3, "kiran");
		map.put(4, "varun");
		map.put(3, "updatedkiran");



		Set<Integer> keys = map.keySet();

		for (int key : keys) {
			System.out.println(key+" "+map.get(key));
		}
	}


	private static void oneTreeMap() {
		System.out.println("Treemap");
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "arun");
		try {
		map.put(null, "kiran");
		}
		catch(NullPointerException ex) {
			System.out.println("null values can't be inserted");
		}
		map.put(3, "kiran");
		map.put(4, "varun");
		map.put(3, "updatedkiran");


		Set<Integer> keys = map.keySet();

		for (int key : keys) {
			System.out.println(key+" "+map.get(key));
		}
	}

	public static void main(String[] args) {

		oneHasMap();
		System.out.println("==============");
		oneTreeMap();

	}


}
