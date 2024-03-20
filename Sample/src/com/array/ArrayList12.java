package com.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayList12 {

	private void arrayList() {
		Scanner ip = new Scanner(System.in);
		ArrayList al= new ArrayList();
		System.out.println("Enter the size of ArrayList");
		int size=ip.nextInt();
		
		System.out.println("Enter the array elements");
		for(int i=0; i<size; i++) {
			String num=ip.next();
				al.add(num);
		}
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}	

	}
	
	private static void linkedlist() {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the size of the list");
		int size=ip.nextInt();
		
		List ll= new LinkedList<>();
		for(int i=0; i<size; i++) {
			int num=ip.nextInt();
			ll.add(num);
		}
		
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}

	}
	
	
	public static void main(String[] args) {
		linkedlist();
		
	}
}
// wjp to store employee objects inside the linkedlist and traverse using ofr each loop where in each employee will hava id and name as atributes