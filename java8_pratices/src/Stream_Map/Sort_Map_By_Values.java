package Stream_Map;

import java.util.HashMap;
import java.util.Map;

public class Sort_Map_By_Values {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "eclipse");
		map.put(2, "apple");
		map.put(3, "docker");
		map.put(4, "banana");
		map.put(5, "carrot");
		map.put(6, "bat");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

}
