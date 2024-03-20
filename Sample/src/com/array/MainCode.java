package com.array;

public class MainCode {

	private static int countPrimeInReange1(int i1, int i2) {
		//Read onely region 
		//		int d=input1;

		int count=0;

		while(i1<=i2) {
			int c=0;
			for(int i=2; i<i1; i++) 
			{
				if(i1%i == 0) 
					c++;
			}

			if(c==0) 
			{
				count++;
				System.out.println(i1);
			}

			i1++;
			c=0;
		}
		return count;

	}


	public static void main(String[] args) {
	int countPrimeInReange = countPrimeInReange1(2, 50);
	System.out.println(countPrimeInReange);

	}
}
