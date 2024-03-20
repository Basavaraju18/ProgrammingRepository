package cpm.pattern;

public class Line {
	
	private static void m1() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	
	@SuppressWarnings("unused")
	private static void m2() {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i+" "+j);
			}
		}
		
	}
	
	private void nameLines() {

		        int n = 5; // Number of lines

		        for (int i = 0; i < n; i++) {
		            // Print spaces
		            for (int j = 0; j < n - i - 1; j++) {
		                System.out.print("  ");
		            }

		            // Print characters
		            System.out.println((char) ('A' + i));
		        }
	}

	
	
	

	public static void main(String[] args) {
		 m1();
//		m2();
	}
}
