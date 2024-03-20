package com.array;



import java.util.Scanner;
import java.util.LinkedList;

public class SilenceDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input parameters
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();

        // Read samples in the recording
        int[] samples = new int[n];
        for (int i = 0; i < n; i++) {
            samples[i] = scanner.nextInt();
        }

        // Detect silence and output the results
        LinkedList<Integer> silenceIndices = new LinkedList<>();
        for (int i = 0; i <= n - m; i++) {
            int max = samples[i];
            int min = samples[i];
            for (int j = i; j < i + m; j++) {
                max = Math.max(max, samples[j]);
                min = Math.min(min, samples[j]);
            }
            if (max - min <= c) {
                silenceIndices.add(i + 1);  // Add 1 because indices start from 1 in the output
            }
        }

        // Output the results
        if (silenceIndices.isEmpty()) {
            System.out.println("NONE");
        } else {
            for (int index : silenceIndices) {
                System.out.println(index);
            }
        }

        scanner.close();
    }
}
