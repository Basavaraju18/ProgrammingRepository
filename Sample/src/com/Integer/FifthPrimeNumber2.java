package com.Integer;

public class FifthPrimeNumber2 {

    static int[] primeArray = new int[5]; // Assuming you want to find and store the first 5 prime numbers
    static int count = 0;

    private static void fromRange() {
        for (int i = 10; i <= 50; i++) {
            isPrime(i);
        }
    }

    private static void isPrime(int n) {
        count = 0; // Reset count for each number

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2 && count <= 5) {
            primeArray[count - 1] = n;
            count++;
        }
    }

    public static void main(String[] args) {
        fromRange();

        // Print the 5th prime number
        System.out.println("The 5th prime number in the range 10 to 50 is: " + primeArray[4]);
    }
}
