package com.jsp;

import java.util.Scanner;
import java.util.Stack;

public class Paranthasis {

	static  boolean isBalanced(String st) {

		Stack<Character> stk=new Stack<Character>();
		for(int i=0;i<st.length(); i++) {
			char ch=st.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(' ) {
				stk.push(ch);
			}
			else {
				if(stk.isEmpty())
					return false;
				if(ch=='}') {
					if(stk.pop()!='{')
						return false;
				}
				else if(ch==']') {
					if(stk.pop()!='[')
						return false;
				}
				else if(ch==')') {
					if(stk.pop()!='(')
						return false;

				}

			}
		}
		return stk.isEmpty();
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);

		System.out.println("Enter the String paranthasis");
		String st=ip.next();

		boolean rs=isBalanced(st);
		if(rs) {
			System.out.println("String is Balanced");
		}
		else {
			System.out.println("String is not Balanced");
		}
	}

}

