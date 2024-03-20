package com.character;

public final class CharacterPresentInString {

	
	public static void main(String[] args) {
		String s1 ="Kartik";
		int count=0;
		char[] ch=s1.toCharArray();
		
		for(int i=0; i<s1.length(); i++) {
			count=1;
			
			for(int j=i+1; j<s1.length(); j++) {
				if(ch[i]==ch[j]) {
				count++;
				ch[j]=' ';
				}
			}
		
//		if(ch[j]!=' ') 
//			System.out.println(ch[j]);
		}
	}
}
