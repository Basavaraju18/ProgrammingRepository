package com.darshan;

import java.util.Scanner;

public class PerfectSquare {
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number = ip.nextInt();
		boolean flag = false;
		for(int i=1; i<=number; i++) {
			if(i*i==number) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("Perfect square");
		}else {
			System.out.println("Not a Perfect square");
		}
	}

}
