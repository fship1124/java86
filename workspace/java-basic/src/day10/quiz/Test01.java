package day10.quiz;

class Car {
	String name;
}

public class Test01 {
	public static void main(String[] args) {
		ArrayList list2 = new ArrayList();
		list2.add(new Car());
		
		ArrayList list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		// ����, get(0) : one
		// ����, get(2) : three
		String data = (String)list.get(1);     // ����������ȯ���� ���������ȯ ����
		
		// two �� ��µǵ��� ��� ����
		System.out.println("data :" + data);
		
		int size = list.size();
		// ����� size ���� add �Էµ� ������ ��ȯ
		System.out.println("�Էµ� ������ ũ�� : " + size);
		
		
		// two �����͸� ���� ó����
		list.remove(1);
	
		// 3�� ���
		size = list.size();
		System.out.println("������ ������ ũ�� : " + size);
		
		// [on, three, four]
		System.out.println(list);
		
		
	}

}
