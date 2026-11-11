package Stream_Employee_List;

import java.util.Comparator;
import java.util.List;

public class Find_High_Pay_Employee {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee_List.listEmployee();
		
		Employee employee = employeeList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		
		System.out.println("highest paid employee is : " + employee.getName());
	}

}
