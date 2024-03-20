package com.jsp.data.between;

import java.util.Scanner;

public class NumberOfDaysBWTwoDaya {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
//		System.out.println("Enter the datenmonthnyear of Starting Year");
//		int dd = ip.nextInt();
//		int mm = ip.nextInt();
//		int yy = ip.nextInt();
//		Date d= new Date(dd, mm, yy); 
//		System.out.println("Enter the date\nmonth\nyear of ending");
//		int dda = ip.nextInt();
//		int mma = ip.nextInt();
//		int yya = ip.nextInt();
		

		        // Create an instance of the Data class with a specific date (e.g., 30th September 2023)
		        Data date = new Data(30, 9, 2023);

		        // Call the methods of the Data class
		        System.out.println("Date: " + date.toString()); // Print the date
		        System.out.println("Day of the Week: " + date.dayName()); // Print the day of the week
		        System.out.println("Number of Days from Reference Date: " + date.noOfDays()); // Print the number of days from the reference date
		    
		

		
	}
}
