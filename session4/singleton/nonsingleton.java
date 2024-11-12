package ir.isc.training1;

public class nonsingleton {
	
	private String connectionString;


	    public  nonsingleton() {
	         connectionString = "jdbc:mysql://localhost:3306/mydatabase";
	      
	        }
	    

	    public void getConnection() {
	        System.out.println("connecting to " + connectionString);
	    }


}
