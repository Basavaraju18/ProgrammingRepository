package com.hackerrank;
import java.util.List;

public class PairsInArray {

    private static int sockMerchant(List<Integer> arr) {
    	int count = 0;

        for (int i = 0; i < arr.size(); i++) {
            // Skip socks that have already been paired
            if (arr.get(i) == -1) {
                continue;
            }

            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) {
                    count++;
                    // Mark both socks as paired
                    arr.set(i, -1);
                    arr.set(j, -1);
                    break; // Exit the inner loop after finding a pair
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);

        
        int sockMerchant = sockMerchant(arr);
        System.out.println(sockMerchant);
    }
}
