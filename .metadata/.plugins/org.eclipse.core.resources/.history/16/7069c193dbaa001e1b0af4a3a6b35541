package com.hackerrank;

public class PasswordDesign {
	
	static int solve(int n, String s) 
    {
        String numbers = "0123456789";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-+";
        
        boolean hasNumber = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasSpecialCharacter = false;
        
        for(char c:s.toCharArray())
        {
            if(numbers.indexOf(c)!=-1)
                hasNumber=true;
            else if(lowerCase.indexOf(c)!=-1)
                hasLowerCase=true;
            else if(upperCase.indexOf(c)!=-1)
                hasUpperCase=true;
            else if(specialCharacters.indexOf(c)!=-1)
                hasSpecialCharacter=true;
        }
        
        int cnt=0;
        if(!hasNumber)
            ++cnt;
        if(!hasLowerCase)
            ++cnt;
        if(!hasUpperCase)
            ++cnt;
        if(!hasSpecialCharacter)
            ++cnt;
        
        if(n+cnt<6)
            cnt+=6-(n+cnt);
        
        return cnt;
    }
    
    public static void main(String[] args) 
    {
    	int l = 4;
    	String s1 = "basa";
    	 
    	int solve = solve(l, s1);
    	System.out.println(solve);
    	
    	
    }   

}
