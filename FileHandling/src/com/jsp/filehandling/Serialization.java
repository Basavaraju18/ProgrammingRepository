package com.jsp.filehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {
	
	public static void main(String[] args) throws Exception {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Entr the id, name and percentage: ");
//		int id=ip.nextInt();
//		String name=ip.next();
//		double per=ip.nextDouble();
		int id = 12;
		String name = "arun";
		double per = 100.0;
		
		Student std= new Student(id, name, per);
		System.out.println(std.getId());
		System.out.println(std.getName());
		System.out.println(std.getPer());
		
		FileOutputStream fileOut=new FileOutputStream("D:\\DataStructure\\FileHandling\\src\\com\\jsp\\filehandling\\demo");
		ObjectOutputStream out=new ObjectOutputStream(fileOut);
		
		out.writeObject(std);
		fileOut.flush();
		out.close();
		ip.close();
		
	// new keyword =constuction
		// d-serialized
		
	}

}
// reading the object from the file is called is called as d-serialization