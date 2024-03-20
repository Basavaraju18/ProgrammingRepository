package cpm.pattern;

class EmptyTriangle {

	private static void demo1() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();

		}
	}

	private static void demo2() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
	}

	private static void helloReactAngle() {
		
		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= 5 ; j++) {
				
				if(i == 1 || i == 5 || j == 1 || j== 5 ) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	private static void leftAngleTriAngle() {

		for (int i = 1; i <= 5; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	private static void rightAngleTriAngle() {

		System.out.println("===========");
		int n =6;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	private static void triangle() {

		System.out.println("===========");
		int n =6;
		for (int i = 1; i <= n; i++) {
			
			for (int j = 1; j <= n-i ; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
	}
	
	private static void karthik() {

		String s1 = "karthik";
		char[] c1= s1.toCharArray();
		int count = 0;
		for (int i = 0; i < c1.length; i++) {
			count=1;
			for (int j = i+1; j < c1.length; j++) {
				if(c1[i] == c1[j] ) {
					count++;
					c1[j]=' ';
				}		
				
			}
			if(c1[i] != ' '  )
				System.out.println(c1[i]+" --> "+ count);
			
		}
	}
	
	public static void main(String[] args) {
//		demo1();
//		demo2();
//		helloReactAngle();
//		leftAngleTriAngle();
//		rightAngleTriAngle();
//		triangle();
		
		karthik();
		
	}
}