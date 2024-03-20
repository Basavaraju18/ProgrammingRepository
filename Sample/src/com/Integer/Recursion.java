package com.Integer;

import java.util.Scanner;

public class Recursion {

    private static int calculateFactorial(int num) {
        // Base case: factorial of 0 is 1
        if (num == 0) {
            return 1;
        }

        // Recursive call to calculate factorial
        return num * calculateFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = scanner.nextInt();

        // Check if the input is non-negative
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
