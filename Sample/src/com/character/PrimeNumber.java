package com.character;

public final class PrimeNumber {
	
	private static void isPrime(int n) {
		int count=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a prime number");
		}
	

	}
	public static void main(String[] args) {
		isPrime(17);
	}

}
