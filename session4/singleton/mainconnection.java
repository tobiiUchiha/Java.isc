package ir.isc.training1;

public class mainconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseConnection first = DatabaseConnection.getInstance();
		first.getConnection();
		DatabaseConnection second = DatabaseConnection.getInstance();
		System.out.println(first == second); //true
		
		
		nonsingleton third = new nonsingleton();
		nonsingleton forth = new nonsingleton();
	
		
	}

}
