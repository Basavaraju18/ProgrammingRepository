package com.bs18;

public class String1 {
	
	public static void main(String[] args) {
		  String a = "Akkit";	// literal
		  System.out.println(a);
		  
//		  String b = a; 	//literal
//		  System.out.println(b);
		  
//		  a.concat("Kumar"); // this is immutable in nature
		  a=a.concat(" Kumar"); // this will create one new Onject here and then we will get one new String concat
		  System.out.println(a);
	}

}
