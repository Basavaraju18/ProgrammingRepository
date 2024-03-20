package com.Integer;

import java.util.Scanner;

public class FifthPrimeNumber {

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int findFifthPrime(int start, int end) {
        int count = 0;

        // Skip the starting prime number if it is prime
        if (isPrime(start)) {
            start++;
        }

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                count++;
                if (count == 5) {
                    return num;
                }
            }
        }
        return 0;
    }
    
   

    public static void main(String[] args) {
        // Example: Find the fifth prime number between 1 and 20 excluding the starting prime number
        int startRange = 47; // Change this to the desired starting prime number
        int endRange = 250;
        int result = findFifthPrime(startRange, endRange);

//        System.out.println("The fifth prime number in the range " + startRange + " to " + endRange + " (excluding starting prime) is: " + result);
    }
}
