package com.darshan;

import java.util.Scanner;

public class PrimeNumber {


	public static void main(String[] args) {
		//	        Scanner ip = new Scanner(System.in);
		//	        System.out.println("Enter a number:");
		//	        int number = ip.nextInt();
		//
		//	        boolean isPrime = true;
		//
		//	        if (number <= 1) {
		//	            isPrime = false;
		//	        } else {
		//	            for (int i = 2; i <= number/2; i++) {
		//	                if (number % i == 0) {
		//	                    isPrime = false;
		//	                    break;
		//	                }
		//	            }
		//	        }
		//
		//	        if (isPrime) {
		//	            System.out.println(number + " is a prime number.");
		//	        } else {
		//	            System.out.println(number + " is not a prime number.");
		//	        }
		//	    }



		Scanner  ip = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = ip.nextInt();
		boolean isPrime = true;


		if(number<=1) {
			isPrime=false;
		}
		else {
			for(int i=2; i<number/2; i++) {
				if(number % i==0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not");
		}


	}
}

