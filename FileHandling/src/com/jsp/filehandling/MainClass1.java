package com.jsp.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass1 {
	
	public static void main(String[] args) {
		String str= "Java is aobject  oriented programming language";
		
		FileOutputStream fout=null;
		
		try {
			fout= new FileOutputStream("D:\\Raghu.New");
			byte[] b=str.getBytes();
			try {
//				fout.write(b);
				fout.write(b, 7, 14);
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fout.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Successfully written");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thank you");
	}

}

// using throws we can pass the 