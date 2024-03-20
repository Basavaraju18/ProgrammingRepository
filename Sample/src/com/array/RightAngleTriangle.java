//package com.array;
//
//public class RightAngleTriAngle {
//	
//	public static void main(String[] args) {
//		
//		int n=5;
//		
//		for(int i=1; i<=n; i++) 
//		{
//			for(int j=1; j<=n; j++)
//			{
//				if(i == 1 || i==n || j==n || j==1 || i==j )
//					System.out.print("* ");
//				else
//					System.out.print(" ");
//				
//			}
//			System.out.println();
//		}
//	}
//
//}


package com.array;

public class RightAngleTriangle {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if (i == 1 || i == n || j == n || j == 1 || i == j)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
