package day03.exam;

import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.print("���̸� �Է��ϼ��� : ");
		
		int s1 = sc.nextInt();
		sc.nextLine();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String s2 = sc.nextLine();
		
		System.out.printf("���� : %d  �ּ� : %s", s1, s2);
	}
}
