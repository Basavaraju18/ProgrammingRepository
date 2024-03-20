package com.raghu.hasarelation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class MainClass {
	
	public static void main(String[] args) {
		
		Address ad1 = new Address("banglore", "Karnaataka", "India");
		Address ad2 = new Address("Mandya", "Karnaataka", "India");
		
		
		// employee has the 
		
		//^ AGGRIGATION
		// reuse the one code class in another another class
		// it saves the memory
		Employee e1 = new Employee(01, "Arun", 90012, ad1);
		Employee e2 = new Employee(02, "Kiran", 80012, ad2);
		Employee e3 = new Employee(03, "Charan", 70012, ad2);
		Employee e4 = new Employee(04, "Varun", 66012, ad1);
		Employee e5 = new Employee(05, "Tharun", 40012, ad2);
		
//		List<Employee> al = new ArrayList<Employee>();
		
//			Set<Employee> al = new TreeSet<Employee>();   // classCastExcption
//			al.add(e5);
//			al.add(e1);
//			al.add(e2);
//			al.add(e3);
//			al.add(e4);
//			
//			for (Employee employee : al) {
//				System.out.println(employee);
//				
//			}
		
		
		
		// using MAP
//		Map<Employee, Integer> mp = new HashMap<>(); 
//		mp.put(e1, 1);
//		mp.put(e2, 2);
//		mp.put(e3, 3);
//		mp.put(e4, 4);
//		mp.put(e5, 5);
//		
//		Set<Employee> keys = mp.keySet();
//		for (Employee i : keys) {
//			System.out.println(i +" and the value is "+mp.get(i));
//		}
		
		
		// SET
		
		Set<Employee> s1 = new TreeSet<Employee>();
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		s1.add(e5);
		
		for(Employee  e : s1) {
			System.out.println(e);
		}
		
	}

}
