package day10;

import java.util.Random;

class Dog {
	private String name;
	
	public Dog() {}
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name=" + name;
	}
}
class Cat {
	
}
public class ObjectTest {
	public static void main(String[] args) {
//		String s = new String("a");
//		System.out.println(s);  // s.toString()  --> a
		
		
//		Cat c = new Cat();
//		System.out.println(c);  // c.toString();
		
		Dog d = new Dog("���߼�");
		
		// ��ü������ ��� �Ǵ� ��ü������ ���ڿ� ���·� ��ȯ�Ǿ��
		// �� �� �ڵ����� toString() �޼��尡 �ڵ� ȣ��ȴ�.
		System.out.println(d);  // toString()�� �ڵ� ȣ���
		System.out.println(d.toString());
		
		int[] iArr = {1, 2, 3};
		int[][] twoArr = {{1}, {2}};
		System.out.println(iArr);
		System.out.println(twoArr);
		
		java.util.Date d2 = new java.util.Date();
		System.out.println(d2);
		
		Random r = new Random();
		System.out.println(r);
	}
}













