package com.jsp.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

// wjp to CopyTheContentToOneFileToAnotherFile
public class CopyOneFileToAnotherFile    {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("D:\\CopyFiles\\Dhoni.txt");
		FileOutputStream fou=new FileOutputStream("D:\\CopyFiles\\Kohli.txt");
		
		int b=0;
		while((b=fin.read())!=-1) {
			System.out.print((char)b);
			fou.write(b);
			Thread.sleep(300);
			
			
		}
		System.out.println("Coppied successfully");
	}
}
// the process of writing java object to external file