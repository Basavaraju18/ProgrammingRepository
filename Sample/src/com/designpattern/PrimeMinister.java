package com.designpattern;

public class PrimeMinister {

	String name = "Modhi";
	int age = 73;

	// private constructor --> if we dont't declare private constructorjvm will create default constructor of the class that default constructor  	lead to create a object outside of the class so it will lead to not to achieve the singleton design class.  
	private PrimeMinister() {
		System.out.println("Pm is selected");
	}

	private static PrimeMinister pm;

	public static PrimeMinister getInstance() {

		if(pm == null) {

			pm= new PrimeMinister();
		}

		return pm;
	}

}

