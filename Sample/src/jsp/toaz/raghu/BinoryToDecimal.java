package jsp.toaz.raghu;

import java.util.Scanner;

public final class BinoryToDecimal {

	private static int binToDec(int n) 
	{
		int dec=0;
		int c=0;

		while(n!=0)
		{
			int r=n%10;

			dec=dec+r*pow(2, c);

			c++;
			n=n/10;
		}
		return dec;
	}

	static int pow(int n, int c)
	{
		int pw=1;
		while(c>0)
		{
			pw=pw*n;
			c--;
		}
		return pw;

	}

	public static void main(String[] args) {
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		int db=binToDec(n);
		System.out.println("The no is = "+ db);
	}

}
