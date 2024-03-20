package com.jsp.ds;

import java.util.ArrayList;
import java.util.List;

// Example of an OutOfMemoryError
	public class OutOfMemoryExample {

		public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        while (true) {
	            list.add(1);
	           
	        }
	    }
	}

