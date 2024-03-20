package com.day2;

public class power_of_Number {
	
	static int power(int n, int p) {
		if(p==0)
			return 1;
		return n*power(n,p-1);
	}
	public static void main(String[] args) {
		System.out.println(power(2,6));
	}

}
