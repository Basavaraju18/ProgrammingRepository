package com.bas.newInstanceMethod;

public class Dinga {
	
	static {
		System.out.println("Dinga Static block");
		
	}
	Dinga(){
		System.out.println("Dinga class Constructor ");
	}
	
	public void dingaMethod() {
		System.out.println("Dinga method is called");
	}

}