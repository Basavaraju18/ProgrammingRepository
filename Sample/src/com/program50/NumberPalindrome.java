package com.program50;

import java.util.Scanner;

public class NumberPalindrome {
	
	
	public void thirdtrai() {
		
		int num=1234321, rev=0, temp=num;
		while(num>0) {
			int n=num%10;
			 rev=(rev*10)+n;
			 n/=10;
		}
		if(temp==rev) {
			System.out.println("number is palindrome");
		}else {
			System.out.println();
		}
		

	}


	public static void display() {

		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number to check if it's a Palindrome or not (Enter -1 to Exit)");

		while (true) {
			int number = ip.nextInt();
			if (number == -1) {
				System.out.println("System exited");
				break;
			} else {
				int reverse = 0;
				int temp = number;
				while (number > 0) {
					int n = number % 10;
					reverse = (reverse * 10) + n;
					number = number / 10;
				}

				if (reverse == temp) {
					System.out.println("The number is Palindrome");
				} else {
					System.out.println("The number is not a Palindrome");
				}
			}
		}

		ip.close(); // Close the scanner when done
	}


	public static void main(String[] args) {

		//		display();
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the number to check the number is Palindrome or Not or(Enter -1 for Exit!!)");

		while(true) {
			int number=ip.nextInt();
			if(number==-1) {
				System.out.println("System exited");
				break;
			}else {
				int reverse=0;
				int temp=number;
				while(number>0) {
					int n=number%10;
					reverse = (reverse*10)+n;
					number=number/10;
				}
				if(reverse==temp) {
					System.out.println("The number is Palindrome");
					System.out.println("Next Enter the Number");
				}
				else {
					System.out.println("The number is not a Palindrome");
					System.out.println("Next Enter the Number");

				}
			}

		}
		ip.close();
	}
}

