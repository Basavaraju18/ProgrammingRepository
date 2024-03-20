package com.string;

public final class SampleString {

	
	
	public static void main(String[] args) {


		String s1="java";
		
		String s2=new String("java");
		s1="java programm";
		System.out.println(s1+" -> "+s1.hashCode());
		System.out.println(s2+" -> "+s2.hashCode());
		
	}

}
