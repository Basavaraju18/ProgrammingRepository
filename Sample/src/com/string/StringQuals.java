package com.string;

public class StringQuals {

	private static void euqlasString() {
		String s1="Kiran";
		String s2="kirai";

		int l1=s1.length();
		int l2=s2.length(); 

		if(l1==l2) {
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();

			int count=0;
			for (int i = 0; i < c1.length; i++) 
			{
				if(c1[i]==c2[i]) 
					count++;
			}
			
			if(l1==count) 

				System.out.println(true);
			else
				System.out.println(false);


		}

		else {
			System.out.println(false);
		}

	}

	public static void main(String[] args) {
		euqlasString();
	}

}
