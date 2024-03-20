package cpm.pattern;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Student {
	
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student age=" + age + ", name=" + name ;
	}

}

 public class StudentByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {

//		return o1.age-o2.age;
		return o1.name.compareTo(o2.name);
	}
	 
	 public static void main(String[] args) {
		
		 StudentByName studentByName = new StudentByName(); 
		 
		 TreeSet<Student> t = new TreeSet<Student>(studentByName);
		 t.add(new Student(24, "Kiran"));
		 t.add(new Student(13, "Arun"));
		 t.add(new Student(20, "Tarun"));
		 t.add(new Student(12, "Charan"));
		 
		 for(Student i : t) {
			 System.out.println(i);
		 }
	}
 }