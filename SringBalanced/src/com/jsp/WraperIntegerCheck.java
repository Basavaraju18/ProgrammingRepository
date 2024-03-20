package com.jsp;

public class WraperIntegerCheck {
	
	public void wraperClass() {
		
		Integer i1 = 98;
		Integer i2 = new Integer(56);
		
		System.out.println(i1.compareTo(i2));  // +1
		System.out.println(i2.compareTo(i1));  // -1
		
		Boolean b1=true;  // +1
		Boolean b2= new Boolean(false);  //-1
		System.out.println(b1.compareTo(b2));  // +1
		System.out.println(b2.compareTo(b1));  // -1
		
		
		System.out.println("================================");
		Character c1 = 'a';  // 97
		Character c2 = new Character('b');  //  98
		System.out.println(c1.compareTo(c2)); 
		System.out.println(c2.compareTo(c1));
		
		System.out.println("=================================");
		short s1 = 12;
		int a1 =s1;
		System.out.println(a1);
	
		int id=10;
		short sd=(short) id;
		System.out.println(sd);
		
		long l1 = 234;
		int ii1 =(int)l1;
		System.out.println(ii1);

	}
	
	private static void StringPalindromeCheck() {
		String s1 = "level";
		StringBuilder s2 = new StringBuilder(s1);
		StringBuilder bRev = s2.reverse();
		String sRev= new String(bRev);
		if(s1.equals(sRev)) {
			System.out.println("String is a Palinderome !!!");
			
		}else {
			System.out.println("String is not a palindreme");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		 StringPalindromeCheck();
		 System.out.println("=========");
		 
	
	}
}
