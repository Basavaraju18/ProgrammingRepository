package com.character;

public class PrintOnelyNumbers {

	private static void method1() {
//
//		String s1="basav18chai24";
//		char[] c=s1.toCharArray();
//		String md="";
//		
//		String n="";
//		for (int i = 0; i < c.length; i++) {
//			if(c[i]>48 && c[i]<57) {
//				 n=n+c[i];
//			}
//			else {
//				md+=c[i];
//				
//			}
//		}
//		System.out.println(n);
//		System.out.println(md);
//		
	}
	
	
	
	
	private static void method2() {

		String s1="Basava18MsD7";
		char[] c1=s1.toCharArray();
		String mdn="";
		String md="";
		for (int i = 0; i < c1.length; i++) 
		{
			if(c1[i]>48 && c1[i]<57) 
				mdn+=c1[i];
		
		else if((c1[i]>65 && c1[i]<90) || (c1[i]>97 && c1[i]<122)) 
		{
			md+=c1[i];
		}
			
			
		}
		
		System.out.println(md);
		System.out.println(mdn);
	}

	public static void main(String[] args) {
		method2();
		
	}
}

