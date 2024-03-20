package com.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class PrintNumbersOfCharactersInTheString {

	private static void noOfCharacters1() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a string:");

		// Read the input string
		String inputString = ip.nextLine();

		// Create a map to store character counts
		Map<Character, Integer> charCountMap = new HashMap<>();

		// Count the occurrences of each character in the string
		for (char c : inputString.toCharArray()) {
			charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
		}

		// Print the character counts
		System.out.println("Character counts:");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
	
	private static void noOfCharacters2() {
		@SuppressWarnings("resource")
		Scanner ip = new Scanner(System.in);
        System.out.println("Enter a string:");

        // Read the input string
        String inputString = ip.nextLine();

        // Assuming ASCII characters (0 to 127)
        int[] count = new int[128];

        // Count the occurrences of each character in the string
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            count[currentChar]++;
        }

        // Print the character counts
        System.out.println("Character counts:");
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + ": " + count[i]);
            }
        }
    }

	public static void main(String[] args) {
//		noOfCharacters1();
		noOfCharacters2();
	}
}
