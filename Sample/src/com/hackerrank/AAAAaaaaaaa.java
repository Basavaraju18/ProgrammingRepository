package com.hackerrank;

import java.util.Set;
import java.util.TreeSet;

public class AAAAaaaaaaa implements Comparable<AAAAaaaaaaa>{

	String name;
	int age;

	public AAAAaaaaaaa(String name, int age) {
		this.name = name;
		this.age = age;

	}
	@Override
	public String toString() {
		return name+" and "+age;
	}
	
	public int compareTo(AAAAaaaaaaa o) {
		return o.name.compareTo(this.name);
	}

	public static void main(String[] args) {

		AAAAaaaaaaa s1 = new AAAAaaaaaaa("Varun", 22);
		AAAAaaaaaaa s2 = new AAAAaaaaaaa("Arun", 23);
		AAAAaaaaaaa s4 = new AAAAaaaaaaa("drun", 23);
		AAAAaaaaaaa s5 = new AAAAaaaaaaa("wrun", 23);
		AAAAaaaaaaa s6 = new AAAAaaaaaaa("orun", 23);
		AAAAaaaaaaa s3 = new AAAAaaaaaaa("Kiran", 22);
		
		Set<AAAAaaaaaaa> set = new TreeSet<>();
		set.add(s2);
		set.add(s1);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		
		for(AAAAaaaaaaa i : set) {
			System.out.println(i);
		}
		
	}
}

