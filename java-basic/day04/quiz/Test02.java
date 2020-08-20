/*
ȭ�鿡�� 2 - 9������ ���� 2���� �Է� �޾� �� ���� ������ �������� 
����ϴ� ���α׷��� �ۼ��Ͻÿ�
���� ��� ȭ�鿡�� 4 �� 8�� �Է� �޾Ҵٸ� 4�ܺ��� 8�ܱ��� ȭ�鿡 
����Ѵ�.
������ ��½� �� �ܺ��� �ٳѱ� ó���Ѵ�.

ù��° ���ڸ� �Է� �ϼ���(2 - 9) : 3
�ι�° ���ڸ� �Է� �Ͻÿ�(2 - 9) : 6
---------------------------------------
3��   3   6   9  12  15  18  21  24  27
4��   4   8  12  16  20  24  28  32  36
5��   5  10  15  20  25  30  35  40  45
6��   6  12  18  24  30  36  42  48  54
---------------------------------------
 */
package day04.quiz;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է� �ϼ���(2 - 9) : ");
		int begin = Integer.parseInt(sc.nextLine());	
		System.out.print("�ι�° ���ڸ� �Է� �Ͻÿ�(2 - 9) : ");
		int end   = Integer.parseInt(sc.nextLine());
		
		System.out.println("---------------------------------------");
		for (int dan = begin; dan <= end; dan++) {
			System.out.printf("%d��", dan);
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%4d", dan * i);
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		
		sc.close();
	}
}
