package com.bs18;


class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Upcating {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog; // Upcasting
        animal.makeSound();  // This will call the Dog's overridden method
    }
}

/**
 * Upcasting is the process of converting an object of a derived (sub) class to a reference of its base (super) class. 
 * This is a safe operation because a derived class object inherits all the properties and behaviors of the base class.
 *
 */

