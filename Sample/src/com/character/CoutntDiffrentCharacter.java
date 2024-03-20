package com.character;

public class CoutntDiffrentCharacter {

	private void diffrent() {
		String s1="Basavarajuds184@gmail.com";
		String small="", capital="", number="", special="";
		int s=0, c=0, n=0, sp=0;
		char[] ch=s1.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			int c1=s1.charAt(i);
			if(c1>=97 && c1<=122) {
				s++;
				small+=(char)c1;
			}
			else if(c1>=65 && c1<=90){
				c++;
				capital+=(char)c1;
			}
			else if(c1>=48 && c1<=57) {
				n++;
				number+=(char)c1;
			}
			else {
				sp++;
				special+=(char)c1;
			}
		}
		System.out.println(small+" --> "+s);
		System.out.println(capital+" --> "+c);
		System.out.println(number+" --> "+n);
		System.out.println(special+" --> "+sp);

	}
	private static void notusingInbuiltMethod() {

		String s1="BAsavarajuds184@gmail.com";
		char[] c=s1.toCharArray();
		String cp="", sm="", nu="", sp="";
		
		for(int i=0; i<c.length; i++) {
			if(Character.isUpperCase(c[i])) {
				cp+=c[i];
			}else if(Character.isLowerCase(c[i])) {
				sm+=c[i];
			}else if(Character.isDigit(c[i])) {
				nu+=c[i];
			}else {
				sp+=c[i];
			}
		}
			System.out.println(cp);
			System.out.println(sm);
			System.out.println(nu);
			System.out.println(sp);
	}
	public static void main(String[] args) {
		notusingInbuiltMethod();
		
	}
}

// small --> 3 --> abc
// capital --> 
// num -->
// speci -->