package com.day2;

public class Lowest_common_multiplier {
	
	static int i=2;
	static int lcm(int n1, int n2) {
		if(n1>n2) {
			lcm(n2, n1);
		}
		if(n2%n1==0) {
			return n2;
		}
		return lcm(n1,n2*(i++));
	}
	public static void main(String[] args) {
		System.out.println(lcm(72,360));
	}

}
