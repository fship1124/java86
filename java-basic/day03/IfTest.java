package day03;

import java.util.Random;

public class IfTest {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(10) + 1;   // 1 ~ 10
		System.out.println("num : " + num);
		
		/*
		// num �� 5���� ũ�ٸ� ȭ�鿡 ũ�ٴ� �޽����� ����Ѵ�.
		if (num > 5)
			System.out.println("ũ��");
		*/  
		
		/*
		// num �� 5���� ũ�ٸ� ȭ�鿡 ũ�ٴ� �޽����� ����Ѵ�.
		// num�� ���� ¦������ Ȧ������ ȭ�鿡 ����Ѵ�.
		if (num > 5) {
			System.out.println("ũ��");
			
			// ¦��, Ȧ�� �Ǵ� �� ��� ���
			if (num % 2 == 0) 
				System.out.println(num + " : ¦��");
			
			if (num % 2 != 0)  
				System.out.println(num + " : Ȧ��");
			
		}
		*/
		
		/*
		// ���� : ¦���� Ȧ���� ���ÿ� �� �� ����..
		// num �� 5���� ũ�ٸ� ȭ�鿡 ũ�ٴ� �޽����� ����Ѵ�.
		// num�� ���� ¦������ Ȧ������ ȭ�鿡 ����Ѵ�.
		// 5���� ��� "����"  ���
		// 5���� ���� ��� "�۴�" ���
		if (num > 5) {
			System.out.println("ũ��");
			
			// ¦��, Ȧ�� �Ǵ� �� ��� ���
			if (num % 2 == 0) {
				System.out.println(num + " : ¦��");
			} else {
				System.out.println(num + " : Ȧ��");
			}
		} else {   // 5�̰ų� 5���� ���� ���
			// 
			if (num == 5) {
				System.out.println("����");
			} else {  // 
				System.out.println("�۴�");
			}
		}
		*/
		
		/*
		if (num > 5) {
			System.out.println("ũ��");
			// ¦��, Ȧ�� �Ǵ� �� ��� ���
			if (num % 2 == 0) {
				System.out.println(num + " : ¦��");
			} else {
				System.out.println(num + " : Ȧ��");
			}
		} else if (num == 5) {   // 5�̰ų� 5���� ���� ���
			System.out.println("����");
		} else {
			System.out.println("�۴�");
		}
		*/
		
		if (num > 5) {
			System.out.println("ũ��");
			// ¦��, Ȧ�� �Ǵ� �� ��� ���
			/*
			String msg;
			if (num % 2 == 0) {
				msg = "¦��";
			} else {
				msg = "Ȧ��";
			}
			*/
			
			/*
			String msg = "Ȧ��";
			if (num % 2 == 0) msg = "¦��"; 
			System.out.println(num + " : " + msg);
			*/
			
//			System.out.println(num + " : " + 
//			                   ((num % 2 == 0) ? "¦��" : "Ȧ��"));
			
			System.out.printf(
				"%d : %s\n", num, (num % 2 == 0) ? "¦��" : "Ȧ��");
		} else if (num == 5) {   // 5�̰ų� 5���� ���� ���
			System.out.println("����");
		} else {
			System.out.println("�۴�");
		}
	}
}












