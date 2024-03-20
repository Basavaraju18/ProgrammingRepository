package com.nonstaticinnseclass;

public class OutsideNonStaticClass {

	public static void main(String[] args) {
		System.out.println(NonStaticInnerClass.DescComparator.a);
		System.out.println(new NonStaticInnerClass().new DescComparator().b);
	}
}
