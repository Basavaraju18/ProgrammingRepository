package com.bs18;

import java.util.Scanner;

public class Function {

	public static int addNumber(int n1, int n2) {

		int sum=n1+n2;
		return sum;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner (System.in);
		while(true) {

			
			System.out.println("Enter A and B value(Enter 0 to stop)");
			System.out.println("A value :");
			int a=ip.nextInt();
			if(a==0) {
				System.out.println("Program ended"
						);
				break;
			}
			else {
			System.out.println("B value :");
			int b=ip.nextInt();
			
			
				int s=addNumber(a, b);
				System.out.println("The sum of A and B value is : "+s);
				System.out.println();
			}
			
		}
		ip.close();
	}
}
