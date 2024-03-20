package com.globus;

import java.util.Scanner;
public class RunLengthCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNextLine()) {
			String input = scanner.nextLine();
			String[] parts = input.split(" ");
			// Extract operands and operator
			long operand1 = Long.parseLong(parts[0]);
			char operator = parts[1].charAt(0);
			long operand2 = Long.parseLong(parts[2]);
			// Perform the operation based on the operator
			
			long result = 0;
			switch (operator) {
			case '+':
				result = operand1 + operand2;
				break;
			case '-':
				result = operand1 - operand2;
				break;
			case '*':

				result = operand1 * operand2;
				break;
			case '/':
				result = operand1 / operand2;
			break;
			}
			// Convert the result to run-length encoding format
			String runLengthResult = encode(result);
			// Output the original expression and the result
			System.out.println(input + " = " + runLengthResult);
		}
		scanner.close();
	}
	// Function to convert a number to run-length
	
	private static String encode(long number) {
		if (number == 0) {
			return "0";
		}
		String numberStr = Long.toString(number);
		StringBuilder encoded = new StringBuilder();
		int count = 1;
		
		for (int i = 0; i < numberStr.length() - 1; i++) {
			if (numberStr.charAt(i) == numberStr.charAt(i + 1)) {

				count++;
			} else {
				if (count == 1) {
					encoded.append(numberStr.charAt(i));
				} else {
					encoded.append(count);
					encoded.append(numberStr.charAt(i));
				}
				count = 1;
			}
		}
		// Append the last digit
		if (count == 1) {
			encoded.append(numberStr.charAt(numberStr.length() -
					1));
		} else {
			encoded.append(count);
			encoded.append(numberStr.charAt(numberStr.length() -
					1));
		}
		return encoded.toString();
	}
}