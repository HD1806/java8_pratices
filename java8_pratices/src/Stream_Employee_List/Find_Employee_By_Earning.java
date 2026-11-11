package Stream_Employee_List;

import java.util.List;

public class Find_Employee_By_Earning {

	public static void main(String[] args) {
		
		List<Employee> employeeList = Employee_List.listEmployee();
		
		employeeList.stream().filter(e -> e.getSalary() > 40000).forEach(e -> System.out.println("employee name : " + e.getName()));
	}

}
