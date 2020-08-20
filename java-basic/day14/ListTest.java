package day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		// ������ �߰�
		list.add("one");
		list.add("two");
		list.add("three");
		
		// ����Ʈ ������ ����
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
		// 3. Iterator(��ȯ��)
		Iterator<String> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		/*
		// ũ�� Ȯ��
		System.out.println("size : " + list.size());
		// ������ ����
		String delObj = list.remove(0);
		System.out.println("������ ��� : " + delObj);
		System.out.println("���� �� size : " + list.size());
		
		list.remove("two");
		System.out.println("����(two) �� size : " + list.size());
		
		// ��ü ����
		list.clear();
		System.out.println("��ü ���� �� size : " + list.size());
		
		if (list.isEmpty()) {
			System.out.println("����Ʈ �������");
		}
		else {
			System.out.println("����Ʈ ������� ����");
		}
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		if (list.contains("two")) {
			System.out.println("two ���ԵǾ� ����");
		} else {
			System.out.println("two ���ԵǾ� ���� ����");
		}
		
		int index = list.indexOf("two");
		System.out.println("index : " + index);
		
		List<String> sub = new ArrayList<>();
		sub.add("four");
		sub.add("five");
		
		list.addAll(sub);
		System.out.println("addAll ���� size : " + list.size());
		*/
	}
}











