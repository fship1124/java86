/*
	���� �̸� : _�Һ���
	���� : 1200
	Į�θ� : 330
	��� �Է��Ͻðڽ��ϱ�?(Y/N) : Y 
	
	���� �̸� : _���ϻ�
	���� : 1200
	Į�θ� : 330
	��� �Է��Ͻðڽ��ϱ�?(Y/N) : N
	
	�� ���� �Է��� �Ϸ�Ǿ����ϴ�.

	�Էµ� ���� �̸�
	----------------
	�Һ���    1200   312
	���ϻ�    2000   350
	----------------
	
	�迭�� Ȱ�� : Bread
 */

package day06.quiz;

import java.util.Scanner;

class Bread {
	String name;
	int price;
	int cal;
}
public class Test02 {
	public static void main(String[] args) {
		Bread [] list = new Bread[10];
		int pos = 0;
		
		Scanner sc = new Scanner(System.in);
		outer : 
		while (true) {
			Bread b = new Bread();
			System.out.print("���� �̸� : ");
			b.name = sc.nextLine();
			System.out.print("���� : ");
			b.price = Integer.parseInt(sc.nextLine());
			System.out.print("Į�θ� : ");
			b.cal = Integer.parseInt(sc.nextLine());
			list[pos++] = b;
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			String isContinue = sc.nextLine();
			switch (isContinue) {
			case "N": case "n":
				break outer;
			}
		}
		System.out.println("�Էµ� ���� �̸�");
		System.out.println("--------------------");
		for (int i = 0; i < pos; i++) {
			System.out.printf(
				"%s\t%d\t%d\n", list[i].name, list[i].price, list[i].cal);
		}
		
	}
}










