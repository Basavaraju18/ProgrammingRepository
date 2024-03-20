package com.enums.injava;

public class MainClass {
	
	public static void main(String[] args) {
		
		Color c1=Color.RED;
		System.out.println(c1.name());
		System.out.println(c1.getValue());
		
		for(Color color:Color.values()) {
			System.out.println(("Enum values : "+color.getValue()));
		}
	}
}
