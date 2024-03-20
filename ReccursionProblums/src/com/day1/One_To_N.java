package com.day1;

public class One_To_N {

	static void display(int n) {
		if(n>0) {
			display(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		display(4);
	}
}
