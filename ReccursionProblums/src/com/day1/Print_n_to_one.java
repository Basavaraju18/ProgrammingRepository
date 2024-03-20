package com.day1;

public class Print_n_to_one {
	
	static void display(int n) {
		if(n>0) {
			System.out.println(n);
			display(n-1);
		}
	}
	public static void main(String[] args) {
		display(6);
	}

}
