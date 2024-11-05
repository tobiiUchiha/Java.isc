package ir.isc.training1;

public class FirstSession {

	public static void main(String[] args) {
		printMatrix(12);
		
	public static void printMatrix(int n) {
		
	     int rows = n;
	     int columns = n;
	 
	     int[][] array = new int[n][n];
	 
		for (int i = 0; i < rows; i++) {
			 for (int j = 0; j < columns; j++) {
				 System.out.print((int)(Math.random() * 2));
			}
			 System.out.println();
		}
	}
}
