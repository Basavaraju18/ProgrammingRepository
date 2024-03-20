package com.jsp.filehandling;

import java.util.Enumeration;
import java.util.Vector;


// p
public class UsingEnuarationPrinting {


	public static void main(String[] args) {

//		File f = new File("C:\\Users\\User\\Desktop\\BAS18");
		
		Vector<String> v= new Vector<>();
		v.add("Ramesh");
		v.add("aamesh");
		v.add("tamesh");
		v.add("jamesh");
		System.out.println(v);
		
		Enumeration<String> en = v.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}
}