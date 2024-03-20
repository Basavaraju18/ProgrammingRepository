package com.jsp.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class ToStoretheDataInTheCharacter {

	public static void main(String[] args) throws IOException {
		
		String str="java is an object programming language";
		
		FileWriter fw = new FileWriter("D:\\MyFile\\InTheFormOfStream.txt");
		System.out.println("Stored Successfully");
		
		fw.write(str);
		fw.flush();
		fw.close();
		
	}
}
