package com.day2;

public class PrimeNum {
	
	static boolean isPrime(int i, int n) {
		if(n%i==0) {
			return false;
		}
		if(i>n/2) {
			return true;
		}
		return isPrime(i+1,n);
	}
	public static void main(String[] args) {
		System.out.println(isPrime(2,7));
	}

}
