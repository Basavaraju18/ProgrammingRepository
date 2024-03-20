package com.bs18;

 
 
	
	
public class ToString {
	    private String name;
	    private int age;

	    // Constructor
	    public ToString(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Override the toString() method
	    @Override
	    public String toString() {
	        return "Person [name=" + name + ", age=" + age + "]";
	    }

	    public static void main(String[] args) {
	    	ToString p = new ToString("Alice", 30);
	        System.out.println(p); // Calls the overridden toString() method
	    }
	}

 

