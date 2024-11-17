package ir.isc.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnection {
	
	// JDBC URL, username and password of H2 server
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/dbtest";
	private static final String USER = "sa"; // Default username
	private static final String PASSWORD = ""; // Default password (empty)

	public static void main(String[] args) {
		// Declare the connection and statement object
		String depid = "1";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			 PreparedStatement preparedstatement = connection.prepareStatement(
					 "SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID = ?")
					 
			  )	{
				
					System.out.println("DB Connected!");
					preparedstatement.setString(1, depid);
					
		try (ResultSet resultset = preparedstatement.executeQuery())
		{
			while (resultset.next()) {
				String fname = resultset.getString("FIRST_NAME");
				String lname = resultset.getString("LAST_NAME");
				System.out.println("fname: "+ fname + " lname: "+ lname);
				
			}
		
		}
		

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

