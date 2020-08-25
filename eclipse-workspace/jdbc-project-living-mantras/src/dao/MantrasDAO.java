package dao;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;

public class MantrasDAO {
//method to retrieve info for mindfulness meditation
	public void mindfulness() throws IOException, ClassNotFoundException, SQLException {
		System.out.println(" In Mindfulness meditation, ");
		String sql ="select description from livingmantras where category = 'mindfulness'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for spiritual meditation
	public void spiritual() throws IOException, ClassNotFoundException, SQLException {
		System.out.println(" Spiritual meditation, ");
		String sql ="select description from livingmantras where category = 'spiritual'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for focused meditation
	public void focused() throws IOException, ClassNotFoundException, SQLException {
		System.out.println(" Focused meditation, ");
		String sql ="select description from livingmantras where category = 'focused'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for movement meditation
	public void movement() throws IOException, ClassNotFoundException, SQLException {
		System.out.println(" Movement meditation, ");
		String sql ="select description from livingmantras where category = 'movement'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for mantra meditation
	public void mantra() throws IOException, ClassNotFoundException, SQLException {
		System.out.println(" Mantra meditation, ");
		String sql ="select description from livingmantras where category = 'mantra'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for artofliving 
	public void def_art_of_living() throws IOException, ClassNotFoundException, SQLException {
		System.out.println(" ART OF LIVING ");
		String sql ="select description from livingmantras where category = 'artofliving'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for todolist in artofliving
	public void todolist() throws IOException, ClassNotFoundException, SQLException {	
		String sql ="select description from livingmantras where category = 'todolist'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for gettinghelp in healthservices
	public void getting_help() throws IOException, ClassNotFoundException, SQLException {	
		String sql ="select description from livingmantras where category = 'gettinghelp'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for helplines in healthservices
	public void helplines() throws IOException, ClassNotFoundException, SQLException {
		String sql ="select description from livingmantras where category = 'helplines'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for suppliments in healthservices
	public void suppliments() throws IOException, ClassNotFoundException, SQLException {	
		String sql ="select description from livingmantras where category = 'suppliments'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
	
//method to retrieve info for tips
	public void tips() throws ClassNotFoundException, SQLException {
		String sql ="select description from livingmantras where category = 'tips'";
		Statement st = ConnectionManager.getConnection().createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getString("description"));
		}
		System.out.println("\n");
	}
}
