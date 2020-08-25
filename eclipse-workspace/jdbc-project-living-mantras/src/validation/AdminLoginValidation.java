package validation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

import dao.CrudDAO;
import dao.InfoDAO;
import dao.InfoOperations;
import dao.UserOperations;

public class AdminLoginValidation {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	CrudDAO cruddao = new CrudDAO();
	InfoDAO infodao = new InfoDAO();
	UserOperations useroperations = new UserOperations();
	InfoOperations infooperations = new InfoOperations();
	
//method to validate admin
	public void validation() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("*-----------------------------------------*");
		System.out.println("\t Login With Your Credentials");
		System.out.println("*-----------------------------------------*");
		System.out.println("Enter your User Id : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();
		System.out.println("Enter your Password : ");
		String password = sc.nextLine();
		if("Siri@gmail.com".equals(email) && "siri".equals(password)) 
		{
			System.out.println("\t\t Login Successful");
			System.out.println("\n");
			byte choice ;
			System.out.println("\t <<<---   Select Option  --->>>");
			System.out.println("\t\t1. Manage UserDetails \n\t\t2. Manage Information \n\t\t3. Exit");
			System.out.print("\t\t Enter Your Choice :");
			choice = Byte.parseByte(br.readLine());
			System.out.println("\n");
			switch(choice) {
  //case 1 is to manage userdetails
			case 1:
				do {
					System.out.println("\t <<<---   Select Option  --->>>");
					System.out.println("\t\t1. Retrieve UserDetails \n\t\t2. Update UserDetails \n\t\t3. Delete UserDetails \n\t\t4. Exit ");
					System.out.print("\t\t Enter Your Choice :");
					choice = Byte.parseByte(br.readLine());
					System.out.println("\n");
					switch(choice) {
					case 1:
						cruddao.RetrieveUser();
						break;
					case 2:
						useroperations.updateUser();
						break;
					case 3:
						useroperations.deleteUser();
						break;
					case 4:return;
					default:System.out.println("\t  Please select a valid option ");	
					}
				}while(true);
  //case 2 is to manage information
			case 2:
				do {
					System.out.println("\t <<<---   Select Option  --->>>");
					System.out.println("\t\t1. Create Info \n\t\t2. Retrieve Info \n\t\t3. Delete Info \n\t\t4. Exit ");
					System.out.print("\t\t Enter Your Choice :");
					choice = Byte.parseByte(br.readLine());
					System.out.println("\n");
					switch(choice) {
					case 1:
						infooperations.createinfo();break;
					case 2:
						infooperations.retrieveinfo();break;
					case 3:
						infooperations.deleteinfo();break;
					case 4:return;
					default:System.out.println("\t  Please select a valid option ");		
					}
				}while(true);
			case 3:return;
			default:System.out.println("\t  Please select a valid option ");	
			}
		}
		else
		{
			System.out.println("\t Invalid UserId or Password \n\t\t Try Again \n");
		}
	}
}
	