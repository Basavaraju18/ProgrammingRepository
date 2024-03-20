package com.polymorpisum;

public class ComplieTimePoly {
	
	private void add(int a, int b) {
		System.out.println(a+b);
	}
	
	private void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	private void add(int a, int b, double d) {
		System.out.println(a+b+d);
	}

	public static void main(String[] args) {
		
		ComplieTimePoly c=new ComplieTimePoly();
		c.add(1, 02);
		c.add(3, 3, 5);
		c.add(4, 05, 4.0);
	}
}
