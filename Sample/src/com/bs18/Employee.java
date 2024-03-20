package com.bs18;

 class EmployeeSample {
	
	int id;
	String name;
	
	Adress adress;
	
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
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	
}

public class Employee extends EmployeeSample {
	
	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.name = "arun");
		System.out.println(e.id = 101);
		try {
		System.out.println(e.adress.getDistric());
		}catch(NullPointerException excep){
			System.out.println(excep);
		}
			System.out.println(e.getAdress());
	}

}
