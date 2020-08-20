package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// map은 put과 get을 기억하라
public class MapTest {
    public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("id", "hong");
		map.put("name", "홍");
		map.put("email", "hong@a.com");
		
		System.out.println(map.size());
		
		String id = map.get("id");          //키값을 주고
		System.out.println(id);             //밸류값을 받는다
		
		// 맵에 해당하는 키가 없을 경우에는 에러가 아니라 null이 반환된다.
		String addr = map.get("addr");          
		System.out.println(addr);            
		
//		map.keySet();        // 맵안의 키값을 set으로 반환.set안에 키값
		Set<String> keys = map.keySet(); 
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));  
//      map.get(key);        //key값을 주고 value값을 받는다.			
		}
		System.out.println("--------------------");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
