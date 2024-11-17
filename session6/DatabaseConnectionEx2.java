package ir.isc.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectionEx2 {
	
	// JDBC URL, username and password of H2 server
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/dbtest";
	private static final String USER = "sa"; // Default username
	private static final String PASSWORD = ""; // Default password (empty)

	public static void main(String[] args) {
		// Declare the connection and statement object
		String countryid = "US";

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			 PreparedStatement preparedstatement = connection.prepareStatement(
					 "select * from departments d join locations l on d.location_id = l.location_id where l.country_id = ?")
					 
			  )	{
				
					System.out.println("DB Connected!");
					preparedstatement.setString(1, countryid);
					
		try (ResultSet resultset = preparedstatement.executeQuery())
		{
			while (resultset.next()) {
				String dep = resultset.getString("DEPARTMENT_NAME");
				String country = resultset.getString("COUNTRY_ID");
				System.out.println("Department Name: "+ dep + " | Country: "+ country);
				
			}
		
		}
		

		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

