package Stream_List;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Even_Number {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(10, 15, 20, 25, 30);

		// way 1
		numberList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		// way 2
		System.out.println(numberList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
	}

}
