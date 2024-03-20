package com.day1;

public class SumOfFirat_N_Natural_Number {
	static int sum=0;
	
	public static void display(int n) {
		if(n>0) {
			sum=sum+n;
			display(n-1);
		}
	}
	public static void main(String[] args) {
		display(4);
		System.out.println(sum);
	}

}
