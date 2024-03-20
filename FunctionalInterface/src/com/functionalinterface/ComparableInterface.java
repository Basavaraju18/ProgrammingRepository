package com.functionalinterface;

public class ComparableInterface {
	
	public static void main(String[] args) {
		
		Comparable<String> com = new Comparable<String>() {
			// Anonymous implementation for comparable
			@Override
			public int compareTo(String o) {
				
				
				return o.hashCode();
			}
		};
		System.out.println(com.compareTo("A"));
		
		
		// lambda expression foe comparable interface
		
		Comparable<String> com1= (String s1)->s1.hashCode();
		
		System.out.println(com1.compareTo("A"));
		
	}

}
