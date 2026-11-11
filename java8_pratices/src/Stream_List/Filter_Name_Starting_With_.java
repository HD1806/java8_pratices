package Stream_List;

import java.util.Arrays;
import java.util.List;

public class Filter_Name_Starting_With_ {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("apple", "banana", "cat", "docker", "eclipse");
		
		stringList.stream().filter(a -> a.startsWith("a")).forEach(System.out::print);
	}

}
