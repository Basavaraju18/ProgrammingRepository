package com.designpattern;

public class Singleton {

	public static void main(String[] args) {

		Abc obj =  Abc.getInstance();
	}

}

class Abc{
	
	private Abc() {
		System.out.println("Abc constructor");
	}
	
	static Abc obj1 = new Abc(); 
	
	public static Abc getInstance()
	
	{
		return obj1;
	}

}