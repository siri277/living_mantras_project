package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.UserOperations;
import validation.AdminLoginValidation;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		AdminLoginValidation adminloginvalidation = new AdminLoginValidation();
		UserOperations useroperations = new UserOperations();
		byte choice ;
		System.out.println("#============================================#");
		System.out.println("<<<---   Welcome to Living Mantras  --->>>");
		System.out.println("#============================================#");
		System.out.println("\t <<<---   Select Option  --->>>");
		do {
			System.out.println("\t\t 1. Admin \n\t\t 2. User \n\t\t 3. Exit ");
			System.out.print("\t\t Enter Your Choice :");
			choice = Byte.parseByte(br.readLine());
			System.out.println("\n");
		switch (choice){
//case 1 for admin validation and operations
		case 1: 
			adminloginvalidation.validation();
			System.out.println("\t <<<---   Select Option  --->>>");
			break;
//case 2 for user validation and operations
		case 2:
			do {	
				System.out.println("\t <<<---   Select Option  --->>>");
				System.out.println("\t\t 1. Login \n\t\t 2. Register \n\t\t 3. Exit ");
				System.out.print("\t\t Enter Your Choice :");
				choice = Byte.parseByte(br.readLine());
				System.out.println("\n");
				switch(choice) {
				case 1:
					useroperations.login();
					break;
				case 2: 
					useroperations.register();
					break;
				case 3:
					System.out.println("#============================================#");
					System.out.println("\t\t  THANK YOU ");
					return;	
				default:System.out.println("\t  Please select a valid option ");
				}
				}while(true);
//case 3 for exit
		case 3:
			System.out.println("#============================================#");
			System.out.println("\t\t  THANK YOU ");
			return;	
		default:System.out.println("\t  Please select a valid option ");
		}
		}while(true);
	}
}
