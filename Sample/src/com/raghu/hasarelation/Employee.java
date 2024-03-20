package com.raghu.hasarelation;

public class Employee 
{
	int eid;
	String ename;
	Adhar adh;  //composition
	Address add;  //aggre01gation
	
	
	public Employee(int eid, String ename, int adhid, Address add) {
		super();
		this.eid = eid;
		this.ename = ename;
		
		this.add = add;
		this.adh = new Adhar(adhid, ename);
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", adh=" + adh + ", add=" + add + "]";
	}
	
	
}
