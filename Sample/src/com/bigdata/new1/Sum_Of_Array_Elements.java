package com.bigdata.new1;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

	class Result {

	    /*
	     * Complete the 'simpleArraySum' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts INTEGER_ARRAY ar as parameter.
	     */

	    public static int simpleArraySum(List<Integer> ar) {
	        // Write your code here
	        int sum = 0;
	        for (int ele : ar) {
	            sum = sum + ele;
	        }
	        return sum;
	    }


	public class Sum_Of_Array_Elements {
	    public static void main(String[] args) throws IOException {
	    	System.out.println("Enter the size of array");
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	        		// new OutputStreamWriter(System.out));

	        
	        int arCount = Integer.parseInt(bufferedReader.readLine().trim());
	        System.out.println("Enter the array elements");

	        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());

	        int result = Result.simpleArraySum(ar);

	        bufferedWriter.write(String.valueOf("The sum of the elements of the array is : "+result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}
}










