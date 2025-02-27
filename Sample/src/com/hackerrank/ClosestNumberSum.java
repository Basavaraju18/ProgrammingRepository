package com.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class ClosestNumberSum {

    private static List<Integer> closestPairs(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                int diff = Math.abs(arr.get(i) - arr.get(j));

                if (diff < minDif) {
                    minDif = diff;
                    result.clear(); // Clear existing pairs
                    result.add(arr.get(i));
                    result.add(arr.get(j));
                } 
                else if (diff == minDif) {
                    result.add(arr.get(i));
                    result.add(arr.get(j));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> l1 = List.of(4, 1, 3, 5, 2);
        List<Integer> closestPairs = closestPairs(l1);
        System.out.println(closestPairs);
    }
}
