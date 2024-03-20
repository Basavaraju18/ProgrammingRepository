package com.mrk.innoapps;


	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;

	public class RemoveDuplicates {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        System.out.println("Original String: " + input);

	        String result = manipulateString(input);

	        System.out.println("Modified and Reversed String: " + result);

	        scanner.close();
	    }

	    private static String manipulateString(String input) {
	        // Remove duplicate characters
	        Set<Character> charSet = new HashSet<>();
	        StringBuilder uniqueChars = new StringBuilder();
	        for (char c : input.toCharArray()) {
	            if (charSet.add(c)) {
	                uniqueChars.append(c);
	            }
	        }

	        // Trim extra spaces and reverse the string
	        String trimmedReversed = new StringBuilder(uniqueChars.toString().trim()).reverse().toString();

	        return trimmedReversed;
	    }
	}
