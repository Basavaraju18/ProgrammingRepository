package com.bs18;

public class ShortClass {
	 String color = null;
	public ShortClass(String color) {
		this.color=color;
	}
	public static void main(String[] args) {
		
		ShortClass s=new ShortClass("Red");
		System.out.println(s.color);
		
		System.out.println("=======short=======");
		short x =10;
		x= (short) (x*5);
		System.out.println(x);
		System.out.println("=======byte========");
		byte b=10;
		b=(byte) (b*10);
		System.out.println(b);
		System.out.println("=====byte range======");
		byte b1=127; // its range is from -128 to 127
		short s1=32767; // -32768 to 32767
		System.out.println(b1);
		System.out.println(s1);
		
		
	}

}
