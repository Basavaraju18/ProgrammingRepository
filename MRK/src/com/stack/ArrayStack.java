package com.stack;

public class ArrayStack {

	private Object[] obj;
	private int capacity;
	private int top;

	public ArrayStack(int capacity) {
		this.capacity=capacity;
		top=-1;
		obj=new Object[capacity];
	}

	public void push(int data) 
	{
		if(top==capacity-1)
		{
			System.out.println("Satck overflow..");
			return ;
		}
		obj[++top]=data;

	}

	public Object pop() {
		if(top==-1)
		{
			System.out.println("Stack overflow..");
			return null;
		}
		return obj[top--];
	}

	public void display() 
	{
		for(int i=0; i<=top; i++) {
			System.out.print(obj[i]+" ");
		}
		System.out.println();
	}

	
	public int search(Object data) 
	{
		for (int  i=top; i>=0; i--) {
			if(obj[i]==data)
				return top-i+1;
		}
		return 0;
	}



}
