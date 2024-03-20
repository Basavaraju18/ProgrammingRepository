package com.jsp.filehandling;

import java.io.FileInputStream;

public class ToCountNumberOfLineInCodes {
	
	public static void main(String[] args) throws Exception{
		int lineCount=0;
		FileInputStream fin=null;
		fin= new FileInputStream("D:\\MyFile\\\\AllFile.java");
		int b=0;
		while((b=fin.read())!=-1) {
			if(b=='\n') {
				lineCount++;
			}

		}
		System.out.println("line count is : " +lineCount+1);

	}

}
