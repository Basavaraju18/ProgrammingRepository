package com.jsp.filehandling;

import java.io.File;

public class CountNumberOfFilePresentInFolder {
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\User\\Desktop\\BAS18");
		String[] sf= f.list();
		int count = 0;
		for(String st : sf) {
			
			if(st.endsWith(".java")){
				System.out.println(st);
				count++;
			}
		}

		System.out.println("=================");
		System.out.println("the numbwr of file is "+ count);

	}

}
