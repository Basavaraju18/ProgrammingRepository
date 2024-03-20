package com.raghu.stream;

public class StudentInfoDTO {
	
	private int id;
	private String name;
	private Double per;
	private String dept;
	
	public StudentInfoDTO(int id, String name, double per, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
		this.dept = dept;
	}
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
	public Double getPer() {
		return per;
	}
	public void setPer(Double per) {
		this.per = per;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "StudentInfoDTO [id=" + id + ", name=" + name + ", per=" + per + ", dept=" + dept + "]";
	}

}
