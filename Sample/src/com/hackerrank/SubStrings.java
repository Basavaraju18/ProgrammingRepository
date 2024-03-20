package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class SubStrings {

	private static int sample(String s) {

		int countUnique =  0;
	    Map<Character,Integer> storingForP = new HashMap<Character,Integer>();
	    StringBuilder sb = new StringBuilder(s);
	    StringBuilder p = new StringBuilder();
	   
	    p.append(s.charAt(0));
	    
	    storingForP.put(p.charAt(0),1);
	    
	    for(int i = 1; i<s.length(); i++)
	    {
	       p.append(sb.charAt(i));
	       
	       if( !storingForP.containsKey(p.charAt(p.length()-1)) )
	       {
	           countUnique++;
	           storingForP.put(p.charAt(p.length()-1),1);
	       }
	    }
	         return countUnique+1;
	    

	}
	
	private static int byMe(String s1) {

		char[] c = s1.toCharArray();
		Set<Character> cArray= new TreeSet<Character>();
		for (int i = 0; i < c.length; i++) {
			cArray.add(c[i]);
		}
		
		int n = cArray.size();
		return n;
	}
	public static void main(String[] args) {
		
		String s1 = "abcdfgh";
//		int sample = sample(s1);
//		System.out.println(sample);
		
		
		int res=byMe(s1);
		System.out.println(res);
	}

}
