package com.stack;


public class LinkedListStack {
	
		
		class Node
		{
			Object data;
			Node prev;
			Node(Object data)
			{
				this.data=data;
			}
		}
		
		Node top;
		int size;
		
		public void push(Object data) {
			Node n=new Node(data);
			if(top==null)
				top=n;
			else {
				n.prev=top;
			}
			size++;
			
		}
		public Object pop() {
			if(top==null) {
				System.out.println("Stak over flow..");
				return null;
			}
			Object data=top.data;
			top=top.prev;
			size--;
			return data;
		}
		
		
		public Object peek() {
			if(top==null) {
				System.out.println("satck overflow");
				return null;
			}
			return top.data;
			
					
		}
		
		
		public void display(){
			print(top);
			System.out.println();
		}
		
		
		private void print(Node start) {
			if(start ==null) 
				return ;
				print(start.prev);
				System.out.println(start.data+" ");
			}
		
		public String size() {
			return "The size is : "+size;
		}
		
		public int search(Object data) {
			Node temp=top;
			int  i=0;
			while(temp !=null) {
				i++;
				if(temp.data==data)
					return i;
				temp=temp.prev;
			}
			return 0;
		}


}