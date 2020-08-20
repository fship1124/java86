package day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// map�� put�� get�� ����϶�
public class MapTest {
    public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("id", "hong");
		map.put("name", "ȫ");
		map.put("email", "hong@a.com");
		
		System.out.println(map.size());
		
		String id = map.get("id");          //Ű���� �ְ�
		System.out.println(id);             //������� �޴´�
		
		// �ʿ� �ش��ϴ� Ű�� ���� ��쿡�� ������ �ƴ϶� null�� ��ȯ�ȴ�.
		String addr = map.get("addr");          
		System.out.println(addr);            
		
//		map.keySet();        // �ʾ��� Ű���� set���� ��ȯ.set�ȿ� Ű��
		Set<String> keys = map.keySet(); 
		for (String key : keys) {
			System.out.println(key + ":" + map.get(key));  
//      map.get(key);        //key���� �ְ� value���� �޴´�.			
		}
		System.out.println("--------------------");
		Set<Entry<String, String>> set = map.entrySet();
		for (Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
