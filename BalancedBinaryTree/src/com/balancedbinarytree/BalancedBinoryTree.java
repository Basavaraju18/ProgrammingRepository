package com.balancedbinarytree;

public class BalancedBinoryTree {
	
	class Node{
		int data;
		Node right;
		Node left;
		Node(int data)
		{
			this.data=data;
		}
	}
	Node root;
	
	public void add(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
			return;
		}
		add(root, n);	
		}
	void add(Node rt, Node n) {
		if(n.data>rt.data) {
			if(rt.right!=null)
				add(rt.right,n);
			else {
				rt.right=n;
			}
			
			}else {
				if(rt.left!=null)
					add(rt.left,n);
				else
					rt.left=n;
		}
	}
	
	public void displayI()
	{
		inOrder(root);
	}
	private void inOrder(Node rt) {
		
		if(rt==null)
			return;
		inOrder(rt.left);
		System.out.println(rt.data+" ");
		inOrder(rt.right);
	}
	
	public void displayPs()
	{
		postOrder(root);
	}
	private void postOrder(Node rt) {
	
		if(rt==null)
			return;
		postOrder(rt.left);
		postOrder(rt.right);
		System.out.println(rt.data+" ");
	}
	
	public void displayPr()
	{
		preOrder(root);
	}
	private void preOrder(Node rt) {
		if(rt==null)
			return;
		System.out.println(rt.data+" ");
		preOrder(rt.left);
		preOrder(rt.right);
	}

		
		
	}


