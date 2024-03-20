package com.raghu.stream;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		        if (num <= 1) {
		            return false;
		        }
		        for (int i = 2; i <= num/2; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }

	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enteer the number");
		int num = ip.nextInt();
		for(int j = 2; j <= num ; j++) {
			if(isPrime(j))
			System.out.println(j+" ");
			
		}
		
	}
}
