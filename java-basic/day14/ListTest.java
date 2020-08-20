package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// 데이터 추가
		list.add("one");
		list.add("two");
		list.add("three");
		
		// 리스트 데이터 추출
		// 1. 
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		// 2.
		for (String val : list) {
			System.out.println(val);
		}
		System.out.println("--------------------");
		// 3. Iterator(순환자)
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		/*
		// 크기 확인
		System.out.println("size : " + list.size());
		// 데이터 삭제
		String delObj = list.remove(0);
		System.out.println("삭제된 요소 : " + delObj);
		System.out.println("삭제 후 size : " + list.size());
		
		list.remove("two");
		System.out.println("삭제(two) 후 size : " + list.size());
		
		// 전체 삭제
		list.clear();
		System.out.println("전체 삭제 후 size : " + list.size());
		
		if (list.isEmpty()) {
			System.out.println("리스트 비어있음");
		}
		else {
			System.out.println("리스트 비어있지 않음");
		}
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		if (list.contains("two")) {
			System.out.println("two 포함되어 있음");
		} else {
			System.out.println("two 포함되어 있지 않음");
		}
		
		int index = list.indexOf("two");
		System.out.println("index : " + index);
		
		List<String> sub = new ArrayList<>();
		sub.add("four");
		sub.add("five");
		
		list.addAll(sub);
		System.out.println("addAll 이후 size : " + list.size());
		*/
	}
}











