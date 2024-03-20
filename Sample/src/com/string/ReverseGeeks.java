package com.string;
//import java.util.*;
//import java.io.*;
//import java.lang.*;
//
//
public final class ReverseGeeks {
//
//	//{ Driver Code Starts
//	//Initial Template for Java
//
//	
//	
//	    public static void main(String args[])throws IOException
//	    {
//	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//	        int t = Integer.parseInt(read.readLine());
//	        
//	        while(t-- >0)
//	        {
//	            String str = read.readLine();
//	            System.out.println(new Reverse().reverseWord(str));
//	        }
//	    }
//	}
//	// } Driver Code Ends
//
//
//	//User function Template for Java
//
//
//	class Reverse
//	{
//	    // Complete the function
//	    // str: input string
//	static String rev=null;
//	    public static String reverseWord(String str)
//	    {
//	        // Reverse the string str
//	        for(int i=str.length()-1; i>=0; i--){
//	             rev= rev+str.charAt(i);
//	        }
//	       return rev;
//	   
//	}
//}
//	

	public static String reverse(String str)
	{
		String rev="";
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
		return rev;
	}

	public static void main(String[] args) {
//		System.out.println(reverse("Geeks"));
		StringBuffer s2=new StringBuffer("asdfghjklmnbvcxz");
		
		int u = s2.capacity();
		System.out.println(u);
		for (int i = 0; i < s2.length(); i++) {
			if(s2.charAt(i) =='k') {
//				s2.append('a', i, 3);
			}
			System.out.print(s2.charAt(i));
		}
		
	}
}
