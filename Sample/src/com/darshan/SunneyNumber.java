package com.darshan;

import java.util.Scanner;

public class SunneyNumber {
    
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter the number");

        int number = ip.nextInt();
        boolean flag = false;
        
        for (int i = 1; i * i <= number + 1; i++) {
            if (i * i == number + 1) {
                flag = true;
                break;
            }
        }
        
        if (flag) {
            System.out.println(number + " is a sunny number.");
        } else {
            System.out.println(number + " is not a sunny number.");
        }
    }
}
