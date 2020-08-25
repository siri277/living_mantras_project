package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.LoginPojo;
import utility.ConnectionManager;

public class LoginDAO {
//method to validate userlogin details
	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException, IOException {
		String email = loginpojo.getEmail();
		String password = loginpojo.getPassword();
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs =st.executeQuery("SELECT * from REGISTER");
		while(rs.next())
		{
			if(email.equals(rs.getString("EMAIL")) && password.equals(rs.getString("PASSWORD"))) {
				ConnectionManager.getConnection().close();
				return true;
			}
		}
		return false;
	}
}
