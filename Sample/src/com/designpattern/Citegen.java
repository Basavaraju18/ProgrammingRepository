package com.designpattern;

public class Citegen {

	public static void main(String[] args) {

		PrimeMinister instance = PrimeMinister.getInstance();
		System.out.println(instance.name);
		System.out.println(instance.age);

	}
}
