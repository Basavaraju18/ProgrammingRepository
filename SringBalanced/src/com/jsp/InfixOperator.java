package com.jsp;

import java.util.Scanner;
import java.util.Stack;


public class InfixOperator {
	
	public static void main(String[] args) {
		int value=evaluate ("abc*+d-");
		System.out.println(value);
	}

	static int evaluate(String str) {

		Scanner ip=new Scanner(System.in);
		Stack< Integer> stk=new Stack<Integer>();
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				System.out.println("Enter the value of "+ ch);
				stk.push(ip.nextInt());
			}
			else {
				int y=stk.pop();
				int x=stk.pop();
				
				switch(ch) {
				
				case '+':stk.push(x+y);
						break;
						
				case '-':stk.push(x-y);
						break;
						
				case '*':stk.push(x*y);
						break;
						
				case '/':stk.push(x/y);
						break;
				}
			}
		}
		return stk.pop();
	}
}


/**
 *
 *   1) .pop():	Removes the object at the top of this stack and returns thatobject as the value of this function.
		Returns:The object at the top of this stack (the last itemof the Vector object).Throws:EmptyStackException - if 
 */

