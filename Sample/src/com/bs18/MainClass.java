package com.bs18;

abstract class Arun{

	public  abstract void eating() ;

}

class Varun extends Arun {

	@Override
	public void eating() {
		System.out.println("Varun is eating");	
	}	
}

public class MainClass {

	public static void main(String[] args) {
		Varun v=new Varun();
		v.eating();
		System.out.println("Hi");

		Arun a=new Arun() {
			@Override
			public void eating() {
				System.out.println("Arun is eating");
			}
		};
		a.eating();


	}

}
