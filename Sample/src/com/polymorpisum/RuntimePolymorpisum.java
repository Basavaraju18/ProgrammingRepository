package com.polymorpisum;


class Vehicle{
	public void start() {
		System.out.println("Vehicle is started");
		
	}
}

class Car extends Vehicle{
	@Override
	public void start() {
		System.out.println("Car is started");
	}
}

 class Bike extends Vehicle{
	 @Override
	 public void start() {
		System.out.println("Bike is started"); 
	 }
 }

public class RuntimePolymorpisum {

	public static void main(String[] args) {
		
		Vehicle v=new Car();  // Up casting
		v.start();  		// Car is started
		
		Vehicle v1=new Bike();  //up casting
		v1.start();				// Bike is started   
	}
	
}

/**
 * jvm will decide which method should i get execute on o the run time so its called as Runtime polymorpisum 
 */


