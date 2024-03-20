package com.jsp.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class PrintSourceCodeInConsole {
public static void main(String[] args) {
		
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("C:\\DataStructure\\FileHandling\\src\\com\\jsp\\filehandling\\MainClass2.java");
			int b=0;
			while((b=fin.read())!=-1) {
				System.out.print((char)b);
			}
			
		} catch (Exception  e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
			}
		}
	}

}
