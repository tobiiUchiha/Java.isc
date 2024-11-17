package ir.isc.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectionEx3 {
	
	// JDBC URL, username and password of H2 server
	private static final String URL = "jdbc:h2:tcp://localhost:9092/~/dbtest";
	private static final String USER = "sa"; // Default username
	private static final String PASSWORD = ""; // Default password (empty)

	public static void main(String[] args) {
		// Declare the connection and statement object
	

		try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			 PreparedStatement preparedstatement = connection.prepareStatement(
					 "INSERT INTO EMPLOYEES (first_name, last_name, email, hire_date, job_id, salary) VALUES(?,?,?,?,?,?)");
					
			  )	{
				
					System.out.println("DB Connected!");
					preparedstatement.setString(1, "Ali");
					preparedstatement.setString(2, "Ahmadi");
					preparedstatement.setString(3, "ahmadi@gmail.com");
					preparedstatement.setString(4, "2015-01-15");
					preparedstatement.setString(5, "2");
					preparedstatement.setString(6, "60000");
					
					
					int changes = preparedstatement.executeUpdate();
					System.out.println(changes + " row(s) has been added");
		
			
		
		}
		 catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}


