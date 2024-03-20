package com.jsp;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatePostFixOprnBySuingStack {

	public static void main(String[] args) 
	{
	Scanner ip = new Scanner(System.in);
	System.out.println("Enter the postfix expression");
	String st= ip.next();
	double eve= evaluate(st);
	System.out.println("Evaluate value :"+eve);
	}

	 static double evaluate(String st) 
	 {
		 Scanner ip=new Scanner(System.in);
		 Stack<Double> stk=new Stack<Double>();
		 for(int i=0; i<st.length(); i++) 
		 {
			char ch=st.charAt(i);
			if(Character.isAlphabetic(ch)) 
			{
				System.out.println("Enter the value of "+ch);
				stk.push(ip.nextDouble());
			}else {
				double v2=stk.pop();
				double v1=stk.pop();
				switch(ch)
				{
				case '+': stk.push(v1+v2);
							break;
				
			case '-': stk.push(v1-v2);
					break;
			
			case '*': stk.push(v1*v2);
					break;
			
			case '/': stk.push(v1/v2);
					break;
					
			case '%': stk.push(v1%v2);
				break;
				}
			}
		 }
		 return stk.peek();
	}
}
