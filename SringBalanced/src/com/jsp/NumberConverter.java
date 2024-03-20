package com.jsp;

import java.util.Scanner;
import java.util.Stack;

public class NumberConverter {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int input=ip.nextInt();
		System.out.println(decToBin(input));
		ip.close();
	}

	private static int decToBin(int n) {

		Stack<Integer> stk=new Stack<Integer>();
		do {
			int b=n%2;
			stk.push(b);
			n=n/2;
		}
		while(n!=0);
		int bin=0;
		while(stk.isEmpty()==false) {
			bin=bin*10+stk.pop();
		}
	
		return bin;
	}
	
}
