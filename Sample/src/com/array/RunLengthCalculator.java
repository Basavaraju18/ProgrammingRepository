package com.array;

import java.util.Scanner;

public class RunLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (scanner.hasNextLine()) {
            input = scanner.nextLine();
            String[] operands = input.split("[+\\-*/]");
            String operator = input.replaceAll("[^+\\-*/]", "");
            
            long operand1 = Long.parseLong(operands[0]);
            long operand2 = Long.parseLong(operands[1]);
            long result = 0;
            
            switch (operator) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
            }
            
            System.out.println(input);
            System.out.println(encode(result));
        }
        
        scanner.close();
    }
    
    public static String encode(long number) {
        StringBuilder encoded = new StringBuilder();
        String numStr = String.valueOf(number);
        char currentDigit = numStr.charAt(0);
        int count = 1;
        
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i) == currentDigit) {
                count++;
            } else {
                encoded.append(count).append(currentDigit);
                currentDigit = numStr.charAt(i);
                count = 1;
            }
        }
        
        encoded.append(count).append(currentDigit);
        return encoded.toString();
    }
}
