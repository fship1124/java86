/*
* ������ ���� ó�� ���α׷�
* 
* ������ ���� ���
* �̸� : ȫ
* ����ó : 010-111-1111
* ����(1. ��, 2. ��) : 1
* ���� ����(1. ����, 2. ������) : 1
* �߰� �Է�(Y/N) : N
* 
* ������ ����
* --------------------------------------
* ȫ 010-111-1111 �� ����
* -------------------------------------- 
*/
package dqy06.quiz;

import java.util.Scanner;

class Student {
	String name;
	String telNo;
	int gender;
	int major;
}

public class Test03 {
	public static void main(String[] args) {
		Student[] list = new Student[10];
		Scanner sc = new Scanner(System.in);

		int pos = 0;
		outer: while (true) {
			Student s = new Student();
			System.out.print("�̸� : ");
			s.name = sc.nextLine();
			System.out.print("����ó : ");
			s.telNo = sc.nextLine();
			System.out.print("����(1. ��, 2. ��) : ");
			s.gender = Integer.parseInt(sc.nextLine());
			System.out.print("���� ����(1. ����, 2. ������) : ");
			s.major = Integer.parseInt(sc.nextLine());

			list[pos++] = s;

			System.out.print("�߰� �Է�(Y/N) : ");
			String isContinue = sc.nextLine();
			switch (isContinue) {
			case "N":
			case "n":
				break outer;
			}
		}
		String[] genderArr = { "", "��", "��" };
		String[] majorArr = { "", "����", "������" };
		System.out.println("������ ����");
		System.out.println("--------------------------------");
		for (int i = 0; i < pos; i++) {
			System.out.printf("%s\t%s\t%s\t%s\n", list[i].name, list[i].telNo, genderArr[list[i].gender],
					majorArr[list[i].major]);
		}
		System.out.println("--------------------------------");

	}
}
