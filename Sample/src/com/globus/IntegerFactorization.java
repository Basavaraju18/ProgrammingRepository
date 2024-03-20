package com.globus;


	import java.util.Scanner;
	
	public class IntegerFactorization {
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			while (true) {
				long n = scanner.nextLong();
				if (n == 0) {
					break;
				}
				System.out.print(n+" = ");
				factorize(n);
			}
			scanner.close();
		}
		// Function to factorize an integer into prime factors
		private static void factorize(long n) {
			if (n <= 1) {
				System.out.println(n);
				return;
			}
			// Trial division
			for (long i = 2; i * i <= n; i++) {
				int count=0;
				while (n % i == 0) {
					n /= i;
					if (n > 1) {

						count++;
					}
				}
				if(count > 0)
					System.out.print(n+"^"+count+" ");
			}
			// If n is still greater than 1, it is a prime number
			if (n > 1) {
				System.out.print(n+" ^ "+1);
			}
			System.out.println();
		}
	}
	

