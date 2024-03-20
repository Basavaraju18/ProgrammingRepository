package com.bs18;

import java.math.BigInteger;
import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Ente the number (or -1 to exit the programm)");
		while(true) {
			int n=ip.nextInt();
			if(n== -1) {
				System.out.println("Programm Stoped");
				break;
			}
			else {
		
		
		int fact=1;
		for(int i=1; i<=n; i++) {
		 fact=fact*i;
		}
		System.out.println("Factorial of the number "+ n +" is :"+fact);
			}
		}
		ip.close();
	}	
}


//
////it is class it is present in the java.math
//public class BigInteger1 {
//
//	public static void main(String[] args) {
//
//		Scanner ip =new Scanner (System.in);
//		System.out.println(" Ebter the inttegae values");
//		String a=ip.next();
//		String b=ip.next();
//
//		BigInteger sum=new BigInteger(a);
//		sum=sum.add(new BigInteger(b));
//		System.out.println(sum);
//	}
//
//}