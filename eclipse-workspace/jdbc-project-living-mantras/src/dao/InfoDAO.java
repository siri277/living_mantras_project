package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.CreateInfoPojo;
import model.RetrieveInfoPojo;
import utility.ConnectionManager;

public class InfoDAO {
//method to create info
	public void CreateInfo(CreateInfoPojo createinfopojo) throws ClassNotFoundException, SQLException, IOException {
		String category = createinfopojo.getCategory();
		String description = createinfopojo.getDescription();
    	//creating the info into database
		System.out.println(category+" -- "+description);
		String sql = "insert into livingmantras(category,description)values(?,?)";
		//create statement object
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, category);
		st.setString(2, description);
		int temp = st.executeUpdate();
		if(temp > 0) {
			System.out.println("\t\tCreated Successfully");
		}
		else {
			System.out.println("Error while Creating Info");
		}	
	}
	
//method to retrieve info
	public void RetrieveInfo(RetrieveInfoPojo retrieveinfopojo) throws ClassNotFoundException, SQLException, IOException {			
		String category = retrieveinfopojo.getCategory();
		//Retrive the info from database
		try {
			String sql = "SELECT * FROM LIVINGMANTRAS ";
			//create statement object
			Statement st = ConnectionManager.getConnection().createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next())
			{
				if(category.equals(rs.getString("CATEGORY"))) {
					System.out.println(  rs.getString(2));
				}
			}
			System.out.println("\n");
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
//method to delete info
	public void DeleteInfo(CreateInfoPojo createinfopojo) throws ClassNotFoundException, SQLException, IOException {
		String category = createinfopojo.getCategory();	
		String description = createinfopojo.getDescription();
    	//delete the info from database
		System.out.println(category+" -- "+description);
		String sql = "DELETE FROM LIVINGMANTRAS WHERE CATEGORY=? AND DESCRIPTION=?";
		//create statement object
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, category);
		st.setString(2, description);
		int temp = st.executeUpdate();	
		if(temp > 0) {
			System.out.println("\t\tDeleted Successfully");
		}
		else {
			System.out.println("Error while Deleting Info");
		}
	}
}
