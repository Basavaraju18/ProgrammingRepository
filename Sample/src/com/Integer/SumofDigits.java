package com.Integer;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SumofDigits {
	
	private static void sumOfLastDigitsOgTwoNumbers() {
	
		int n=123432;
		for (int i = n; i>0; i=i/10) {
			System.out.println(i);
		}
	}
	private static void reverse() {
		int n=123;
		int rev=0;
		for(int i=n; i>0; i/=10) {
			int last=i%10;
			rev=(rev*10)+last;
			System.out.print(last);
		}
		System.out.println(rev);
	}
	
	private static void numberPalindrome() {

		int n=12321;
		int rev=0;
		int temp=n;
		
		for(int i=n; i>0; i=i/10) {
			int last=i%10;
			rev=rev*10+last;
		}
		if(rev==temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Noat a palindrome");
		}
		
	}
	
	private static void aramstrongNumber() {
		
		int n=153;
		int armstrong=0;
		for(int i=n; i>0; i=i/10) {
			int num=i%10;
			armstrong=armstrong+(num*num*num);
		}
		if(n==armstrong) {
			System.out.println("Armstromg");
		}
		else {
			System.out.println("Not a aramstrong");
		}
		
	}
	
	private static void swapNumbers() {

		int a=10;
		int b=20;

		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);
		
	}
	
	private static void factorial() {

		int a=7;
		int fact=1;
		for(int i=a; i>0; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	
	private static void printEvevreywordLastSecondLetter() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the string :");
		String s1=ip.nextLine();
		char[] c=s1.toCharArray();
		
		for(int i=0; i<c.length; i++) {
			if(c[i]==' ') {
				System.out.println(c[i-2]);
			}
		}
		System.out.println(c[c.length-2]);
		System.out.println(s1.charAt(s1.length()-2));
	}
	
	private static void printEveryWordLastSecondLetter() {
	    String s1 = "Hello basava raj hi d programm";
	    char[] c = s1.toCharArray();

	    for (int i = 0; i < c.length; i++) {
	        if ((i + 1 < c.length && c[i + 1] == ' ') || (i == c.length - 1)) {
	            System.out.print(c[i-1] + " ");
	        }
	    }
	}

	
	private static void stringWords() {
//		Scanner ip= new Scanner(System.in);
//		System.out.println("Enter the String :");
		
		String s1="hi hello what";
		int size=1;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				size++;
			}
		}
		
		String[] s2=new String[size];
		int startIndex=0;
		int wordIndex=0;
		for(int i=0; i<size; i++) {
			if(s1.charAt(i)== ' ') {
				s2[wordIndex++]=s1.substring(startIndex, i);
				startIndex=i+1;
			}
		}
		// Store the last word (or the only word if there's only one)
	    s2[wordIndex] = s1.substring(startIndex);

		
		for(int i=0; i<s2.length; i++) {
			System.out.println(s2[i]);
		}
		
	}
	public static void main(String[] args) {
//		sumOfLastDigitsOgTwoNumbers();
//		reverse();
//		numberPalindrome();
//		aramstrongNumber();
//		swapNumbers();
//		factorial();
//		printEvevreywordLastSecondLetter();
//		printEveryWordLastSecondLetter();
		stringWords();
	}

}
