package com.jsp.filehandling;

import java.io.Serializable;

public class Student implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//	private static final long seri
	private int id;
	private String name;
	private double per;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	
}
