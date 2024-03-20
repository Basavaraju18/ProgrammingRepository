package com.hackerrank;

import java.util.Arrays;

public class StoreOneElementsOneToAnother {
	
	private static void storeFromeOneToAnother() {
		
		int[] arr = {5, 4, 3, 2, 1};
		
		int[] arr2 = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr2[i]=arr[i];
		}
		System.out.println(Arrays.toString(arr2));
		

	}
	
	private static void storeOneStringArrayToAnotherStringArray() {

		String sr = "hi hello bye";
		char[] ch = sr.toCharArray();
		
		String[] sr2 = new String[3];
		
		String w="";
		for (int i = 0; i < sr.length(); i++) {
			if(ch[i] != ' ') {
				
			}
		}
		
		System.out.println(Arrays.toString(sr2));
	}
	public static void main(String[] args) {
//		storeFromeOneToAnother();
		storeOneStringArrayToAnotherStringArray();
	}

}
