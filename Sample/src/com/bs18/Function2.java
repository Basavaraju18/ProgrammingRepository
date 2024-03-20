package com.bs18;

import java.util.Scanner;

public class Function2 {
	
	public static int addNumber(int n1, int n2) {
		return n1/n2;
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		while(true) {
			System.out.println("enter the A and B value (or 'Exit' for stop)");
			int a, b;
			
			if(ip.hasNextInt()) {
					a=ip.nextInt();
					b=ip.nextInt();
			}
			else {
				String input=ip.next();
				if(input.equalsIgnoreCase("stop")) {
					System.out.println("Program stoped");
					break;
				}
				else {
					System.out.println("invalid input plese enter the valid input or exit");
					continue;
				}
			}
			int s=addNumber(a, b);
			System.out.println("The Sum of the numbers is "+s);
		}
		
	}

}
