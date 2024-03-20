package com.bs18;

public class OuterClass 
{
	int b=123;
	 void display() {
		
	
}
		public static void main(String[] args) {
			
		System.out.println("Outer class output");
		System.out.println(new OuterClass().b);
		
		
		
		}
}
/**package com.bs18;

public class OuterClass 
{
    int b = 123;

    private class InnerClass
    {
        int b2 = 10;
    }

    public static void main(String[] args) {
        System.out.println("Outer class output");
        System.out.println(new OuterClass().b);

        // Create an instance of OuterClass to access InnerClass
        OuterClass outer = new OuterClass();
        InnerClass inner = outer.new InnerClass();
        System.out.println(inner.b2);
    }
}

 * 
 * 
 */


