package com.hackerrank;

import java.util.Scanner;
// Test Case Samples
// 1)12:40:22AM  00:40:22
// 2)06:40:03AM	 00:40:22
// 3)12:05:39AM  00:05:39
// 4)12:45:54PM  12:45:54
// 5)02:34:50PM  14:34:50
// 6)04:59:59AM  04:59:59

public class TimeFormate {
	
	
	private static String solve(String s1) {
		
		String[] arr=s1.split(":");
        int hours=Integer.parseInt(arr[0]);
        int minutes=Integer.parseInt(arr[1]);
        int seconds=Integer.parseInt(arr[2].substring(0,2));
        String amPm=arr[2].substring(2);
        
        if(amPm.equals("PM") && hours!=12)
            hours+=12;
        else if(amPm.equals("AM") && hours==12)
            hours=0;
        
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the time foramte hh:mm:ssAM/PM");
		String s1 =  ip.next();
		String r=solve(s1);
		System.out.println(r);
	}

	

}
