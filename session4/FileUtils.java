package ir.isc.training1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	
	public static void readFile(String filepath) throws FileUtilsException {

		
		  try (BufferedReader reader = new BufferedReader(new FileReader(filepath))){	           
	            String line;
	            while ((line = reader.readLine()) != null) {
	                System.out.println(line); 
	            }
	            
	        } catch (FileNotFoundException e) { 
	            throw new FileUtilsException("File doesn't exist!: ");
	        } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	    }
	
	
	public static void writeFile(String data, String filepath) throws FileUtilsException {
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
			writer.write(data);
			System.out.println("File is created successfully with the content.");
			
		} catch (FileNotFoundException e) {
			throw new FileUtilsException("Specified file path can not be found: ");
		}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		
}
}
