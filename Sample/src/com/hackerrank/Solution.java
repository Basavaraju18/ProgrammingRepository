package com.hackerrank;

import java.util.List;

public class Solution {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int total = 0;

        for (int i = getMax(a); i <= getMin(b); i++) {
            if (isFactorOfList(i, a) && isListFactor(i, b)) {
                total++;
            }
        }

        return total;
    }

    private static int getMax(List<Integer> list) {
        return list.stream().max(Integer::compare).orElse(0);
    }

    private static int getMin(List<Integer> list) {
        return list.stream().min(Integer::compare).orElse(0);
    }

    private static boolean isFactorOfList(int num, List<Integer> list) {
        return list.stream().allMatch(factor -> num % factor == 0);
    }

    private static boolean isListFactor(int num, List<Integer> list) {
        return list.stream().allMatch(element -> element % num == 0);
    }
}

