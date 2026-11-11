package Stream_Employee_List;

import java.util.Arrays;
import java.util.List;

public class Employee_List {
	
	public static List<Employee> listEmployee()
	{
		List<Employee> employees = Arrays.asList(
			    new Employee(1, "John", 30000),
			    new Employee(2, "Alex", 50000),
			    new Employee(3, "David", 40000),
			    new Employee(4, "Smith", 60000)
			);
		return employees;
	}
}
