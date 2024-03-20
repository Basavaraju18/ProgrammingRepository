package com.uday;

 abstract class BankAccount {

	abstract void transaction();
}
 
  class Atm extends BankAccount{

	@Override
	void transaction() {
		System.out.println("Object of ATM");
		
	}
	  
  }
  
  class Web extends BankAccount{

	@Override
	void transaction() {
		System.out.println("Object of Web");
	}
	
  } 
  
  class Transaction{
	  BankAccount b1;
	  public  BankAccount createObject(int atmpin) {
		  if(atmpin == 1234) {
			  b1=new Atm();
			  System.out.println("Object of atm is created");
		  }
		  
		  else {
			  b1=new Web();
			  System.out.println("Object of web is created");
			  
		  }
		  return b1;
	  }
  }
  
  public class Abstraction{
	  
	  public static void main(String[] args) {
		
		  Transaction t1 = new Transaction();
		  
		  BankAccount b1=t1.createObject(1234);
			  b1.transaction();
		  
			  BankAccount b2=t1.createObject(0000);
			  b2.transaction();
		  
		  
	}
  }
  
  
  
