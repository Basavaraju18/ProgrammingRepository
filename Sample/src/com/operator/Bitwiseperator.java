package com.operator;

public class Bitwiseperator {
	
	public static void main(String[] args) {
		
		int a=14&5;               // 14= 1110 &(and operator) 5= 0101==> 0100= 0+4+0+0==output is =4
		System.out.println(a);
		
		int b=14|11;  				//  14= 1 1 1 0 or operator   
		System.out.println(b);      //  11= 1 0 1 1  ==1 1 1 1 =8+4+2+1= out put is 15
		
		int c=12^17;				// inputs are same =0 different 1
		System.out.println(c);  	//12= 01100; 17= 10001 ==> 11101 == 16+8+4+0+1=29
		
	}

}
