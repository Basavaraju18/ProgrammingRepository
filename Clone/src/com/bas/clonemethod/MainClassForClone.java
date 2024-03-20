package com.bas.clonemethod;

public class MainClassForClone {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		StudentClone s1 = new StudentClone("Arun", 22);
		System.out.println(s1);
		StudentClone s2=(StudentClone) s1.clone();
		System.out.println("===========");
		System.out.println(s2);
	}

}
