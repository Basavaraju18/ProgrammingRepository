package com.jsp.filehandling;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

//d-serialization
public class DeSerialization {

	public static void main(String[] args) throws Exception {

		FileInputStream fin=new FileInputStream("");
		ObjectInputStream oin=new ObjectInputStream(fin);

		Student std=(Student)oin.readObject();
		
		System.out.println("Student Id :"+std.getId());
		System.out.println("Student Name :"+std.getName());
		System.out.println("Student Per :"+std.getPer());
		

	}
}