package com.Integer;

public class Valley {
	
	 public static int countingValleys(int steps, String path) {
		    // Write your code here
		        int calculator = 0;
		        int nroValleys = 0;
		        boolean goingUnderSeaLevel = false;
		        
		        char[] chars = path.toCharArray();
		        
		        for(char c : chars) {
		            if(c == 'U') {
		            calculator+=1;
		            }
		            if(c == 'D') {
		                if(calculator <= 0) {
		                    goingUnderSeaLevel = true;
		                }
		                calculator-= 1;
		            }
		            if(calculator == 0 && goingUnderSeaLevel) {
		                nroValleys++;
		                goingUnderSeaLevel = false;
		            }
		        }
		        
		        return nroValleys;

		    }
	
	public static void main(String[] args) {
		
		int steps = 8;
		String path = "DDUUUUDD";
		int countingValleys = countingValleys(steps, path);
		System.out.println(countingValleys);
	}

}
