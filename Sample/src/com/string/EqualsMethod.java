package com.string;

class Hotel {

	double ratings;

	Hotel(double ratings){
		this.ratings=ratings;
	}


	private final void method1() {
		System.out.println("final method");

	}
	@Override
	public boolean equals(Object obj) {
		Hotel h =(Hotel) obj;
		return this.ratings==h.ratings;
	}
}

class Pen{
	@Override
	public String toString() {
		return "Basavaraj";
		
	}
	
}

public class EqualsMethod {


	public static void main(String[] args) {
		
		Pen p= new Pen();
		System.out.println(p);
		Hotel h1 = new Hotel(4.5);
		Hotel h2 = new Hotel(4.51);

		System.out.println(h1.equals(h2));
		if(h1.equals(h2)){
			System.out.println("Ratings of both the hotels are same");
		}
		//GODISNOWHERE
		else {
			System.out.println("Ratings of both the hotels are diffrent");
		}
	}
}