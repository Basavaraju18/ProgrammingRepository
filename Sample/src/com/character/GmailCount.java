package com.character;

public class GmailCount {

	public static void main(String[] args) {
		String gmail="BAasavarajuds184@gmail.com";
		char[] c=gmail.toCharArray();
		int num = 0, sp = 0, sm = 0, cp = 0;
		String special = "", number = "", small = "", capital = "";
		
		for(int i=0; i<c.length; i++) {
			if(c[i]>=65 && c[i]<=90) {
				capital+=c[i];
				cp++;
				
			}
			else if(c[i]>=97 && c[i]<=122) {
				small+=c[i];
				sm++;
			}
			else if(c[i]>=48 && c[i]<=57) {
				number+=c[i];
				num++;
			}
			else {
				special+=c[i];
				sp++;
			}
		}
		System.out.println(capital+" --> "+cp);
		System.out.println(small+" --> "+sm);
		System.out.println(number+" --> "+num);
		System.out.println(special+" --> "+sp);



	}
}
