package com.uday;

public class Car {
	
	int cost;
	
	public Car(int cost) {
		this.cost = cost;
	}
	
	@Override
	public boolean equals(Object obj) {

		Car c =(Car)obj;
		return this.cost == c.cost;
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(200);
		Car c2 = new Car(200);
		
		if(c1.equals(c2)) {
			System.out.println("They are same");
		}
		else {
			System.out.println("Not equls");
		}
	}
		 
}
