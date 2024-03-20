package com.character;

public class ConvertEachWordsFIntoUpper {
	
	private static void conevrtingEWToUpperCase() {

		String s1="hi hello how are   you";
		char[] c=s1.toCharArray();
		String md="";
		for(int i=0; i < c.length; i++) 
		{
			if(c[i]==c[0] || c[i-1]==' ' ) {
				char cr=Character.toUpperCase(c[i]);
				md=md+(char)cr;
			}
			else 
				md=md+(char)c[i];
			
		}
		System.out.println(md);
	}	
	
	
	private static void method2() {

		String s2 = "Hi hello how are you";
		
		char[] c = s2.toCharArray();
		
		String md ="";
		
		for (int i = 0; i < c.length; i++) {
			
			if(c[i]== c[0] || c[i-1] == ' ') {
				char cr = Character.toUpperCase(c[i]);
				md+=(char)cr;
				
			}
			else {
				md+=c[i];
			}
		}
		System.out.println(md);

	}
	
	public static void main(String[] args) {
//		conevrtingEWToUpperCase();
		method2();
	}

}
