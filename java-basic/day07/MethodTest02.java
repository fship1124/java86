package day07;

import java.util.Random;

public class MethodTest02 {
	public static void main(String[] args) {
		MethodSub02 sub = 
			new MethodSub02();
		// ����, �޼��尡 ��ȯ���� �����Ѵٸ�
		// ��ȯ���� ������ �ִ�.
//		int i = 1(���ϰ�);
		int i = sub.method1();
		System.out.println("i : " + i);
		// method2 ȣ�� �� ����� ���
		char c = sub.method2();
		System.out.println(c);
		
		String s = sub.method3();
		System.out.println(s);
		
		Random r = sub.method4();
		
		int[] iArr = sub.method5();
	}
}







