package com.character;
import java.util.Arrays;
import java.util.Scanner;

//public class VowelFinder {
//
//    public static void findConsecutiveVowels(String input) {
//        int consecutiveCount = 0;
//
//        // Iterate through each character in the input string
//        for (int i = 0; i < input.length(); i++) {
//            char currentChar = Character.toLowerCase(input.charAt(i));
//
//            // Check if the current character is a vowel
//            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
//                consecutiveCount++;
//                // Print or process the consecutive vowel
//                System.out.print(currentChar);
//            } else {
//                // If a non-vowel is encountered, reset the consecutive count
//                consecutiveCount = 0;
//            }
//
//            // Print a separator if there are consecutive vowels
//            if (consecutiveCount > 1) {
//                System.out.print(", ");
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String inputString = "Hello, how are you? This is a test.";
//        System.out.print("Consecutive vowels: ");
//        findConsecutiveVowels(inputString);
//    }
//}


//
//public class VowelFinder {
//
//    public static void findConsecutiveVowels(String input) {
//        int currentCount = 0;
//        int maxCount = 0;
//        int endIndex = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            char currentChar = Character.toLowerCase(input.charAt(i));
//
//            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
//                currentCount++;
//
//                if (currentCount > maxCount) {
//                    maxCount = currentCount;
//                    endIndex = i;
//                }
//            } else {
//                currentCount = 0;
//            }
//        }
//
//        // Print the longest consecutive sequence of vowels
//        if (maxCount > 1) {
//            String longestVowelSequence = input.substring(endIndex - maxCount + 1, endIndex + 1);
//            System.out.println(longestVowelSequence);
//        } else {
//            System.out.println("No consecutive vowels found.");
//        }
//    }
//
//    public static void main(String[] args) {
//    	Scanner ip = new Scanner(System.in);
//    	System.out.println("Enter");
//        String inputString = ip.nextLine();
//        System.out.print("Longest consecutive vowels: ");
//        findConsecutiveVowels(inputString);
//    }
//}



public class LetterSwapping {

	private static void splittring() {

		String s1= "Hello how are you";
		String[] ss=s1.split(" ");

		System.out.println(Arrays.toString(ss));
	}

	private static void splitString2() {
		Scanner ip= new Scanner(System.in);
		System.out.println("Enyer the String");
		String s1=ip.nextLine();
		ip.close();



		int count=1;
		for (char c : s1.toCharArray()) 
		{
			if(c==' ') 
				count++;
		}

		String[] s2=new String[count];
		// Initialize the array with the correct size



		// Split the string into worda and store in them in tne array

		String currentWord="";
		int index=0;

		for(char c : s1.toCharArray()) {
			if(c != ' ') {
				currentWord+=c;
			}else {
				s2[index]=currentWord;
				//Move to the next index in the array
				index++;
				// clear the current word for the next word
				currentWord="";
			}
		}

		// Add the last word (after the last space) to the array
		s2[index] = currentWord;


		//		 s2[0]="ABC";
		//		 s2[1]="ABC";
		//		 s2[2]="ABC";
		//		 s2[3]="ABC";




		//		System.out.println(Arrays.toString(s2));

		for(int i=0; i<s2.length; i++) {
			char[] c=s2[i].toCharArray();
			if(c.length>1) {
				char temp=c[0];
				c[0]=c[c.length-1];
				c[c.length-1]=temp;
			}

			String new2=new String(c);
			System.out.println(new2+" ");
		}


	}


	private static void swapFirstAndLastWords() {

		String s1="Hello world";
		String[] ss=s1.split(" ");
		
		for(int i=0; i<ss.length; i++) {
			char[] c=ss[i].toCharArray();
			
			if(c.length>1) {
				char temp=c[0];
				c[0]=c[c.length-1];
				c[c.length-1]=temp;
			}
			
			String result=new String(c);
			System.out.println(result+" ");
		}
	}
	public static void main(String[] args) {

		//=============================================
//		splitString2();
		swapFirstAndLastWords();
		//=============================================

		String s1 = "Hello world";
//		String[] sr=s1.split(" "); 
		int count=1;
		for(char c : s1.toCharArray()) {
			if(c == ' ') {
				count++;
			}
		}
		String[] sr=new String[count];
		for (int i = 0; i < sr.length; i++) {
			char[] c=sr[i].toCharArray();
			if(c.length>1) {
				char temp=c[0];
				c[0]=c[c.length-1];
				c[c.length-1]=temp;
			}


			String new1=new String(c);
			//			System.out.print(new1+" ");
		}

	}

}


class SplitString{
	public static void main(String[] args) {
		String s1= "Hello how are you";
		String[] ss=s1.split(s1);

		System.out.println(Arrays.toString(ss));
	}
}









