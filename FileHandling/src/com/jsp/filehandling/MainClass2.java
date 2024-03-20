package com.jsp.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class MainClass2 {
	public static void main(String[] args) {
		
		FileInputStream fin=null;
		try {
			fin=new FileInputStream("D:\\Dhoni.txt");
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
