package com.string;

// Replace the vowels in the String with -1
final class VowelsReplacement {
	
	
	
	
	private static void method0() {

		String s1 = "hello hi how are you";
		char[] c=s1.toCharArray();
		char[] ae= {'a', 'e', 'i', 'o', 'u'};
		String ms="";
		for (int i = 0; i < s1.length(); i++) {
			if(c[i]=='a'|| c[i]=='e'|| c[i]=='o'|| c[i]=='u') 
			ms=ms+'a';	
			else 
				ms=ms+c[i];
		}
		System.out.println(ms);
	}
	
	
	private static void method1() {
		String s1 = "Hi Hello bye";
        StringBuilder mc=new StringBuilder();
        for(int i=0; i<s1.length(); i++) {
        	char cc=s1.charAt(i);
        	if(cc=='a'|| cc=='e'|| cc=='i'|| cc=='o'|| cc=='u') {
        		mc.append('a');
        	}else {
        		mc.append(cc);
        	}
        }
       System.out.println(mc);

	}

	private static void method2() {

		String s1= "Basavaraju ds";
		int vowles=1;
		String result="";
		for(int i=0; i<s1.length(); i++) {
			char c=s1.charAt(i);
			
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				 result=result+vowles;
			}
			else {
				result=result+s1.charAt(i);
			}
		}
		System.out.println(result);
	}
	
	private static void firstandLastWords() {
		
		String s1="Hello world";
		char[] c=s1.toCharArray();
		String ms="";
		for (int i = 0; i < 1; i++) {
			if(c[i+1]==' ' || c[i-1]==' ') {
				
			}
		}
		
	}
    public static void main(String[] args) {
//        method0();
//        method1();
//        method2();
    	firstandLastWords();
        
    }
}
