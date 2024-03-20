package com.bas.clonemethod;

public class StudentClone implements Cloneable {
	
	String name;
	int age;
	public StudentClone(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "StudentClone [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
