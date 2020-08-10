package validation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	@SuppressWarnings("resource")
	public String Email(){
		System.out.println("User Id : ");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		if(isvalidEmail(email)) {
			return email;
		}
		else {
			System.out.println("\tPlease Enter Valid UserId");
			return Email();
		}
	}
	public static boolean isvalidEmail(String email) {
		String emailRegex ="^[A-Za-z0-9+_.]+@(.+)$";
	//Accepts uppercase,lowercase and(0-9)digits & additionally dot,underscore
		Pattern pattern = Pattern.compile(emailRegex);
		if(email == null) 
			return false;
		return pattern.matcher(email).matches();
	}
}
