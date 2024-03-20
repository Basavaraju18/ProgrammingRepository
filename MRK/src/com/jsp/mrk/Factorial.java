package com.jsp.mrk;

import java.util.Scanner;



public class Factorial {
    int fact = 1;

    public int factMethod(int num) {
        if (num > 1) {
            fact = fact * num;
            return factMethod(num - 1); 
        } else {
            return fact; 
        }
    }

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = ip.nextInt();
        Factorial f1 = new Factorial();

        int result = f1.factMethod(num);

        System.out.println("Factorial of  is: " + result);
    }
}

