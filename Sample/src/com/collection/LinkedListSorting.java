package com.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Employee{
	int age;
	String name;
	
	Employee(int age, String name){
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Age is "+age+" and Name is "+name; 
	}
	
}
public class LinkedListSorting {
	
	public static void main(String[] args) {
		Employee e1= new Employee(22, "Arun");
		Employee e2= new Employee(23, "Bas");
		Employee e3= new Employee(21, "Charan");
		Employee e4= new Employee(24, "Kiran");
		Employee e5= new Employee(25, "Varun");
		
		Set<Employee> s1=new HashSet<Employee>();
		s1.add(e5);
		s1.add(e4);
//		s1.add(e5);
		s1.add(e3);
		s1.add(e2);
		s1.add(e1);
		
//		Collections.sort(s1);
		for(Employee i : s1) {
			System.out.println(i);
		}
		
	}

}
