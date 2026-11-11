package Stream_List;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Finf_Second_Highest_Number {

	public static void main(String[] args) {

		List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 4, 5, 2, 88, 71, 90);

		int secondHighestNumebr = numberList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
				.get();

		System.out.println(secondHighestNumebr);
	}

}
