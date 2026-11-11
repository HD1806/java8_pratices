package Stream_Map;

import java.util.HashMap;
import java.util.Map;

public class Filter_Map_Values {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "carrot");
		map.put(4, "docker");
		map.put(5, "eclipse");
		map.put(6, "bat");

		map.entrySet().stream().filter(a -> a.getValue().startsWith("b"))
				.forEach(a -> System.out.println(a.getKey() + " - " + a.getValue()));
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
