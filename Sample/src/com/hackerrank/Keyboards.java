package com.hackerrank;

public class Keyboards {

    private static int getMoneySpent(int[] keyboard, int[] driver, int budget) {
        int maxSum = -1;

        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < driver.length; j++) {
                int currentSum = keyboard[i] + driver[j];

                // Check if the current sum is within the budget and greater than the current max
                if (currentSum <= budget && currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int budget = 9;
        int[] keyboard = {4,3,4};
        int[] driver = {5,3,2};

        int moneySpent = getMoneySpent(keyboard, driver, budget);
        System.out.println(moneySpent);
    }
}
