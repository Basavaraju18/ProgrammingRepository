package com.hackerrank;

import java.util.Scanner;

public class DayOFProgrammer {

	private static boolean leapYear() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the year ");
		int year = ip.nextInt();

		if((year % 4==0) && (year % 100 != 00) || (year % 400 == 0)){
			System.out.println(year + " Year is Leap year");
			return true;
		}
		else {
			System.out.println("The year "+year+ " is not a leap year");
			return false;
		}


	}



	public static String dayOfProgrammer(int year) {
		// Write your code here
		if (year < 1918) {
			if (year % 4 == 0) {
				return "12.09." + year;
			}
		} else if(year > 1918) {
			if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				return "12.09." + year;
			}
		} else {
			return "26.09." + year;
		}
		return "13.09." + year;

	}



	public static void main(String[] args) {
//		boolean leapYear = leapYear();
//		System.out.println(leapYear);
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the Year");
		String dayOfProgrammer = dayOfProgrammer(2023);
		System.out.println(dayOfProgrammer);
	}
}
