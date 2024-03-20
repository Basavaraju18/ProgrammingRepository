package jsp.toaz.raghu;

import java.util.Scanner;

public final class CountNoOfBits {
	static int countBits(int n)
	{
		int count=0;
		
		while(n>0)
		{
			if(n%2==1)
			{
				count++;
			}
			n=n/2;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter  the number");
		int n=ip.nextInt();
		int countBits=countBits(n);
		System.out.println("The number of bits "+countBits);
		
	}

}

/**A bit is the smallest unit of data that a computer can process and store. A bit is a binary digit, which can only hold one of two values: 0 or 1. These values correspond to the electrical values of off or on, respectively. 

* The number of possible values or combinations goes up by a factor of two with each additional bit. For example, in 1 bit there are two possible values: 1 or 0. In 2 bits, there are four possible values, or combinations: 00, 01, 10, 11. 

*A group of 4 bits is called a nibble, and 8-bits makes a byte. Computers are sometimes classified by the number of bits they can process at one time or by the number of bits they use to represent addresses. 

*/


