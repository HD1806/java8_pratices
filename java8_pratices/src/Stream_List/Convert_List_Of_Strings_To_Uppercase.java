package Stream_List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Convert_List_Of_Strings_To_Uppercase {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("apple", "banana", "cat", "docker", "eclipse");
		
		List<String> resultList = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(resultList);
	}

}
