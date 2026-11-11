package Stream_Employee_List;

import java.util.Comparator;

public class Sort_Employee_By_Salary {

	public static void main(String[] args) {

		Employee_List.listEmployee().stream().sorted(Comparator.comparing(Employee::getSalary))
				.forEach(e -> System.out.println(e.getName() + " = " + e.getSalary()));
	}

}
