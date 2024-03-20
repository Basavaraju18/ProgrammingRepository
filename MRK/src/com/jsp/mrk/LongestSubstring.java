package com.jsp.mrk;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubstring {

	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the string");
		String input = ip.next();
		Pair result = findLongestSubstring(input);

//		System.out.println("Input: " + input);
		System.out.println( result.substring);
		 System.out.println("Length: " + result.length);
	}

	static class Pair {
		String substring;
		int length;

		public Pair(String substring, int length) {
			this.substring = substring;
			this.length = length;
		}
	}

	public static Pair findLongestSubstring(String s) {
		int n = s.length();
		int start = 0, end = 0;
		int maxLength = 0;
		String longestSubstring = "";

		HashMap<Character, Integer> charIndexMap = new HashMap<>();

		while (end < n) {
			char currentChar = s.charAt(end);

			if (charIndexMap.containsKey(currentChar)) {
				start = Math.max(charIndexMap.get(currentChar) + 1, start);
			}

			if (end - start + 1 > maxLength) {
				maxLength = end - start + 1;
				longestSubstring = s.substring(start, end + 1);
			}

			charIndexMap.put(currentChar, end);
			end++;
		}

		return new Pair(longestSubstring, maxLength);
	}
}




















/**
 * 





public class LongestSubstring {

    public static void main(String[] args) {
       String input = "abcabcbb";
        Pair result = findLongestSubstring(input);

        System.out.println("Input: " + input);
        System.out.println("Longest Substring: " + result.substring);
        System.out.println("Length: " + result.length);
    }

    static class Pair {
        String substring;
        int length;

        public Pair(String substring, int length) {
            this.substring = substring;
            this.length = length;
       }
    }

    public static Pair findLongestSubstring(String s) {
        int n = s.length();
        int start = 0, end = 0;
        int maxLength = 0;
        String longestSubstring = "";

        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        while (end < n) {
            char currentChar = s.charAt(end);

           if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            if (end - start + 1 > maxLength) {
               maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }

            charIndexMap.put(currentChar, end);
            end++;
        }

        return new Pair(longestSubstring, maxLength);
   }
}

 */