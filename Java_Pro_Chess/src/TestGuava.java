import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class TestGuava {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = ImmutableMap.of(
				"gray", 7,
				"red", 12,
				"yellow", 14
				);
		
		System.out.println(map);
		
	}

}
