package com.bs18;

public final class PrimeNumber {

	private static void isPrime(int num) {
		int count=0;
		for(int j=1; j<=num ; j++) {
			if(num%j==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num);;
		}
	}

	public static void main(String[] args) {

		int num=10;

		for(int i=1; i<num; i++) {
			isPrime(num);
		}
	}


}


