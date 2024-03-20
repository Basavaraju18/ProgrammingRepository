package com.jsp.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

// D:\MyFile\\AllFile.java

public class PrintMultipleFileDataIntoSingleFile {

	public static void main(String[] args) throws Exception {

		File f = new File("C:\\Users\\User\\Desktop\\BAS18");
		
		Vector<InputStream> v= new Vector<InputStream>();
		String[] str=f.list();
		
		for(String st: str) {
			
			if(st.endsWith(".java")) {
				FileInputStream fin= new FileInputStream(f.getAbsoluteFile()+"\\"+st);
				v.add(fin);
			}
		}
		Enumeration<InputStream> en = v.elements();
		SequenceInputStream sin=new SequenceInputStream(en);
		FileOutputStream fout = new FileOutputStream("D:\\MyFile\\\\AllFile.java");
		int b=0;
		while((b=sin.read())!=-1) {
			System.out.print((char)b);
			fout.write(b);
		}
		fout.flush();
		fout.close();
		sin.close();
	}	
}
