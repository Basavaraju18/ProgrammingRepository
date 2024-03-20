package com.balancedbinarytree;

public class MainRunner {

	public static void main(String[] args) {


		BalancedBinoryTree bt=new BalancedBinoryTree();
		bt.add(75);
		bt.add(15);
		bt.add(35);
		bt.add(55);
		bt.add(45);
		bt.add(95);
		bt.add(65);
		
		System.out.println("inorderd display");
		bt.displayI();
		
		System.out.println("PostOrderd display");
		bt.displayPs();
		
		System.out.println("PreOrderd display");
		bt.displayPr();

	}
}
