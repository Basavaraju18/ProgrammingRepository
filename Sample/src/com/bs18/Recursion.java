package com.bs18;

import java.util.Scanner;

public class Recursion {

	public static void printNumber(int n) {
		
		if(n<=10) {
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(n);

			
		printNumber(n+1);
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		ip.close();
				printNumber(n);
		
	}
}
