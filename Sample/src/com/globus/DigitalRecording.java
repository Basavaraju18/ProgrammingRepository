package com.globus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class DigitalRecording
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0; i<n; i++)
		{

			ar[i]=sc.nextInt();
		}
		ArrayList<Integer> res=new ArrayList<>();
		for (int i = 0; i < ar.length; i++)
		{
			int x[]= Arrays.copyOfRange(ar, i, i+m);
			int max=Arrays.stream(x).max().getAsInt();
			int min=Arrays.stream(x).min().getAsInt();
			if(max-min<=c)
				res.add(i+1);
		}
		System.out.println(res);
	}
}