package Stream_Employee_List;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group_Employee_By_Salary {

	public static void main(String[] args) {
		
		Map<Double, List<Employee>> result = Employee_List.listEmployee().stream().collect(Collectors.groupingBy(Employee::getSalary));
		
		for (Map.Entry<Double, List<Employee>> resultMap : result.entrySet()) {
			System.out.print(resultMap.getKey() + " = " + Arrays.toString(resultMap.getValue().toArray()));
		}
	}

}
