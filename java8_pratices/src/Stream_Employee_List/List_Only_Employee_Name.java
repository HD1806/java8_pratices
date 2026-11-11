package Stream_Employee_List;

import java.util.List;
import java.util.stream.Collectors;

public class List_Only_Employee_Name {

	public static void main(String[] args) {
		
		List<String> nameList = Employee_List.listEmployee().stream().map(Employee::getName)
				.collect(Collectors.toList());

		System.out.println("all employees name list : " + nameList);
	}

}
