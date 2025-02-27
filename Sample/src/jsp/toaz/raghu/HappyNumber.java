package jsp.toaz.raghu;

import java.util.Scanner;

// Program to find the number is happy or not

public final class HappyNumber {
	
	static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			
			while(n!=0)
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
		}
		return n==1 || n==7;
	}
	
	static void happyNo(int n)
	{
		System.out.println("Happy numbers are");
		for(int i=0; i<n; i++)
		{
			if(isHappy(i))
			{
				System.out.print(i+" ");
			}
		}
	}
	
	static int countHappy(int n)
	{
		int count=0;
		
		for(int i=1; i<=n; i++)
		{
			if(isHappy(i))
			{
				count++;
			}
		}
		return count;
	}
	
	static int sumHappy(int n)
	{
		int sum=0;
		for(int i=1; i<=n; i++)
		{
			if(isHappy(i))
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		boolean b=isHappy(n);
		if(b)
		
			System.out.println("Happy number");
		
		else
		System.out.println("Not a happy number");
			
		happyNo(n);
		int cnt=countHappy(n);
		System.out.println();
		System.out.println("total happy are "+cnt);
		
		int sm=sumHappy(n);
		System.out.println("tatal happy are "+sm);
		
	}

}
