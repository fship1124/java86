package day02.exam;

import java.util.Scanner;

public class Test04 {
	public static void main (String [] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int s1 = sc.nextInt();
		System.out.print("���� ���� �Է��ϼ���: ");
		int s2 = sc.nextInt();
		
		int s3 = s1 / s2;
		System.out.printf("�� : %d ", s3);
		
		System.out.println();
		
		int s4 = s1 % s2;
		System.out.printf("������ : %d ", s4);
		
	}

}
