package com.hackerrank.string;

import java.util.List;

public class GemStone {

    private static int sameNumber(List<String> s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        int commonCount = 0;
        String firstString = s.get(0);

        for (char c : firstString.toCharArray()) {
            boolean isCommon = true;
            for (String str : s) {
                if (str.indexOf(c) == -1) {
                    isCommon = false;
                    break;
                }
            }
            if (isCommon) {
                commonCount++;
            }
        }

        return commonCount;
    }

    public static void main(String[] args) {
        List<String> ls = List.of("abc", "abc", "bc", "abd" );
        int res = sameNumber(ls);
        System.out.println(res);
    }
}
