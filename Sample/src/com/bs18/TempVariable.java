package com.bs18;

import java.util.Scanner;

public class TempVariable {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);


		while(true) {
			System.out.println("Enter the a Value(-1 to exit from the programm): ");
			int a=ip.nextInt();
			if(a==-1) {
				System.out.println("Exiting the programm");
				break;
			}
			System.out.println("Enter the b value");
			int b=ip.nextInt();
			a=a+b;  
			b=a-b; 
			a=a-b;  
			System.out.println("a value is : "+a);
			System.out.println("b value is : "+b);
		}
		ip.close();
	}
}
