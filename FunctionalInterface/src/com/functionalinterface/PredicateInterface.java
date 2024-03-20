package com.functionalinterface;

import java.util.function.Predicate;

public class PredicateInterface {
	
	public static void main(String[] args) {
		
		Predicate<Integer>  isEven=(x)->x%2==0;
		
		System.out.println(isEven.test(34));  // true
		System.out.println(isEven.test(35));  // false
		
		Predicate<Integer>  isPrime=(x)->{
										for(int i=2; i<=x/2; i++) {
											if(x%i==0) 
												return false;
										}
										
										return true;
										};
		
						System.out.println("Prime number or not : "+isPrime.test(11));
	
	}
}
