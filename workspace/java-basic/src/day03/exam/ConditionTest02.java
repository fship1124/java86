package day03.exam;

import java.util.Scanner;

public class ConditionTest02 {
	public static void main(String[] args) {

		System.out.print("���ǰ��� �Է��ϼ���(����) : ");

		Scanner sc = new Scanner(System.in);
		int s1 = Integer.parseInt(sc.nextLine());

		int ma = s1 * 10000;
		double mn = 0;
		if (s1 > 100) {
			mn = ma * 0.1;
		} else if (s1 <= 10) {
			mn = ma * 0.03;
		} else if (s1 <= 30) {
			mn = ma * 0.05;
		} else {
			mn = ma * 0.08;
		}
		System.out.printf("���ε� �ݾ��� %.0f�� �Դϴ�.", mn);

	}

}
