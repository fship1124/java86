package day02;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);  //System.in ��������ϴ� �Է�â���� �Է¹ްڴ�.�� �ǹ�
	
		System.out.print("�̸� : ");
		String name = sc.nextLine();   // nextLine : �ٴ����� �аڴ�.(�Է��� �����Ͱ� ���������� Ŀ���� ���.���͸� ġ�� ���� �ٴ������о scanner�� ���� �������� ������)
		System.out.println("name : " + name);
		
		System.out.print("���� : ");
		String age = sc.nextLine();
		System.out.println("age : " + age);
		
	}

}
