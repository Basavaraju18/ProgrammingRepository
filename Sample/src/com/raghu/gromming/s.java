package com.raghu.gromming;

import java.util.Arrays;

public class s {
	public static void main(String[] args) {
		String s="Basavaraju hii hello";
		int count=0;

		char[] ch=new char[s.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s.charAt(i);
			}
		for (int i = 0; i < ch.length-1; i++) {
			if((i==0 && ch[i]!=' ')||(ch[i]!=' '&& ch[i+1]==' ')){
				count++;
			}
		}
		
		System.out.println(count);
		String[] sh=new String[count];
		String ans="";int k=0;
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i]!=' ') {
				ans=ans+ch[i];
				
			}else {
				sh[k++]=ans;
				ans="";
			}
		}
		if(ans!=null) {
		sh[k]=ans;
		}
		System.out.println(Arrays.toString(sh));
	}

}
