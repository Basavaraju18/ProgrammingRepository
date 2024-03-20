package com.program50;

public class Reversenumber {
	
	
	public static void reversreNumber() {
		int num=2345;
		int rev=0;
		while(num>0) {
			int  n=num%10;
			rev=(rev*10)+n;
			num=num/10;
		}

		System.out.println("After reversing the number is "+rev);
	}

	public static void reverseUingForloop() {
		 int rev=0;  int n=0;
		for(int number =12345; number!=0; number/=10) {
			n=number%10;
			rev=(rev*10)+n;
			
		}
		System.out.println(rev);
	}

	
	
	

	public static void main(String[] args) {
		
//		reversreNumber();
		reverseUingForloop();
//		int num=123;
//		int rev=0;
//		while(num>0) {
//			int n=num%10;
//			rev=(rev*10)+n;
//			num=num/10;
//			
//		}
//		System.out.println(rev);
		
	}
}
