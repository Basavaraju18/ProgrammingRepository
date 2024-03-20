package com.bs18;

import java.util.Scanner;

public class Swaping_Numbers {

	static Scanner ip=new Scanner(System.in);


	private static final String ans = null;

	static void swap() {

		int s=15;
		s=s>>2;
		int a=10;
		int b=20;

		int temp=b;
		b=a;
		a=temp;
//		System.out.println(temp);

		System.out.println("A value is  :"+a);
		System.out.println("B value is  :"+b);
		System.out.println("S value is  :"+s);
		
	}

	public static void String() {
		String a="Hello";
		int b=10;
		String c=a+b;

		System.out.println(c);
		System.out.println(a+b);
	}

	public static void increment() {

		int z=2, x=3, y=4;

		int  ans=z++ + y-- + x++ + y+ + z++ +x-- ;
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);

	}

	//	 =========================================================



	public static void speedTest() {


		while(true) {
			System.out.println("Enter the speed  (or -1 to exit)");
			int speed=ip.nextInt();
			if(speed==-1) {
				break;
			}

			if(speed>=30 && speed<=60) {
				System.out.println("normal speed Driver");
			} else if (speed>=0 && speed <=29){
				System.out.println("Low speed");
			}else {
				System.out.println(" speed limit is reached");
			}
		} 
	}




	public static void orderFood() {


		while(true) {
			System.out.println("Enter the order number (or -1 to exit)");
			System.out.println("Food List \n1:Idly \n2:Dose \n3:Chithranna");
			int food=ip.nextInt();
			if(food==-1) {  
				break;
			}

			if(food==1) {
				System.out.println("Idly is ready");
			}
			else if(food==2) {
				System.out.println("Dosa is ready");
			}
			else if (food==3) {
				System.out.println("Chittranna is ready");
			}
			else{
				System.out.println("Invalid input/ Plese Enter the valid output");
			}
		}
	}


	public static void university() {
		while(true) {
			System.out.println("Enter the vhioice too take courese (Or -1 to stop)"); 

			int choice=ip.nextInt();
			if(choice==-1) {
				break;
			}
			if(choice==1) {
				System.out.println("you joined Cs");
			}
			else if(choice==2) {
				System.out.println("you joined IS");
			}
			else if(choice==3) {
				System.out.println("you joined EC");
			}
			else {
				System.out.println("Invalid choice");
			}
		}
	}
	

	public static void greatestAmongThreeNumbers() {
		
		while(true) {
		System.out.println("Ente the a value ");;
		int a=ip.nextInt();
		if(a==-1) {
			System.out.println("Program stoped");
			break;
		}
		System.out.println("Ente the b value");;
		int b=ip.nextInt();
		
		System.out.println("Ente the c value");;
		int c=ip.nextInt();
		
		if(a>b && a>c) {
			System.out.println(a+" is the  greastest number in these numbers");
		}
		else if(b>c) {
			System.out.println(b+" is the greastest number in thses numbers");
		}
		else {
			System.out.println(c+" is the greastest number in thses numbers");
			
		}
		System.out.println();
		System.out.println("Do you want to test again? (0 for No or any number for continue):");
		int choice=ip.nextInt();
		if(choice==0) {
			System.out.println("program exited");
			break;
		}
		
				
	}

}
	public static void main(String[] a) {


				swap();
		//		String();
		//		increment();
		//		speedTest();
        //		orderFood();
//				university();
//			 greatestAmongThreeNumbers();
	}

}













