package com.program50;

import java.util.ArrayList;
import java.util.List;

class Student{
	String name;
	int rollNum;
	double marks;
	
	public Student(String name, int rollNum, double marks) {
		this.name=name;
		this.rollNum=rollNum;
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return name+" "+rollNum+" "+marks;
	}
}


public class SampleClass {

	public static void main(String[] args) {
		
	List<Student> al = new ArrayList<Student>();
		al.add( new Student("Arun", 1, 10));
		al.add( new Student("Charan", 2, 8));
		al.add( new Student("Varun", 4, 9));
		al.add( new Student("Kiran", 3, 10));
		
		
		for(Student s : al) {
			System.out.println(s);
		}
		
	}
}
