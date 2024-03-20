package com.Day4;

import java.nio.channels.UnsupportedAddressTypeException;

public class SinglyLinkedList {

	class Node {
		Object data;
		Node next;

		Node(Object data) {
			this.data = data;

		}

	}

	Node head;
	Node tail;

	public void add(Object data) {
		Node n = new Node(data);
		System.out.println();

		if (head == null) {
			head = tail = n;

		} else {

			tail.next = n;
			tail = n;

		}
	}

	public void addFirst(Object data) {
		Node n = new Node(data);
		if (head == null) {
			head = tail = n;
		} else {
			n.next = head;
			head = n;

		}
	}

	public void displayAll() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}

	}

	public Object deleteFirst() {
		if (head == null)
			throw new NullPointerException();
		Object ele = head.data;
		head = head.next;
		if (head == null) {
			tail = null;
		}
		return ele;
	}

	public Object deleteLast() {
		if (head == null)
			throw new NullPointerException();
		Object ele = tail.data;
		Node temp = head;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		tail = prev;
		if (prev != null)
			prev.next = null;
		return ele;

	}
	public boolean  addAtIndex(int index,Object data) {
		Node n=new Node(data);
		if(head==null && index==0) {
			head=tail=n;
			return true;
		}else {
			Node temp=head;
			while(temp.next!=null) {
				tail.next=n;

				tail=n;

			}

		}

		return false;

	}

	public void add(Object data, int in) {
		if(in==0) {
			addFirst(data);
			return ;

		}
		Node temp=head;
		while(temp!=null && in>1){
			temp=temp.next;
			in--;
		}
		if(temp!=null) {
			Node n=new Node(data);
			n.next=temp.next;
			temp.next=n;
			if(n.next==null)
				tail=n;
		}
		else {
			System.out.println(" index not in the range");
		}
	}
	
	public Object delete(int in) {
		if(in==0)
		return deleteFirst();
		
		Node temp=head;
		Node prev=null;
		while(temp!=null && in>0) {
			prev =temp;
			in--;  //0
			temp=temp.next;
		}
		if(temp!=null) {
			prev.next=temp.next;
			if(temp.next==null)
				tail=prev;
			return temp.data;
		}
		else {
			System.out.println("Indext not inn range");
			return null;

		}

	}
	public void printReverse() {
		reverse(head);
	}
	
	private void reverse(Node start) {
		if(start.next!=null) 
			reverse(start.next);
		System.out.print(start.data+" <-");
	}
	
	
}

















