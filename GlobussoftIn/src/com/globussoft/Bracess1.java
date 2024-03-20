package com.globussoft;

import java.util.Scanner;
import java.util.Stack;

public class Bracess1 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int testCase = 1;

	        for (int i = 0; i < 3; i++) {
	            String input = scanner.next();
	            int operations = findMinOperations(input);
	            System.out.println(testCase + ". " + operations);
	            testCase++;
	        }
	    }

	    private static int findMinOperations(String input) {
	        Stack<Character> stack = new Stack<>();
	        int operations = 0;

	        for (char brace : input.toCharArray()) {
	            if (brace == '{') {
	                stack.push(brace);
	            } else if (brace == '}') {
	                if (!stack.isEmpty() && stack.peek() == '{') {
	                    stack.pop();
	                } else {
	                    stack.push(brace);
	                    operations++;
	                }
	            }
	        }

	        operations += stack.size() / 2;
	        return operations;
	    }
	}
