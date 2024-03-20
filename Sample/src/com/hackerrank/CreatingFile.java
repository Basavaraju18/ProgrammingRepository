package com.hackerrank;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

	private void createFile() {

		File f = new File("D:\\DataStructure\\FileHandling\\src\\com\\jsp\\filehandling\\Pen.pdf");

		try {
			boolean res = f.createNewFile();
			System.out.println(res);
		} catch (IOException e) {
			e.getMessage();
		}

	}

	private  static void deleteFile() {

		File f = new File("Pen");

		if(f.exists()) {
			f.delete();
			System.out.println("File is deleted");
		}
		else {
			System.out.println("File is not Present");
		}

	}


	public static void main(String[] args) {
		
		deleteFile();

	}

}
