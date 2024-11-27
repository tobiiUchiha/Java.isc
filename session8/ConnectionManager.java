package jsonproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

/**
 * singleton pattern for connecting to db
 * @author Modaresi
 */
public class ConnectionManager implements DatabaseInfo{
	private static final Logger log = Logger.getLogger(ConnectionManager.class.getName());
	private static Connection connection;
	
	private ConnectionManager() {
		}
	
	public static Connection getConnection() {
		if (connection == null) {
			try{
				 connection = DriverManager.getConnection(URL,USER,PASSWORD);
			}
			catch (SQLException e) {
				log.severe("db connection error");
				e.printStackTrace();
			}
			}
		return connection;
		}
		
}
