package com.raghu.stream;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersPresentInListOfCollection {

	public static void main(String[] args) {
		
		
		List<Integer> value=Arrays.asList(23, 45, 67 ,66, 23, 1, 23, 45, 45);
		
		long ecount=value.stream()
						.filter(a-> a%2==0)
						.count();
		System.out.println(ecount);
						
	} 
	
}
