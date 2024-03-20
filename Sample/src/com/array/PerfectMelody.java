package com.array;
import java.util.Scanner;

public class PerfectMelody {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        int[] notes = new int[n];
        for (int i = 0; i < n; i++) {
            notes[i] = scanner.nextInt();
        }

        int steps = 0;
        int negativeSum = 0;

        // Iterate through the melody and adjust negative sums to make them positive
        for (int i = 0; i < n; i++) {
            negativeSum += notes[i];
            if (negativeSum <= 0) {
                steps += Math.abs(negativeSum) + 1;
                notes[i] += Math.abs(negativeSum) + 1;
                negativeSum = 1;
            }
        }

        // Output the result
        System.out.println(steps);

        scanner.close();
    }
}
