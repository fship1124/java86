package day07;

import java.util.Random;
import java.util.Scanner;

// ������ MethodTest01
public class MethodTest01 {
    public static void main(String[] args) {
		MethodSub01 sub = new MethodSub01();   //�޼ҵ带 ����ϱ����ؼ��� �޼ҵ尡 �ִ� Ŭ������ �޸𸮿� �÷�����Ѵ�.
		System.out.println(1);
		sub.method1();  // �޼ҵ� ȣ��. ȣ���Ҷ��� �޼ҵ带 �����ϰ��մ� Ŭ������ �Բ� ���ش�		
                        // �޼ҵ� ȣ���ϸ� �ش� �޼ҵ�� ���� �������ϰ� 
		
		sub.method2(10); // sub.method2(int i = 10) �� ����. ��ȯŸ�Կ� �µ��� ���Է�
		
		sub.method3(10, 20);
		
		sub.method4('A');
		
		sub.method5("abc");
    	
		Random r = new Random(); //�������� ���� �ٶ� new�� �༭ ���� �ش�
		sub.method6(r);  
		
    	Scanner sc = new Scanner(System.in);
		sub.method7(sc);
		//	sub.method7(new Scanner());  
		
		System.out.println(1);
		sub.method1();
		System.out.println(2);
//		�� 1 ��� - �޼ҵ� ������ �ٽ� ���ƿ´�- 2�����
    }
}
