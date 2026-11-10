package Stream_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Find_Duplicate_Char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter string : ");

		String input = sc.nextLine();

		Map<Character, Integer> mapValue = new HashMap<>();

		for (Character ch : input.toCharArray()) {
			mapValue.put(ch, mapValue.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : mapValue.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("key is : " + entry.getKey() + " and value is : " + entry.getValue());
			}
		}

		// 2nd type
		input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
				.forEach((key, value) -> {
					if (value > 1) {
						System.out.println("key : " + key + " and value : " + value);
					}
				});
	}

}
