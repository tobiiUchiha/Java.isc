package model;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class AccountWritePrettyPrint {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Account acc1 = new Account();
		acc1.setName("Mohammad Modaresi");
		acc1.setBalance(660000);
		acc1.setTransaction(null);
		
		ObjectMapper objmapper = new ObjectMapper();
		objmapper.writerWithDefaultPrettyPrinter().writeValue(new File("M.Modaresi.json") , acc1);
	}
	

}
