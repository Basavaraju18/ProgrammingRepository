package com.character;

public class CountSample {
	
	
	private static void countSample() {

		String s1="karthik";
		char[] c=s1.toCharArray();
		int count=0;
		for (int i = 0; i < c.length; i++) 
		{
			 count=1;
			for (int j = i+1; j < c.length; j++) 
			{
				if(c[i]==c[j]) 
				{
					count++;
					c[j]=' ';
				}
				
			}
			if(c[i]!=' ') {
				System.out.println(c[i]+" "+ count);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		
		countSample();
	}

}
