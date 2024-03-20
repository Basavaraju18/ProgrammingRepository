package com.staticinnerclass;

public class OutSideStaticClass {
	public static void main(String[] args) {
		
		StaticInnerClass.DescComparator des=new  StaticInnerClass.DescComparator();
		System.out.println(StaticInnerClass.DescComparator.a);
		System.out.println(new StaticInnerClass.DescComparator().b);
		
	}

}
