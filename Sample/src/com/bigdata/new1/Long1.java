package com.bigdata.new1;

import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class Long1 {
	
	static String veryBigSun(List<Long> values) {
		
		Scanner ip=new Scanner(System.in);
//		System.out.println("Enter the long l1 values");
//		Long l1=ip.nextLong();
//		
//		System.out.println("Enter the long l2 values");
//		Long l2=ip.nextLong();
		
		Long a=Long.MAX_VALUE;
		Long b=Long.MAX_VALUE;
		
		String s1=a.toString();
		String s2=b.toString();
		
		BigInteger ba=new BigInteger(s1);
		BigInteger bb=new BigInteger(s2);
		
		BigInteger sum=ba.add(bb);
		
		return sum.toString();
//		return new BigInteger(a.toString())
	}
		
	
	
	
	public static void main(String[] args) {
		String sum=veryBigSun(null);
		System.out.println(sum);
	}	


}
