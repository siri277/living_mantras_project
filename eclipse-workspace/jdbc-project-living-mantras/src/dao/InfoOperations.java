package dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import model.CreateInfoPojo;
import model.RetrieveInfoPojo;

public class InfoOperations {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	InfoDAO infodao = new InfoDAO();
	RetrieveInfoPojo retrieveinfopojo = new RetrieveInfoPojo();
	
//method to create info
	public void createinfo() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Categories:\tmindfulness \n\t\tspiritual \n\t\tfocused \n\t\tmovement \n\t\tmantra");
		System.out.println("\t\tartofliving \n\t\ttodolist \n\t\tgettinghelp \n\t\thelplines\n\t\tsuppliments\n\t\ttips\n");
		System.out.println("Enter the Category");
		String category = br.readLine();
		System.out.println("Enter the Description");
		String description = br.readLine();
		CreateInfoPojo createinfopojo  = new CreateInfoPojo(category,description);
		infodao.CreateInfo(createinfopojo);
		System.out.println("*-------------------------------------------*");
	}
	
//method to retrieve info
	public void retrieveinfo() throws ClassNotFoundException, SQLException, IOException {
		System.out.println("Categories:\tmindfulness \n\t\tspiritual \n\t\tfocused \n\t\tmovement \n\t\tmantra");
		System.out.println("\t\tartofliving \n\t\ttodolist \n\t\tgettinghelp \n\t\thelplines\n\t\tsuppliments\n\t\ttips\n");
		System.out.println("Enter the Category");
		String category = br.readLine();
		retrieveinfopojo.setCategory(category);
		infodao.RetrieveInfo(retrieveinfopojo);
	}
	
//method to delete info
	public void deleteinfo() throws IOException, ClassNotFoundException, SQLException {
		System.out.println("Categories:\tmindfulness \n\t\tspiritual \n\t\tfocused \n\t\tmovement \n\t\tmantra");
		System.out.println("\t\tartofliving \n\t\ttodolist \n\t\tgettinghelp \n\t\thelplines\n\t\tsuppliments\n\t\ttips\n");
		System.out.println("Enter the Category");
		String category = br.readLine();
		System.out.println("Enter the Description");
		String description = br.readLine();
		CreateInfoPojo createinfopojo =new CreateInfoPojo(category,description);
		infodao.DeleteInfo(createinfopojo);
		System.out.println("*-------------------------------------------*");
	}
}
