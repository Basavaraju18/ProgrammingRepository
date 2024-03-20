package com.character;

import java.util.HashSet;
import java.util.Set;

public class PanagramChecker {

	public static void main(String[] args) {
		String input = "The quick brown fox jumps over the lazy dog";
		if (isPangram(input)) {
			System.out.println("The given string is a pangram.");
		} else {
			System.out.println("The given string is not a pangram.");
		}
	}

	public static boolean isPangram(String input) {
		// Convert the input string to lowercase for case-insensitive comparison
		input = input.toLowerCase();

		// Initialize a set to keep track of the letters present in the input string
		Set<Character> letterSet = new HashSet<>();

		// Iterate through each character in the input string
		for (char c : input.toCharArray()) {
			// Check if the character is an alphabet (a-z)
			if (Character.isAlphabetic(c)) {
				// Add the alphabet to the set
				letterSet.add(c);
			}
		}

		// Check if the size of the set is 26 (number of English alphabets)
		return letterSet.size() == 26;
	}
}

