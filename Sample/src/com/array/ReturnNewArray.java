package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnNewArray {
	
	static int[] readArray() 
	{
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size");
		int x=ip.nextInt();
		int[] c=new int[x];
		for(int  i=0; i<c.length; i++) {
			c[i]=ip.nextInt();
		}
		return c;
	}
	
	static void display(int [] ar)
	{
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] a=readArray();
		display(a);
		int[] b= readArray();
		display(b);
		System.out.println(Arrays.toString(merge(a, b)));
	}
	static int[] merge(int[] a, int[] b)
	{
		int i=0, j=0, k=0;
		int[] c=new int[a.length + b.length];
		
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				k++; i++;
			}
			else 
			{
				c[k]=b[j];
				j++; k++;
			}
		}
		while(i<a.length)
			{
				c[k]=a[i];
				k++; i++;
			}
		while(j<b.length) 
				{
					c[k]=b[j];
					j++; k++;
				}
		return c;
	}
}
