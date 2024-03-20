package com.bs18;

public class SubString {

	public static void main(String[] args) {
		String str="Adress Name";
		String str2="Adress1 Name";
		System.out.println(str.charAt(2)); //char at index will give us to index position of the String
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(9));
		System.out.println(str.concat(" DK halli"));
		System.out.println(str.compareTo("arun"));
		System.out.println(str.equals(str2)); 
	}
}
