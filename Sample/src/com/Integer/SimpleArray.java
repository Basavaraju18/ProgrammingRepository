package com.Integer;

public class SimpleArray {

	private static void div() throws ArithmeticException {
		System.out.println(10/0);
	}

	public static void main(String[] args) {

		Demo2 demo2 = new Demo2();
		try {
			div();
		}
		catch(Exception e){
			System.out.println("Invalid denominator");
		}
	}
}


class Demo2{

	private static void display() throws Exception {

		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}


	public static void main(String[] args) {
		try {
			display();
		}
		catch(Exception e) {
			System.out.println("Handle");
		}
	}
}