package com.hackerrank;

public class PageCount {

	private static int pageCount(int length, int page) {
		 int fromStart = page / 2;
	        int fromEnd = (length/2)-fromStart;
	        return Math.min(fromStart, fromEnd);
	}
	
	
	
	public static void main(String[] args) {

		int length = 6;
		int page = 2;

		int result = pageCount(length, page);
		System.out.println(result);
	}

	


}
