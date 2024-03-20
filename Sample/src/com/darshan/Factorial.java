package com.darshan;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the  number");
		int factorial = 1;
		int number = ip.nextInt();
		for(int i=1; i<=number; i++) {
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
	}
}
