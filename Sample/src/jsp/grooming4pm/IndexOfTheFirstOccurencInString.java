package jsp.grooming4pm;

import java.util.Scanner;

public final class IndexOfTheFirstOccurencInString {

	
	static int find(String s1, String s2) {
		char[] ch1= s1.toCharArray();

		char[] ch2= s2.toCharArray();

		String temp="";

		for (int i = 0; i < ch2.length; i++) 
		{
			temp=temp+ch1[i];
		}
		if(temp.equals(s2))
		{
			return 0;
		}
		else 
		{
			for (int i = 0; i < ch1.length; i++) 
			{
				String temp2="";
				for (int j = i+1; j < ch1.length; j++) 
				{
					temp2=temp2+ch1[j];
					if(temp2.equals(s2))
					{
						return i+1;
					}
				}
			}
		}

		return -1;
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ip =new Scanner(System.in);
		System.out.println("Enter the First string");
		String s1 = ip.next();
		System.out.println("Enter the Second String");
		String s2 = ip.next();

		int n=find(s1, s2);
		System.out.println(n);
	}
}

