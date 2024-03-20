package com.bigdata.new1;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.darshan.Array;


public class Add_List_Of_Long {
	
	static String veryBigSum(List<Long> values) {
		BigInteger sum=new BigInteger(values.get(0).toString());
				for(int i=1; i<values.size(); i++) {
					BigInteger ele=new BigInteger(values.get(i).toString());
					sum=sum.add(ele);
				}
				return sum.toString();
	}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		ArrayList<Long> mylist=new ArrayList<Long>();
		System.out.println("Ente rthe long values to stop 0");
		while(true) {
				long ele=ip.nextLong();
				if(ele==0)
					break;
				mylist.add(ele);
		}
		System.out.println(" sum of very Big sum is" +veryBigSum(mylist));
	}
}


