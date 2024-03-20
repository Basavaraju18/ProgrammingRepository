package com.string;



public class LongestCommonPrefix {
	public static void main(String[] args) {
		String[] words = {"apple", "ape", "april"};
		String longestPrefix = findLongestCommonPrefix(words);
		System.out.println("Longest Common Prefix: " + longestPrefix);
	}

	static String findLongestCommonPrefix(String[] words) {
		if (words == null || words.length == 0) {
			return "";
		}

		for (int i = 0; i < words[0].length(); i++) {
			char currentChar = words[0].charAt(i);
			for (int j = 1; j < words.length; j++) {
				if (i >= words[j].length() || words[j].charAt(i) != currentChar) {
					return words[0].substring(0, i);
				}
			}
		}

		return words[0];
	}
}

