package com.jsp.dsprogram;

public class MainClass {
	public static void main(String[] args) {
		
		DoublyLinkedList dl=new DoublyLinkedList();
				dl.add(12);
		dl.add(132);
		dl.add(42);
		dl.add(52);
		dl.add(12);
		dl.add(92);
		dl.addFirst(2);
		
		dl.add(10000, 0);
		dl.display();
System.out.println("===");
		dl.deleteFirst();
		dl.display();
		  
	}

}
