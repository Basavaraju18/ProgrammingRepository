package com.program50;

import java.util.Scanner;

public class CountnNumber {
	
	
	public static void usingForLoop() {
		int  count= 0;
		for (int num=1234; num>0;  num/=10 ) {
			count++;
			
		}
		System.out.println("The total digits are "+count);
	}
	
	public static void usingWhileLoop() {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number=ip.nextInt();
		ip.close();
		int count = 0;
		while(number>0) {
			count++;
			number/=10;
		}
		System.out.println("The total digits in the number are "+count);	

	}
	
	
	public static void main(String[] args) {
//		usingForLoop();
		usingWhileLoop();
		
	}

}
