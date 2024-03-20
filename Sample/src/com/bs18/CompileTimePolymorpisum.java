package com.bs18;

class PayingBill{
	public void  payBill() {
		System.out.println("Bill paying ");
	}
}

class GooglePay extends PayingBill{
	@Override
	public void  payBill() {
		System.out.println("Bill paying ");
	}
	
	
}

class PhonePay extends PayingBill{
	@Override
	public void  payBill() {
		System.out.println("Bill paying using PhonePay ");
	}
	
}



public class CompileTimePolymorpisum {
	
	public static void main(String[] args) {
		
//		PayingBill bill=new PayingBill();
		PayingBill bill1=new PhonePay();
		PayingBill bill2=new GooglePay();
		bill1.payBill();
		bill2.payBill();
		
	}

}
