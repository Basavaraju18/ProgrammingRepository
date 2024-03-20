package com.bs18;

class Adress {

	private	String Distric="Bengaluru";
	private	String State="Karnataka";
	private	String Country="India";

	public String getDistric() {
		return Distric;
	}
	public void setDistric(String distric) {
		this.Country = distric;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	@Override
	public String toString() {
		return  "Adress [ Distict = "+Distric +" State = "+State+" Country = "+Country + "]";
	}

}


public class  MainClassAdress1 {

	public static void main(String[] args) {
		
		Adress ad = new Adress();
	System.out.println(ad.getDistric());
	System.out.println(ad.getState());
	System.out.println(ad.getCountry());
	ad.setCountry("UK");
	System.out.println(ad.getCountry());

//	ad.setCountry("UK");
//	System.out.println(ad.getCountry());
//	ad.setState("brisbane");
//
//	System.out.println(ad.getState());
	
	
	}

}