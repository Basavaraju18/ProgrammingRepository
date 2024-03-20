package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RepetedString {
	
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long i=1;
        String infinityString="";
        while(s.length()*i<=n)
        {
            infinityString+=s;
            i++;
        }
        if(s.length()%infinityString.length()==0){
           return countingA(infinityString); 
        }else{
            infinityString+=s.substring(0,(s.length()%infinityString.length())-1);
            return countingA(infinityString); 
        }
    }
    public static long countingA(String infinity)
    {   
        long a=0;
        for(int i=0;i<infinity.length();i++)
        {
            if(infinity.charAt(i)=='a')
            {
                a++;
            }
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
