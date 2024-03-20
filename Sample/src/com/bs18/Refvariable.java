package com.bs18;

public class Refvariable {
	static String name ;
	  int age ;
	
	  Refvariable(String name, int age){
		  this.name= name;
		  this.age=age;
	  }
	  
	public void  sampleMethod(){
		  int age;
		  String name;
	  }
	  
	  public static void main(String[] args) {
		Refvariable r1 = new Refvariable("Arun", 19);
		Refvariable r2 = new Refvariable("Kiran", 19);
		
		System.out.println(r1.name);
		System.out.println(r1.age);
		System.out.println(r2.age);
	}
	

}
