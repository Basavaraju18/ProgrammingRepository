package com.darshan;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the number");
		int number = ip.nextInt();
		int fact=1;
		for(int i=1; i<number; i++) {
			if(number%i==0) {
				fact++;
				System.out.println(fact);
			}
		}
		System.out.println(fact);
		
	}
}
