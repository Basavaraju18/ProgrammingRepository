
package com.day2;

public class Reverse_The_Number {
	
	static int reverse(int rev, int n) {
		if(n==0) {
			return rev;
		}
		return reverse(rev*10+n%10, n/10);
	}
	
	static int reverse(int n) {
		if(n==0) {
			return 0;
		}else {
			System.out.println(n%10);
			return(n/10);
		}
	}
	public static void main(String[] args) {
		reverse(100);
	}
}

