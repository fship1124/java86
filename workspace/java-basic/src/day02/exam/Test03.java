package day02.exam;

import java.util.Scanner;

public class Test03 {
	public static void main(String [] args) {
		final double aa = 3.141592; 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �������� �Է��ϼ��� : ");
		
		int st = sc.nextInt();
		double bb = st * st * aa;
		System.out.printf("�������� %d �� ���� ������ %.4f�Դϴ�.", st, bb );
	}

}
