package com.bs18;

public class RecursiveFactorial {

    static int fact = 1;

    private static int fact(int n) {
        if (n > 1) {
            fact = fact * n;
            return fact(n - 1);
        } else {
            return fact; // Base case: return 1 when n is not greater than 1
        }
    }

    public static void main(String[] args) {
        int result = fact(4);
        System.out.println(result);
    }
}

