package Stream_Map;

import java.util.HashMap;
import java.util.Map;

public class Print_All_Keys_And_Values {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "apple");
		map.put(2, "banana");
		map.put(3, "carrot");
		map.put(4, "docker");
		map.put(5, "eclipse");
		
		map.keySet().stream().forEach(System.out::println);
		map.values().stream().forEach(System.out::println);
	}
}
