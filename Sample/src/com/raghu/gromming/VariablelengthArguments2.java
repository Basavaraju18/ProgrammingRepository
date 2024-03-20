package com.raghu.gromming;

import java.util.Arrays;

public final class VariablelengthArguments2 {
	static void display(double a, double b, int ... c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(Arrays.toString(c));
	}
	
	
	private static void display(int i, int j, double d, String... names) {
		System.out.println(i);
		System.out.println(j);
		System.out.println(d);
		Arrays.stream(names).forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		display(12.2, 1234,4, 89, 78, 75,97);
		System.out.println("===================");
		display(12, 44, 46.0, "Arun", "Kiran", "charan");
	}

	
}

/**
 *  one method can have Onely one varargs can we pass that to in last parameter 
 * 
 */

