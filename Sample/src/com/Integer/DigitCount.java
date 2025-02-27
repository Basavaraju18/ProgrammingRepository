package com.Integer;

import java.util.Set;
import java.util.TreeSet;

public class DigitCount {
	
	private static void countNumbers() {
		int n=12345;
		int count=0;
		while(n>0)
		{
			
			count++;
			n=n/10;
//			n=n%10;
		}
		
		System.out.println(count);
	}
	
	
	private static void reverseNumbers() {

		int n=12345;
		int rev=0;
		
		while(n>0)
		{
			int l=n%10;
			rev=(rev*10)+l;
			n/=10;
		}
		System.out.println(rev);
	}
	
	private static void printinguniqueDigit() 
	{
		int n=1236323893;
		Set<Integer> s1 = new TreeSet<>();
		while(n>0)
		{
			int last=n%10;
			s1.add(last);
			n/=10;
		}
		
//		System.out.println(s1);
		for(int i : s1) {
			System.out.print(i+"");
		}
	}
	
	private static void uniqueDigitCount() {
	    // Given input integer
	    int input1 = 123412;

	    // Counter for unique digits
	    int c = 0;
	    
	    // Array to store occurrences of each digit (0 to 9)
	    int[] h = new int[10];

	    // Loop to iterate through each digit of the input integer
	    while (input1 > 0) {
	        // Extract the last digit
	        int r = input1 % 10;
	        
	        // Increment the count for the current digit in the array
	        h[r]++;
	        
	        // Remove the last digit from the input integer
	        input1 /= 10;
	    }

	    // Loop to count the number of unique digits
	    for (int i = 0; i < 10; i++) {
	        if (h[i] > 0) {
	            c++;
	        }
	    }

	    // Print the count of unique digits
	    System.out.println(c);
	}

	public static void main(String[] args) {
//		countNumbers();
//		reverseNumbers();
//		printinguniqueDigit();
		uniqueDigitCount();
	}

}
