package day07;

import java.util.Random;
public class MethodTest02 {
	public static void main(String[] args) {
		
		MethodSub02 sub = new MethodSub02();
		//����, �޼��尡 ��ȯ���� �����Ѵٸ� ��ȯ���� ������ �ִ�.
//		int i = 1(���ϰ�);
		int i = sub.method1();    //�����ϸ� ������ �� 1�� �Ѿ�´�.
		System.out.println("i : " + i);
		
		char j = sub.method2();
		System.out.println("j : " + j);
		
		String s = sub.method3();
		System.out.println("A : " + s);
		
		Random r = sub.method4();
		
		int[] iArr = sub.method5(); 
		
		
		
	}

}
