package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToLetter {
//    private static final Logger logger = Logger.getLogger(RomanToLetter.class.getName());


	public static int romanToInt(String s) {
		Map<Character, Integer> m = new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50 );
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);

		int ans= 0;

		for(int i = 0; i< s.length(); i++){
			if( i<s.length() -1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
				ans-= m.get(s.charAt(i));
			} else {
				ans += m.get(s.charAt(i));
			}
		}
		return ans;
	}
	
	private static int withoutUsingMap(String s) {  //XVIII

		int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            char nextChar = (i < s.length() - 1) ? s.charAt(i + 1) : '\0';

            int currentValue = getRomanValue(currentChar);
            int nextValue = getRomanValue(nextChar);

            if (nextValue > currentValue) {
                ans -= currentValue;
            } else {
                ans += currentValue;
            }
        }
        return ans;
    }

    private static int getRomanValue(char romanChar) {
        switch (romanChar) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

	public static void main(String[] args) {
		int res = withoutUsingMap("XVIII");
		System.out.println(res);
//		 logger.info(Integer.toString(romanToInt));
	}
}

