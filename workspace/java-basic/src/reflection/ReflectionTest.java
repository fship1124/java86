/*
 * ���÷���
 * 1. Ŭ���� ���� ����
 * 2. �޼��� ����
 * 3. ��ü ����
 * 4. �޼��� ����
 */
package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;

public class ReflectionTest {
	/** 
	 * 1. Ŭ���� ��ü ������ ��� ��� : 3����
	 */
	private static void test01() throws Exception{
		// 1. Ŭ���� �̸�. class : Ŭ������ static �ʵ��� class �̿�
		// ? : ���Ÿ���� �� ������ �ִٴ� ��
		// area�� �ö��ִ� Ŭ���� ������ ���� �ִ�.(1����)
		Class<?> clz = Dog.class;
		
		// 2. Class.forName("��Ű����.Ŭ������") : ���ڿ��� �޾��� ��� ���
		Class<?> clz2 = Class.forName("reflection.Dog");
		
		//clz, clz2 �ּҰ� ����(���� ���� ��������):area�� �ö��ִ� Ŭ���� ����
	
		// 3. ��ü.getClass() �޼��� Ȱ��
		Dog d = new Dog();
		Class<?> clz3 = d.getClass();
		
		System.out.println(clz == clz2);
		System.out.println(clz2 == clz3);
	
		// Ŭ���� �̸��� �������� ��� 2����
		// getSimpleName: ��Ű������ ������ full ����
		System.out.println(clz.getSimpleName());
		// getName : ��Ű���� ������ full ����
		System.out.println(clz.getName());
		
	}
	
	/**
	 *  2. Class �� �޼��� ���� �����ϴ� ���
	 */
	private static void test02() throws Exception {
		Class<?> clz = Dog.class;
		Method[] mArr = clz.getDeclaredMethods();
		System.out.println("�޼��� ���� ���");
		System.out.println("=========================================");
		for (Method method: mArr) {
			System.out.println("�޼��� �̸� : " + method.getName());
			Class<?> rClz = method.getReturnType();
			System.out.println("��ȯŸ�� �̸� : " + rClz.getName());
			// �Ķ���� ���� ����
			Parameter[] p = method.getParameters();
			for (Parameter param : p) {
				Type t = param.getParameterizedType();
				System.out.println("�Ķ���� : " + t.getTypeName());
			}
			System.out.println("=========================================");
		}
		/* ù��° 
		Method method = clz.getDeclaredMethod("setName", String.class);
		System.out.println("�޼��� ���� ���");
		System.out.println("=========================================");
		System.out.println("�޼��� �̸� : " + method.getName());
		Class<?> rClz = method.getReturnType();
		System.out.println("��ȯŸ�� �̸� : " + rClz.getName());
		// �Ķ���� ���� ����
		Parameter[] p = method.getParameters();
		for (Parameter param : p) {
			Type t = param.getParameterizedType();
			System.out.println("�Ķ���� : " + t.getTypeName());
		}
		System.out.println("=========================================");
		*/
		
	}
	
	/**
	 * 3. ���÷����� �̿��� ��ü ����
	 */
	private static void test03() throws Exception {
		Class<?> clz = Dog.class;
		
		// ���ο� �ν��Ͻ��� ������. ����Ʈ �����ڸ� ���� ��ü�� �����.
		Object obj = clz.newInstance();    // Object obj = new Dog();
		Dog dog = (Dog)obj;
		dog.setName("��");
		System.out.println(dog.getName());
		
	}
	
	/**
	 * 4. ���÷����� �̿��� �޼��� ����
	 */
	
	private static void test04() throws Exception {
		/*
		 * 	Dog d = new Dog();
		 * 	d.setName("��");
		 * 	String name = d.getName();
		 *  system.out.println("�������� �̸� : " + name);
		 */
		Class<?> clz = Dog.class;
		Object obj = clz.newInstance();
		Method m1 = clz.getDeclaredMethod("setName", String.class);
		// obj �� m1 �� ��� �޼��� ����(d.setName("��");)
		m1.invoke(obj, "��");
		
		// String name = d.getName();
		Method m2 = clz.getDeclaredMethod("getName");
		String name = (String)m2.invoke(obj);
		System.out.println("�������� �̸� : " + name);
	}
	
	
	public static void main(String[] args) throws Exception {
//		test01();
//		test02();
//		test03();
		test04();
		
		// 
		sum();
		sum(100);
		sum(100, 200);
		sum(new int[] {100, 200, 300});
		sum(new int[] {100, 200, 300, 400});
		
	}

	// �������� ��� �Ű������� ������ ����
	private static void sum(int...arr) {}
	/*
	private static void sum() {}
	private static void sum(int i) {}
	private static void sum(int i, int j) {}
	private static void sum(int [] arr) {}
	*/
}
