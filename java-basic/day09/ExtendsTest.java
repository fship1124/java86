/**
 *  ����� �޴´ٰ� ������ �θ��� �Ӽ� �Ǵ� �޼��带 ����� �� �ִ�
 *  ���� �ƴϴ�.
 *  ���������ڰ� ���Ǿ�� ����� �����ϴ�.
 *  (private : ����� Ŭ���������� ���� ������ ������)
 */
package day09;

class Person {
//	private String name;  // �ڽ�Ŭ�������� ���� �Ұ�
	String name;
	int age;
	
	Person() {}
	
	Person(String name, int age) {
		this.name = name;
		this.age  = age;
	}
	
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
}
class Student extends Person {
	// �θ�� �ڽ��� ������ �̸��� ������ ���� ���
	// �ڽ��� ���� ���� �����Ѵ�.
	// �̶� �θ��� ������ �������� �Ǵµ� �̰��� ������ ������� 
	// �Ѵ�.
//	String name;
	String no;   // �й�
	
	Student() {}
	
	Student(String name, int age, String no) {
		super(name, age);
		this.no   = no;
	}
	
	public String toString() {
		// �θ� ������ �ִ� ���� �� �޼��忡 �����ϱ� ���ؼ�
		// super Ű���� �����
		return super.toString() + ", no=" + no;
		
		// ���� �ڽ� Ŭ������ �ִ� �޼��带 ȣ���ϱ� ������
		// stackOverflow
//		return toString() + ", no=" + no;
//		return "name=" + name + ", age=" + age + ", no=" + no;
	}
}
public class ExtendsTest {
	public static void main(String[] args) {
		Student s1 = new Student("ȫ�浿", 22, "12345");
		System.out.println(s1.toString());
	}
}







