package ir.isc.training1;



public class DatabaseConnection {
    private static DatabaseConnection instance;
	private String connectionString;


    private DatabaseConnection() {
        // Initialize the database connection
       
         connectionString = "jdbc:mysql://localhost:3306/mydatabase";
      
        }
    

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void getConnection() {
        System.out.println("connecting to " + connectionString);
    }

  
}
