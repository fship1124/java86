package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("id", "hong");
		map.put("name", "ȫ");
		map.put("email", "hong@a.com");
		
		System.out.println(map.size());
		
		String id = map.get("id");
		System.out.println(id);
		// �ʿ� �ش��ϴ� Ű�� ���� ��� null �� ��ȯ�ȴ�.
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











