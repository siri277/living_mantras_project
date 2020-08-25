package dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.CreateUserPojo;
import model.DeletePojo;
import model.UpdatePojo;
import utility.ConnectionManager;

public class CrudDAO {
//method to create userdetails
	public void CreateUser(CreateUserPojo createuserpojo) throws ClassNotFoundException, SQLException, IOException {
		String name = createuserpojo.getName();
		String email = createuserpojo.getEmail();
		String password = createuserpojo.getPassword();
    	//create the details into database
		String sql = "INSERT INTO REGISTER(NAME,EMAIL,PASSWORD)VALUES(?,?,?)";
		//create statement object
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, name);
		st.setString(2, email);
		st.setString(3, password);
		int temp = st.executeUpdate();
		if(temp > 0) {
			System.out.println("\t   Registered Successfully");
		}
		else {
			System.out.println("Error while Registering UserDetails");
		}
	}
	
//method to retrieve userdetails
	public void RetrieveUser() throws ClassNotFoundException, SQLException, IOException {
    	//Retrive the details from database
		String sql = "SELECT * FROM REGISTER";
		//create statement object
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println("\t"+ rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
		}	
		System.out.println("\n");
	}
	
//method to update userdetails
	public void updateUser(UpdatePojo updatepojo) throws ClassNotFoundException, SQLException, IOException {
		String name = updatepojo.getName();
		String email = updatepojo.getEmail();
		String password = updatepojo.getPassword();
		//update the details into database
		String sql ="update register set email = ?,password = ? where name = ?";
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, email);
		st.setString(2, password);
		st.setString(3, name);
		int temp = st.executeUpdate();
		if(temp > 0) {
			System.out.println("\t\tUpdated Successfully");
		}
		else {
			System.out.println("Error while Updating UserDetails");
		}
	}
	
//method to delete userdetails
	public void deleteUser(DeletePojo deletepojo) throws ClassNotFoundException, SQLException, IOException {
		String name = deletepojo.getName();		
    	//delete the details from database
		String sql = "DELETE FROM REGISTER WHERE NAME=?";
		//create statement object
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1, name);
		int temp = st.executeUpdate();
		if(temp > 0) {
			System.out.println("\t\tDeleted Successfully");
		}
		else {
			System.out.println("Error while Deleting UserDetails");
		}
	}
}
