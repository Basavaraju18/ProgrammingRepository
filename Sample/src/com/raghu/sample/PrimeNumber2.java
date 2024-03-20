package com.raghu.sample;

import java.util.Scanner;

import com.darshan.Factorial;

public class PrimeNumber2 {
	private static void isPrime(int n) {
		
		int count =0;
		for(int i=1; i<=n; i++) {
			if(n%i==0)
				count++;
			
		}
		if(count==2) {
			System.out.println("Prime Number");
		}
		else 
			System.out.println("Not");

	}
	
	
	private static boolean checkPrime(int n) {
			int count=0;
			for(int i=1; i<=n ; i++) {
			if(n%i==0) {
				count++;
			}
		}
			if(count==2)
				return true;
			else
				return false;
			
		}
	
	
	
	private static  void printingPrimeNumbers() {
		
		for(int i=1; i<=100; i++) {
			if(checkPrime(i))
			System.out.println(i);
		}
		
		
	}
	
	private static void factorial() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ip.nextInt();
		int fact=1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
//		Scanner ip = new Scanner(System.in);
//		System.out.println("Enter the number");
//		isPrime(ip.nextInt());
//		printingPrimeNumbers();
		factorial();
		
	}

}
