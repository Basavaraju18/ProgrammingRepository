package com.globus;


	import java.util.Scanner;
	public class SalesmanDistance {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			double totalDistance = 0;
			String line = scanner.nextLine();
			
			// Extract the X and Y coordinates from the input
			double prevX = getXCoordinate(line);
			double prevY = getYCoordinate(line);
			
			do {
				line = scanner.nextLine();
				// Extract the X and Y coordinates from the input line
				
				double x = getXCoordinate(line);
				double y = getYCoordinate(line);
				
				// Calculate the distance traveled from the previous point to the current point
				
				double distance = calculateDistance(prevX, prevY, x, y);
				
				// Update the total distance traveled
				totalDistance += distance;
				// Print the total distance traveled up to this point

				System.out.printf("The salesman has traveled a total of %.3f kilometers.%n", totalDistance);
				// Update the previous coordinates for the next
//				iteration
						
				prevX = x;
				prevY = y;
			}
			while(scanner.hasNext());
			scanner.close();
		}
		// Helper function to extract the X coordinate from the input line
		private static double getXCoordinate(String line) {
			int startIndex = line.indexOf('(') + 1;
			int commaIndex = line.indexOf(',');
			return Double.parseDouble(line.substring(startIndex,
					commaIndex).trim());
		}
		// Helper function to extract the Y coordinate from the input line
				
		private static double getYCoordinate(String line) {
			
			int commaIndex = line.indexOf(',');
			
			int endIndex = line.indexOf(')');
			
			return Double.parseDouble(line.substring(commaIndex +1, endIndex).trim());
		}
		// Helper function to calculate the distance between two points in a Cartesian plane

		private static double calculateDistance(double x1, double y1, double x2, double y2) {
			double dx = x2 - x1;
			
			double dy = y2 - y1;

			return Math.sqrt(dx * dx + dy * dy);
		}
	}


