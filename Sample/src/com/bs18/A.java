package com.bs18;

import java.util.Scanner;

public class A {
	
	private static void reverseNumber() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = ip.nextInt();
		
		int rev = 0;
		while(num > 0 ) {
			int lastNum = num % 10;
			rev = (rev * 10) + lastNum;
			num = num / 10;
		}
		
		System.out.println(rev);
		
	}
	
	private static void numberPalinderome() {
	
		int num = 123321;
		int temp = num;
		
		int rev = 0;
		
		while(num > 0) {
			int lastNum = num % 10;
			rev = rev * 10 + lastNum;
			num = num /10;
		}
		
		if(rev == temp) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}

	
	private static void sumNumbers() {
		
		int num = 2345;
		int sum = 0;
		
		while(num > 0) {
			int lastNum = num % 10;
			sum += lastNum;
			num /= 10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
//		reverseNumber();
//		numberPalinderome();
		sumNumbers();
		
	}

}
// why static methods will not allow to access the global variables
// is your boy told you not to talk with me