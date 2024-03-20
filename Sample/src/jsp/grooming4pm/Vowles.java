package jsp.grooming4pm;

import java.util.Scanner;

// reverse the string
public final class Vowles {

	private static void reverseString() {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=ip.nextLine();
		String consonant="";
		int vowel=1;
		for(int i=0; i<s1.length(); i++)   // java.lang.StringIndexOutOfBoundsException:
		{
			char c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				consonant=consonant+vowel;
			}
			else {
				
				consonant=consonant+s1.charAt(i);
			}
		}
		System.out.print(consonant);
	}

	
	private static void countVowles() {
		String s1="Basavaraju Ds";
		int count=0;
		for(int i=0; i<s1.length()-1; i++) {
			char c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'  ) {
				count++;
			}
		}
		System.out.println(count);

	}
	public static void main(String[] args) {
//		reverseString();
		countVowles();
	}
}

