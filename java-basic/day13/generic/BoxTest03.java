package day13.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BoxTest03 {
	public static void main(String[] args) {
		Box3<Integer, String> box = 
				new Box3<Integer, String>(1, "사과");
		int key = box.getKey();
		String value = box.getValue();
		System.out.println(key + " : " + value);
		
		// 1.7 부터 가능
		Box3<Integer, String> box2 = new Box3<>(1, "사과");

		/*
		List<String> list = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		List<Map<String, String>> listMap = new ArrayList<>();
		*/
	}
}










