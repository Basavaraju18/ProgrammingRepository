package com.bs18;

import java.util.Scanner;

public class NumbresFrom1_To_10 {
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the number");
		for( int i=ip.nextInt(); i<=10; i++) {
		
			System.out.println(i);
			
		}
	}

}
