package com.array;

	
	import java.util.Scanner;

	public class IntegerFactorization {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number");

	        while (true) {
	            long num = scanner.nextLong();
	            if (num == 0) {
	                break;
	            }

	            System.out.print(factorize(num));
	            System.out.println();
	        }

	        scanner.close();
	    }

	    public static String factorize(long num) {
	        StringBuilder result = new StringBuilder();
	        for (long divisor = 2; divisor * divisor <= num; divisor++) {
	            int count = 0;
	            while (num % divisor == 0)	{
	                num /= divisor;
	                count++;
	            }
	            if (count > 0) {
	                if (result.length() > 0) {
	                    result.append(" ");
	                }
	                result.append(divisor);
	                if (count > 1) {
	                    result.append("^").append(count);
	                }
	            }
	        }

	        if (num > 1) {
	            if (result.length() > 0) {
	                result.append(" ");
	            }
	            result.append(num);
	        }

	        return result.toString();
	    }
	}


