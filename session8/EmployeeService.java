package jsonproject;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeService {
	
	private static final Logger log = Logger.getLogger(EmployeeService.class.getName());
	
	/**
	 * reading some list in json format
	 * @param fileName
	 * @return list of employees
	 * @throws EmployeeServiceException
	 */
	

	public static List<Employee> readAllEmployees(String fileName) throws EmployeeServiceException  {
	
		File file = new File(fileName);
		log.info("reading the json file");
		ObjectMapper obj = new ObjectMapper();
		List<Employee> emps;
		try {
			emps = obj.readValue(file, new TypeReference<List<Employee>>() {});
		} 
		 catch (DatabindException e) {
			 log.warning("could not bind data");
			 throw new EmployeeServiceException("data bind error", e);
		} catch (IOException e) {
			log.warning("could not read the file");
			 throw new EmployeeServiceException("file read error", e);
		}
		
		return emps;
	}
	
	
	/**
	 * storing the employee list in db
	 * @param employees
	 * @return 
	 * @throws EmployeeServiceException
	 */

	public static int saveEmployee(List<Employee> employees) throws EmployeeServiceException {
		String sql ="""
    				insert into employees (EMPLOYEE_ID ,FIRST_NAME ,LAST_NAME ,EMAIL ,PHONE_NUMBER , SALARY, job_id, hire_date  ) values (?, ?, ?, ?, ?, ?, 3, CURRENT_DATE)
				""";
		int changes = 0;
		int empid = 1;
	 	try{
	 		PreparedStatement preparedStatement =  
		            ConnectionManager.getConnection().prepareStatement(sql);
	 		log.info("Connected to the H2 database successfully!");
	 		
            for (Employee emp : employees) {
            	preparedStatement.setString(1, String.valueOf(empid));
            	preparedStatement.setString(2, emp.getFirstName());
            	preparedStatement.setString(3, emp.getLastName());
            	preparedStatement.setString(4, emp.getEmail());
            	preparedStatement.setString(5, emp.getPhoneNumber());
            	preparedStatement.setString(6, emp.getSalary());
            	preparedStatement.executeUpdate();
            	changes++;
            	empid++;
	            
			}
            
	            
	    } catch (SQLException e) {
	    	log.warning("db operations error");
	    	throw new EmployeeServiceException("Database Error",e);
		
	   }
	 	log.info("number of changes: "+ changes);
	return changes;
	}
		
}
