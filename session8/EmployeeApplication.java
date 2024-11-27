package jsonproject;


import java.io.FileInputStream;
import java.util.List;
import java.util.logging.LogManager;

public class EmployeeApplication {
	
	private static final String DATA_EMPLOYEES_JSON = "data-employees.json";
	private static final String LOGGING_PROPERTIES = "logging.properties";


	public static void main(String[] args) throws Exception {
		
		
		LogManager.getLogManager().readConfiguration(new FileInputStream(LOGGING_PROPERTIES) );
		List<Employee> employee = EmployeeService.readAllEmployees(DATA_EMPLOYEES_JSON);
		for (Employee emp : employee) {
			emp.setPhoneNumber(emp.getPhoneNumber().substring(1));
		}
		EmployeeService.saveEmployee(employee);

		
	}
}
