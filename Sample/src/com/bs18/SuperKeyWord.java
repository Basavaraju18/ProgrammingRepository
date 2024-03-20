package com.bs18;

class  college{
	String student="arun";
	int age=22;
	String adress="Banglore";
	
	void display() {
		System.out.println(student +" "+ age+" "+adress);
	}
}

class School extends college  {
	
	String student="arun1";
	int age=23;
	String adress="Banglore1";
	
	void display() {
		super.display();
		System.out.println(student +" "+ age+" "+adress);
	}
}



public class SuperKeyWord {
	
	public static void main(String[] args) {
		
		School ss=new School();
		ss.display();
	}
}
