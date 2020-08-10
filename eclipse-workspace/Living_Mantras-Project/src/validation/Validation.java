package validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import dao.UserOperations;

public class Validation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	UserOperations uo = new UserOperations();
	@SuppressWarnings("resource")
	
	public void validation() throws IOException {
		System.out.println("Enter your User Id : ");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		System.out.println("Enter your Password : ");
		Scanner sc1 = new Scanner(System.in);
		String password = sc1.nextLine();
		if("Siri@gmail.com".equals(email) && "siri".equals(password)) {
			System.out.println("\t\tLogin Successful");
			System.out.println("*-----------------------------------------*");
			byte choice;
			do {
				System.out.println("\t <<<---   Select type  --->>>");
				System.out.println("\t\t 1. User Details");
				System.out.println("\t\t 2. Remove User");
				System.out.println("\t\t 3. Exit");
				System.out.print("\t\t Enter Your Choice :");
				choice = Byte.parseByte(br.readLine());
				System.out.println("\n");
				switch (choice){
				case 1:
					uo.userdetails();
					System.out.println("*------------------------------------------------------*");
					break;
				case 2:
					uo.removedetails();
					System.out.println("*------------------------------------------------------*");
					break;
				case 3:
					System.out.println("#============================================#");
					System.out.println("\t\t  THANK YOU ");
					System.out.println("\n");
					return;	
				default:System.out.println("\t  Please select a valid option ");
				}
			}while (true);
		}
		else {
			System.out.println("\tInvalid UserId and Password");
			System.out.println("\t\tTry Again");
			System.out.println("\n");
		}
	}
}

