package cpm.pattern;

public class LeftAgleTriangle {

	private static void pattern1() 
	{
		int rows = 5;
        int columns = 5;

        // Pattern loop
        for (int i = 0; i < rows; i++) { // Rows
            for (int j = 0; j < 4; j++) {  // Coloumns
                System.out.print("* ");
            }
            System.out.println();
        }

	}
	private static void pattern2() {
		for(int i=0; i<5; i++) 
		{
		 for(int j=0; j<=i; j++)	
		 {
			System.out.print(j+1); 
		 }
		 System.out.println();
		}
	}
	
	private static void pattern3() {

		int n=1;
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(n++);
			}
			System.out.println();
		}
	}
	
	private static void pattern4() {
		for (int i = 0; i <= 5; i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void pattern5() {

		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {

//		pattern1();
//		pattern2();
//		pattern3();
//		pattern4();
		pattern5();
		
	}
}