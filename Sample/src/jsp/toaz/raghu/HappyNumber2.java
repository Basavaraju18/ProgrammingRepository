package jsp.toaz.raghu;

import java.util.Scanner;

public final class HappyNumber2 {

	static boolean isHappy(int n)
	{
	    while (n > 9)
	    {
	        int sum = 0;

	        while (n != 0)
	        {
	            int r = n % 10;      // Extracts the last digit of the number
	            sum = sum + r*r;    // Adds the square of the digit to the sum
	            n = n / 10;           // Removes the last digit from the number
	        }

	        n = sum;                 // Updates the number with the sum of the squares of its digits
	    }

	    return n == 1 || n == 7;    // Returns true if the final value of n is 1 or 7, otherwise false
	}

	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=ip.nextInt();
		boolean happy=isHappy(n);
		if(happy){
			System.out.println("Happy number");

		}else
		{
			System.out.println("Not a happy number");

		}
	}
	
}
