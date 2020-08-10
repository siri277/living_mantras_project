package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import dao.UserOperations;
import validation.Validation;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		UserOperations uo = new UserOperations();
		Validation v = new Validation();
		byte choice ;
		System.out.println("#============================================#");
		System.out.println("<<<---   Welcome to Living Mantras  --->>>");
		System.out.println("#============================================#");
		do {
		System.out.println("\t\t 1. Admin");
		System.out.println("\t\t 2. User");
		System.out.println("\t\t 3. Exit");
		System.out.print("\t\t Enter Your Choice :");
		choice = Byte.parseByte(br.readLine());
		System.out.println("\n");
		switch (choice){
		case 1: 
			System.out.println("*-----------------------------------------*");
			System.out.println("\t Login With Your Credentials");
			System.out.println("*-----------------------------------------*");
			v.validation();
			System.out.println("\t <<<---   Select type  --->>>");
			break;
//main choice case 1 end
		case 2:
			byte option;
			do {	
			System.out.println("\t <<<---   Select type  --->>>");
			System.out.println("\t\t 1. Login ");
			System.out.println("\t\t 2. Sign Up ");
			System.out.println("\t\t 3. Exit");
			System.out.print("\t\t Enter Your Choice :");
			option = Byte.parseByte(br.readLine());
			System.out.println("\n");

			switch(option) {
			case 1:
				uo.login();
				break;
			case 2: 
				uo.signUp(); 
				System.out.println("\t\tSignup Successful");
				System.out.println("*-------------------------------------------*");
				System.out.println("\t   Login With Your Credentials");
				System.out.println("\n");
				uo.login();
				break;
			case 3:
				System.out.println("#============================================#");
				System.out.println("\t\t  THANK YOU ");
				return;	
			default:System.out.println("\t  Please select a valid option ");
			}
			}while(true);
//main choice case 2 end
		case 3:
			System.out.println("#============================================#");
			System.out.println("\t\t  THANK YOU ");
			return;	
//main choice case 3 end
		default:System.out.println("\t  Please select a valid option ");
		}
		}while(true);
		
	}
}
