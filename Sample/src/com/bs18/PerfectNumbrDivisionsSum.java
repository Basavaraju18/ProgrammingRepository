package com.bs18;

import java.util.Scanner;


public class PerfectNumbrDivisionsSum {

	public static void main(String[] args)  {
		Scanner ip = new Scanner(System.in);
		System.out.println("Entrr the number");
		try {
			int number=ip.nextInt();


			int sum=1;
			for(int i=2; i<=number/2; i++) {
				if(number%i==0) 
					sum=sum+i;
			}
			System.out.println(sum);
		}
		catch(Exception e) {
			System.out.println("Invalid input");
		}
		ip.close();
	}

}







//Array is a collection of elements of same data types stored in contiguous memory allocation  
































//
//
//
//System.out.println("Enter teh number");
//int count = 1;
//int num = ip.nextInt();
//for(int i=2; i <=num/2; i++) {
//	if(num%i==0) {
//		count=count+i;
//	}
//}
//System.out.println(count);
//ip.close();