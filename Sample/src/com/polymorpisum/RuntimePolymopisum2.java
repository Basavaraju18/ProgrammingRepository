package com.polymorpisum;

class Office{
	public void work() {
		System.out.println("work in progress");
	}
}

class Tester extends Office{
	@Override
	public void work() {
		System.out.println("Tester is working");
	}
}

class Developer extends Office{
	@Override
	public void work() {
		System.out.println("Developer is working");
	}
}

public class RuntimePolymopisum2 {
	
	public static void invokeWork(Office off) {
		off.work();
	}
	public static void main(String[] args) {
		 invokeWork(new Tester());
		 invokeWork(new Developer());
		 
//		 System.out.println("===========================");
//		 
//		 Tester t=new Tester();
//		 invokeWork(t);
//		 
//		 Developer d=new Developer();
//		 invokeWork(d);
	}

}
