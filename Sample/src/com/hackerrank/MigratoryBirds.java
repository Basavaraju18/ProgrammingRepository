package com.hackerrank;

import java.util.List;

public class MigratoryBirds {

    private static void sample() {
        List<Integer> ar = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);

        int[] frequency = new int[10]; // Assuming digits are in the range 0-9

        int maxFrequency = 0;
        int mostFrequentDigit = -1; // Initialize with an invalid value

        for (int i = 0; i < ar.size(); i++) {
            int digit = ar.get(i);
            // Increment the frequency count for the current digit
            frequency[digit]++;

            // Check if the current digit has a higher frequency
            if (frequency[digit] > maxFrequency || (frequency[digit] == maxFrequency && digit < mostFrequentDigit)) {
                maxFrequency = frequency[digit];
                mostFrequentDigit = digit;
            }
        }

        System.out.println(mostFrequentDigit);
    }

    public static void main(String[] args) {
        sample();
    }
}
