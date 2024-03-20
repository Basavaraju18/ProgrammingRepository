package com.character;

import java.util.Scanner;

class InvalidPasswordExcepttion extends RuntimeException{
	private String message;


	public InvalidPasswordExcepttion(String message) {
		this.message=message;
	}

	public String getMessage() {
		return message;
	}
}
public class CoustomException {

	public static void main(String[] args) {
		Scanner ip  = new Scanner(System.in);
		System.out.println("Enter the password");

		int ps=ip.nextInt();
		if(ps==1234) {
			System.out.println("login Successful");
		}
		else {
			try {
				throw new InvalidPasswordExcepttion("Invalid password");
			}

			catch(Exception e) {
				System.out.println(e.getMessage());
			}

			finally {
				System.out.println("Inside finally block");
			}
		}
	}
}
