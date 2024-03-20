package com.array;

import java.util.Arrays;

public final class Withoutusinglengthmethod {

	private static void method1() {
		String s1="  Hi    hello bye     koikn jjh ";
		char s2=' ';
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=s2) {
				System.out.print(s1.charAt(i));
			}
		}
	}


	private static void identiaclArray() {
		int[] a1= {1, 2, 3};
		int[] a2= {1, 2, 3};

		int count=0;
		for (int i = 0; i < a1.length; i++) {
			if(a1.length!=a2.length)
			{
				count++;
				break;
			}

			if(a1[i]!=a2[i]) {
				count++;
				break;
			}
		}
		if(count>=1) {
			System.out.println("Not identical");
		}
		else {
			System.out.println("Its identical");
		}


	}
	
	
	// finding the length of the array without using any predefind methods
	private static  void arraylength() {

		int[] a= {1, 2, 3};
		int count=0;
		for (int i : a) {
			count++;
		}
		System.out.println(count);
	}
	
	
	public static void main(String[] args) {

//		method1();
//		identiaclArray();
		arraylength();
		
	}

}
