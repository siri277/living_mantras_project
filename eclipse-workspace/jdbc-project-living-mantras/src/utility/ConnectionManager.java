package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager{
//method to get connection
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Properties prop = null;
		try {
			prop = loadPropertiesFile();
		} 
		catch (Exception e) {
			e.getMessage();
		}
		Class.forName(prop.getProperty("driver"));
		Connection con = null;
		con =DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
		return con;
	}
//method to load propertiesfile
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);in.close();
		return prop; 
	} 	
}
