package com.uday;


class Father {
	 public void work() {

		 System.out.println("Fatherr is working");
	}
}

class Son extends Father{
	public void play() {

		System.out.println("Son is playing");
	}
}

public class DownCasting {
	
	public static void main(String[] args) {
		
		
		Father f = new Son();
		f.work();
//		Son son = (Son)f;
//		son.work();
//		son.play();
		
		
	}

}
