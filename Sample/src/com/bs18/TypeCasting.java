package com.bs18;

//
//class Car{
//	int price=10000;
//	String name="BMW";
//	String color="red";
//
//	void display() {
//		System.out.println("Tha Car Name is :"+name );
//		System.out.println("Tha Car Price is :"+price );
//		System.out.println("Tha Car Color is :"+color );
//	}
//
//}
//class Bike extends Car{
//	String name="MT15";
//	int price=100;
//	String color ="red";
//
//	void display(){
//		System.out.println("Tha Bike Name is :"+name );
//		System.out.println("Tha Bike Price is :"+price );
//		System.out.println("Tha Bike Color is :"+color );
//	}
//
//}
//

//
//public class TypeCasting {
//
//
//	public static void main(String[] args) {		
//		Car c=new Car();
//		c.displayCar();
//		Bike b=new Bike();
//		b.display();
//		
//		
//		Car c= b;
//		Bike b2=(Bike)c;
//		c.display();
//		b2.display();
//		
//	}
//}



class Animal12 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
    
    void animalSound() {
    	System.out.println("Hi animal another sound");
    }
}

class Dog12 extends Animal12 {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches a ball");
    }
}

public class TypeCasting {
    public static void main(String[] args) {
        Animal12 animal12 = new Dog12();  // Upcasting: Dog object treated as Animal
        animal12.makeSound();  // Output: Dog barks

        // Downcasting: Animal reference cast to Dog
        Dog12 dog12 = (Dog12) animal12;
        dog12.makeSound();  // Output: Dog barks
        dog12.fetch();      // Output: Dog fetches a ball
        dog12.animalSound();
    }
}
