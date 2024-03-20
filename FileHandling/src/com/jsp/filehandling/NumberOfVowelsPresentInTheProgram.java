package com.jsp.filehandling;

import java.io.FileInputStream;

public class NumberOfVowelsPresentInTheProgram {
	
	public static void main(String[] args) throws Exception {
		
		int vcount=0;
		String v="AEIOUaeiou";
		
		FileInputStream fin = new FileInputStream("D:\\MyFile\\StudentServiceImpl.java");  // "D:\\MyFile\\AllFile.java"==1276  
		 int b=0; 																		 	// D:\\MyFile\\StudentServiceImpl.java  == 3689
		 while((b=fin.read())!=-1) {
			 {
				 if(v.indexOf(b)!=-1) {
					 vcount++;
				 }
			 }
		 }
		 System.out.println("The bnumber os vowels is : "+vcount);
	}

}
