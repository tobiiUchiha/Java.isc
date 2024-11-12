package ir.isc.training1;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class MainSerial {

	public static void main(String[] args) {
		
		
		User user1 = new User(Arrays.asList("user1","user2","user3"), "reza", "123456", "25");
		
		try (FileOutputStream fileout = new FileOutputStream("users.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout)) {
				out.writeObject(user1);
			}
		
		 catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
