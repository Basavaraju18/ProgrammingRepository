package com.bs18;

public class PrimeNumber2 {
	
	static void isPrime(int m) {
		int count=0;
		for(int i=1; i<=m; i++) {
			if(m%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			isPrime(i);
		}
	}
}
