package com.program50;

	
	import java.util.Scanner;

	public class ReverseStringUisngWhileLoop {

	    public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);
	        boolean continueRunning = true;

//	        System.out.println("Enter the Name");
	        String s1 = "LEVEL";
	        char s2  ;
//	        System.out.println(s1.charAt(0));
//	        System.out.println(s1.length());
	        for (int i=s1.length()-1; i>=0  ; i--) {
				s2=s1.charAt(i);
				System.out.print(s2);
			}
	    }
	}

