package day02.exam;

import java.util.Scanner;

public class Test05 {
	public static void main(String [] args) {
		final double s1 = 1092.50;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("�޷��� �Է��ϼ���? ");
		
		int s2 = sc.nextInt();
		double s3 = s1 * s2;
		
		
		System.out.printf("��ȭ %.2f��", s3);
		
				
		
	}

}
