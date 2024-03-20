package com.functionalinterface;

public class AllCalculation {
	
	public static void main(String[] args) {
		
		Operation addition=(a,b)->a+b;
		Operation substraction=(a,b)->a-b;
		Operation multiplication=(a,b)->a*b;
		Operation reminder=(a,b)->a%b;
		Operation qotient=(a,b)->a/b;
		
		System.out.println("Sddition : "+addition.calculate(80, 8));
		System.out.println("Substraction : "+substraction.calculate(80, 8));
		System.out.println("Multiplication : "+multiplication.calculate(80, 8));
		System.out.println("Reminder : "+reminder.calculate(80, 8));
		System.out.println("Qotient : "+qotient.calculate(80, 8));
		
	}

}
