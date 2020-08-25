package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import controller.Select_Mantras;
import model.CreateUserPojo;
import model.DeletePojo;
import model.LoginPojo;
import model.UpdatePojo;

public class UserOperations {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	CrudDAO cruddao = new CrudDAO();
	LoginDAO logindao = new LoginDAO();
	LoginPojo loginpojo = new LoginPojo();
	Select_Mantras selectmantras = new Select_Mantras();
	
//method to login user
	public void login() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Enter the Email");
		String email = br.readLine();
		System.out.println("Enter the Password");
		String password = br.readLine();
		loginpojo.setEmail(email);
		loginpojo.setPassword(password);
		if(logindao.validate(loginpojo) == true) {
			System.out.println("\t\tLogin Successful");
			selectmantras.choice_of_stress();
		}
		else {
			System.out.println("\t   Incorrect username or password \n");
		}
	}
	
//method for user registration
	public void register() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Enter Your Name");
		String name = br.readLine();
		System.out.println("Enter the Email");
		String email = br.readLine();
		System.out.println("Enter the Password");
		String password = br.readLine();
		CreateUserPojo createuserpojo  = new CreateUserPojo(name,email,password);
		cruddao.CreateUser(createuserpojo);
		System.out.println("*-------------------------------------------*");
		System.out.println("\t   Login With Your Credentials \n");
		login();
	}
	
//method for updating userdetails
	public void updateUser() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Enter User Name");
		String name = br.readLine();
		System.out.println("Enter the Email to Update");
		String email = br.readLine();
		System.out.println("Enter the password to Update");
		String password = br.readLine();
		UpdatePojo updatepojo =new UpdatePojo(name,email,password);
		cruddao.updateUser(updatepojo);
		System.out.println("*-------------------------------------------*");
	}
	
//method for deleting userdetails
	public void deleteUser() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Enter User Name to Delete");
		String name = br.readLine();
		DeletePojo deletepojo =new DeletePojo(name);
		cruddao.deleteUser(deletepojo);
		System.out.println("*-------------------------------------------*");
	}
}
