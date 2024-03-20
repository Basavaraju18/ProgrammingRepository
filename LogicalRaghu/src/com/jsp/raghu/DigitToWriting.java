package com.jsp.raghu;

import java.util.Scanner;

public class DigitToWriting {

	static void nw(int n, String st) {
		String[] x = {"","one" ,"two", "three", "four", "five", "Six", "seven", "eight", "nine"};
		String[] y = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

		if(n==0)
			return;

		if(n<20) {
			System.out.print(x[n]);
		}
		else {
			System.out.print(y[n/10]+x[n%10]);


		}
		System.out.print(st+" ");
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the amount");
			int amount = ip.nextInt();  // 123456789
		
			nw(amount/10000000, " crore");
			nw(amount/100000%100, " lakhs");
			nw(amount/1000%100, " thousnads");
			nw(amount/100%10, " hundred");
			nw(amount%100, "");
			
			ip.close();
	}
}

