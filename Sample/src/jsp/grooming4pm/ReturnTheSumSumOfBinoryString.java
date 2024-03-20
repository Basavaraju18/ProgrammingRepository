package jsp.grooming4pm;

import java.util.Scanner;

public final class ReturnTheSumSumOfBinoryString {

	static String binary(int n)
	{
		String temp="";
		while(n!=0)
		{
			int rem=n%2;
			temp=rem+temp;
			n=n/2;
		}
		return temp;
	}
	static String sum(String s1, String s2)
	{
		int num1=Integer.parseInt(s1, 2);
		System.out.println(num1);
		
		int num2=Integer.parseInt(s2, 2);
		System.out.println(num2);
		
		int sum = num1 + num2;
		String result = Integer.toBinaryString(sum);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the Number");
		String s1=ip.next();
		String s2=ip.next();
		
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		System.out.println();
		String s3=binary(n1);
		String s4=binary(n2);
		
		String ans=sum(s3, s4);
		System.out.println(ans);
		
		
		
	}
}
