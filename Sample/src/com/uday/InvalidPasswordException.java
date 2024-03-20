package com.uday;

import java.util.Scanner;

public class InvalidPasswordException extends RuntimeException {

	class Message extends RuntimeException {
		private String message;


		public Message(String message) {
			this.message=message;
		}

		@Override
		public String getMessage() {
			return message;
		}


		public static void main(String[] args) {
			

		}

	}
}


class Login{

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int password = ip.nextInt();

		System.out.println("Enter the password");
		ip.close();

		if(password == 123) {
			System.out.println("Login Successful");
		}

		else {
		}
	}
}