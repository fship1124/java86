package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("id", "hong");
		map.put("name", "홍");
		map.put("email", "hong@a.com");
		
		System.out.println(map.size());
		
		String id = map.get("id");
		System.out.println(id);
		// 맵에 해당하는 키가 없을 경우 null 이 반환된다.
		String addr = map.get("addr");
		System.out.println(addr);
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("==============================");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
}











