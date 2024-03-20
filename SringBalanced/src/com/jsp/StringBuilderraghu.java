package com.jsp;

public class StringBuilderraghu {

	
	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("Hi");
		System.out.println(sb.capacity());  //initial capacity + Givan String length
		
		sb.append(" Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.hashCode());
		
		StringBuilder sb1 = new  StringBuilder("java");
		StringBuilder sb2 = new  StringBuilder("java");
		
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.capacity());
		
		String ss="hiii";
		sb.reverse();
		
	}
}
