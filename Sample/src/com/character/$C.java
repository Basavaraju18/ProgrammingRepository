package com.character;

import java.util.Arrays;

public class $C {

    private static char[] sample(String s2) {

        char[] c = s2.toCharArray();
        
        char[] res = new char[5];
        
        for (int i = 0; i < res.length - 1; i++) {
            if ((c[i ] != ' ' && i== c[i +  1])  ||  ( i == c.length-1 && c[ i] != ' ')){
                res[i] = c[i];
            }
        }


        return res;
    }

    public static void main(String[] args) {
        String s2 = "hello how are you boys";
        char[] rs = sample(s2);
        System.out.println(Arrays.toString(rs));
    }
}
