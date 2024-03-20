package com.jsp.raghu;

import java.util.Scanner;

public class EvenOrOddWithoutUsingLoop {
	
	public static void main(String[] args) {
	
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int no=ip.nextInt();
		String str[]= {"Evevn", "Odd"};
		System.out.println(no+" is "+str[no%2]+"Number");
				
	}

}
