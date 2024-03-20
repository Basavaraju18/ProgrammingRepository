package com.string;

import java.util.Scanner;

public class WordToCapital {
	
	
	private static void capital2() {

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	private static void capital() {
		Scanner ip = new Scanner(System.in);
		System.out.println("ENter teh String :");
		String s1= ip.nextLine();
		
		char[] c=s1.toCharArray() ;
		String ms="";
		for (int i = 0; i < c.length; i++) {
			if(i>3 && s1.charAt(2)!=' ')
			if(c[i-2]==' ') {
				ms=ms+Character.toUpperCase(c[i]);
			}
			else 
				ms=ms+c[i];
			
		}
		System.out.print(s1.charAt(0));
		System.out.print(Character.toUpperCase(s1.charAt(1)));
		System.out.print(s1.charAt(2));
		System.out.print(s1.charAt(3));
		System.out.println(ms);
	}
	
	public static void main(String[] args) {
//		capital();
		capital2();
	}

}
