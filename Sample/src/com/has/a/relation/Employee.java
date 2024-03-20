package com.has.a.relation;

class Name{
	String firstName;
	String middleName;
	String lastName;
	
	public Name(String firstName, String middleName, String lastName) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
}

public class Employee {
	
	int age;
	Name n;
	
	public void display(int age, Name n) {
		System.out.println("Age : "+age);
		System.out.println("FirstName : "+n.firstName
				+"\nMiddleName : "+n.middleName
				+"\nLastName : "+ n.lastName);
	}
	
	
	public static void main(String[] args) {
		Employee e =new Employee();
		Name n=new Name("Basavaraju", "D", "S");
		e.display(22, n);
	}
	
	
	

}
