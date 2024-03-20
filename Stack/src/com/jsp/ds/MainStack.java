package com.jsp.ds;

public class MainStack {

	public static void main(String[] args) {
		
		
		
		LinkedListStack ls=new LinkedListStack();
		ls.push(13);
		ls.push(23);
		ls.push(33);
		ls.push(12);
							ls.display();
		System.out.println("poping : "+ls.pop());
		System.out.println(ls.size());
		
	}
}






















/**
 * 
 *  // ARRAY SATCK
//		ArrayStack stk=new ArrayStack(5);
//		stk.push(23);
//		stk.push(54);
//		stk.push(93);
//		stk.push(83);
//		stk.push(43);
//		System.out.println(stk.pop());
//		stk.display();
//		System.out.println(stk.peek());
//		stk.display();
//		System.out.println("==");
//		System.out.println(stk.search(54));
//		stk.push(50);
//		stk.display();
//		System.out.println(stk.size());
 */

