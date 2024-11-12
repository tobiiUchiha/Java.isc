package ir.isc.training1;

public class main {

	public static void main(String[] args) {
		
		try {
			FileUtils.writeFile("Some data to write!!", "test1.txt");
		} catch (FileUtilsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		try {
			FileUtils.readFile("test1.txt");
		} catch (FileUtilsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			FileUtils.readFile("nonexist.txt");
		} catch (FileUtilsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileUtils.writeFile("Some data into nonexist file!!", "A:\\.txt");
		} catch (FileUtilsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
