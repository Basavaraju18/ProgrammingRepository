package com.bs18;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the number");
		int num = ip.nextInt();
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
	}
}









/**

System.out.println("Enter the String or (Enter 'Stop' yo exit)");
while(true) {
	String str = ip.nextLine();
	if(str.equalsIgnoreCase("Stop")) {
		System.out.println("Programm stopped");
		break;
	}
	else {
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev= rev+str.charAt(i);
		}
		System.out.println(rev);
	}
}

 */