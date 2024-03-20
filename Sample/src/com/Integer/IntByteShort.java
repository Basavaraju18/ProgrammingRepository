package com.Integer;

public class IntByteShort {

	public class Car {
		String model="Bmw";
		void start() {
			System.out.println(this.model);
		}
		void move() {
			System.out.println(this.model);
		}
	}
	public class Driver {
		void drive() {
			Car c=new Car();
			System.out.println(c.model);
		}
	}

	private void sample() {

		System.out.println("Main method");

		method2();
		method3();

	}

	void method2() {
		System.out.println("Second method");
	}

	void method3() {
		System.out.println("Third method");
	}


	public static void main(String[] args) {

		IntByteShort s = new IntByteShort();
		System.out.println(s);
		s.sample();


	}

}
