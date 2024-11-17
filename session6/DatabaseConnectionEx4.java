package ir.isc.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectionEx4 {
	
	// JDBC URL, username and password of H2 server
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/dbtest";
	private static final String USER = "sa"; // Default username
	private static final String PASSWORD = ""; // Default password (empty)

	public static void main(String[] args) {
		// Declare the connection and statement object
	

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			 PreparedStatement preparedstatement = connection.prepareStatement(
					 "UPDATE COUNTRIES SET COUNTRY_NAME = ? WHERE COUNTRY_ID = ?");
					
			  )	{
				
					System.out.println("DB Connected!");
					preparedstatement.setString(1, "America");
					preparedstatement.setString(2, "US");
			
					
					int changes = preparedstatement.executeUpdate();
					System.out.println(changes + " row(s) has been changed");
		
			
		
		}
		 catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}


