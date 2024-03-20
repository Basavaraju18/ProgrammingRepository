package com.raghu.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintTheNumberOfCharcterOfAlphabetsPresentInStrring {

	public static void main(String[] args) {
		
		String str="abcdefgjgsreodidgsks khdknnd";
		
		Map<Integer, Long> fcount=str.chars().boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		fcount.entrySet().forEach(e->System.out.println((char)(int)e.getKey()+" -> "+e.getValue()));
	}
}
