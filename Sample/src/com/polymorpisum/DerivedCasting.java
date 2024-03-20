/** Derived Casting= Converting one object type reference  
	UpCasting= creating object of subclass and storing its address into the reference of super class
 	DownCasting=  converting super class reference back to subclass reference is called as down casting for this upcasting is 
	mandatory  upcasting is mandatory because we need super class reference variable
	*/
	
package com.polymorpisum;

	class CentralGovt{
		int a=10;
		public void rules() {

			System.out.println("Cnetral Govt Rules!");
		}
		
	}
	
	class StateGovt extends CentralGovt{
		int b=20;
		 @Override
		public void rules() {
			System.out.println("State  govt Rruls!");
		}
		 
		public void downCastingProperty() {
			 System.out.println("DownCasting peoperties");
		}
	}

public class DerivedCasting {

	public static void main(String[] args) {
		
		CentralGovt c=new StateGovt();  // upcasting 
		System.out.println(c.a);  // hear i am able to access onely super class properties 
		c.rules(); // central govt 
//		System.out.println(c.b);	//  hear i am unable to access both  super class properties  its not allowing
									// using subclass object i am not able to access onely one 
		
//		=====================DOWN CASTING===============================
		StateGovt s=(StateGovt)c;      // downCasting
		s.rules();  // hear you can see i am accessing both class properties using 	
		s.downCastingProperty();
			
		System.out.println(s.b);
		System.out.println(s.a);

		
//		CentralGovt s1=new CentralGovt();
//		s1.rules();
	}
}
