package jsp.grooming4pm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Email_Validation {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter the number");
		String email=ip.next();
		Pattern p =  Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$");
		Matcher m=p.matcher(email);
		if(!m.matches()) {
			System.err.println("Invalid email ID Should contain  first 4 to 6 alphabets nad special character then 2 to 4 numarics characters");
			
		}else {
			System.out.println("Email id Enterd successful");
		}
	}
	
}
