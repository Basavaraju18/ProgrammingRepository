package com.character;

public final class PrintNoConsonants {
	
	private static void noOfConsonant() throws InterruptedException {
		String s1="Basavarajuds BasavarajuDs";
		int count=0;
		char[] c=s1.toCharArray();
		int l=c.length;
		for(int i=0; i<l; i++) {
			count=1;
			
			for(int j=i+1; j<l; j++) 
			{
				
				if(c[i]==c[j]) 
				{
					count++;
					c[j]=' ';
				}
			}
//			Thread.sleep(800);
//			if((c[i]!=' ') && (c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u'))     // || c[i]!='a' || c[i]!='e' || c[i]!='i' || c[i]!='o' || c[i]!='u'
			if(c[i]!=' ')
			System.out.println(c[i]+" --> "+count);
		}

	}
	public static void main(String[] args) throws InterruptedException {
		noOfConsonant();
	}

}


