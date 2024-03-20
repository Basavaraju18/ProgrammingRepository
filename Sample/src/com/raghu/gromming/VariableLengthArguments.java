package com.raghu.gromming;

public final class VariableLengthArguments {

	static int sum(int... a) {
		int sum = 0;
		for(int i =0; i <a.length; i++) {
			sum = sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		int sum1= sum(23, 24);
		System.out.println(sum1);
		sum1=sum(12, 23, 45);
		System.out.println(sum1);
		sum1=sum(34, 45, 56,23, 45 ,34);
		System.out.println(sum1);
	}
}
