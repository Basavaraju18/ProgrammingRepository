package com.grooming.mcq;

public class Grasshopper {

	public Grasshopper(String n) { 
		name = n;
	} 
	public static void main(String[] args) { 
		Grasshopper one = new Grasshopper("g1");
		Grasshopper two = new Grasshopper("g2");
		one = two;
		two = null;
		one = null;
	} 
	private String name; 

}

/**

A. Immediately after line 9, no grasshopper objects are eligible for garbage collection. 
B. Immediately after line 10, no grasshopper objects are eligible for garbage collection. 
C. Immediately after line 9, only one grasshopper object is eligible for garbage collection. 
D. Immediately after line 10, only one grasshopper object is eligible for garbage collection. 
E. Immediately after line 11, only one grasshopper object is eligible for garbage collection. 
F. The code compiles. 
G. The code does not compile

*/