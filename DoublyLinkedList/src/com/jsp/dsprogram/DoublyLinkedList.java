package com.jsp.dsprogram;

public class DoublyLinkedList {

	class Node
	{
		Object data;
		Node next;
		Node prev;
		Node(Object data){
			this.data=data;
		}
	}

	Node head;
	Node tail;

	public void add(Object data) {
		Node n=new Node(data);
		if(head==null)
		{
			head=tail=n;
			return;

		}

		n.prev=tail;
		tail.next=n;
		tail=n;
	}

	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"<=>");
			temp=temp.next;
		}
	}

	public void addFirst(Object data) {
		Node n=new Node(data);
		if (head==null) {
			head=tail=n;
			return;
		}
		n.next=head;
		head.prev=n;
		head=n;
	}

	public void add(Object data, int in) {
		if(in==0) {
			addFirst(data);
			return;
		}
		Node temp=head;
		while(in>1 && temp!=null) {
			in--;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Index not in the range");
		}
		else {
			Node n=new Node(data); 
			n.next=temp.next;
			n.prev=temp;
			temp.next=n;
			if(n.next!=null) {
				n.next.prev=n;
			}
			else {
				tail=n;
			}
		}
	}

	public Object deleteFirst() {
		if(head==null) {
			throw new UnsupportedOperationException("List is empty");
		}
		Object data=head.data;
		head=head.next;
		if(head!=null) {
			head.prev=null;
		}

		else {
			tail=null;
		}
		return data;

	}
	

	public Object deleteLast() {
		if (head == null)
			throw new UnsupportedOperationException();
		Object data = tail.data;
		if (tail != null) {

			tail = tail.prev;
			tail.next = null;

		} else {
			head = null;
		}
		return data;

	}

	public void reversePrint() {
		reverse(head);

	}

	void reverse(Node start) {
		if (start.next != null) {
			reverse(start.next);
			System.out.println(start.data + " ");
		}
	}

	public void addAtIndex(Object data, int index) {
		if (index == 0) {
			addFirst(data);
			return;
		}
		Node temp = head;
		while (index > 1 && temp != null) {
			index--;
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Index Out Of Range");
		} else {
			Node n = new Node(data);
			n.next = temp.next;
			n.prev = temp;
			temp.next = n;
			if (n.next != null) {
				n.next.prev = n;
			}
			tail = n;
		}

	}

	public void deleteAtIndex(int index) {
		if (index == 0) {
			deleteFirst();
		return;
		}
		Node temp=head;
		while(index>0 && temp!=null) {
			index--;
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("Index Out Of Range");
			
		}else {
			temp.prev.next=temp.next;
			if(temp.next!=null)
			temp.next.prev=temp.prev;
			
		}}
		
		public boolean search(Object data) {
			
			if(head==null)
				return false;
			
		
			Node temp=head;
			while(temp!=null) {
				if(temp.data==data) {
					return true;
				}
				temp=temp.next;
				
			}
			return false;
		}
		
		public Object getData(int index) {
			if(head==null)
				return null;
			Node temp=head;
			while(index>0 && temp!=null) {
				index--;
				temp=temp.next;
			}if(temp==null) {
				System.out.println("out of range");
				return null;
			}
			Object data=temp.data;
			return data;
			
		}
	}	
		
	

























