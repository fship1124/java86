/*
 ���ڴ� 1~45����
 �ζ� ��ȣ �����
 �ݾ��� �Է��ϼ��� : 2000
 Set 1 : 25  2 19 25  8 20
 Set 2 : 40 40 37 40 16  1
 */

package day04.quiz;

import java.util.Scanner;
import java.util.Random;

public class Test07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ� ��ȣ �����");
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = Integer.parseInt(sc.nextLine());
		
		Random r = new Random();
		
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		
		for (int i = 1; i <= money/1000; i++){
			System.out.printf("Set %d : ", i);
			for (int j = 1; j <= 5; j++){
				System.out.printf("%d ", r.nextInt(45)+1);
			}
			System.out.println();
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("�ζ� ��ȣ �����");
		System.out.print("�ݾ��� �Է��ϼ��� : ");
		int money = Integer.parseInt(sc.nextLine());
		
		Random r = new Random();
		
		for (int i = 1; i <= money / 1000; i++) {
			System.out.printf("Set %d : ", i);
			for (int k = 1; k <= 6; k++) {
				System.out.printf("%3d", r.nextInt(45) + 1);
			}
			System.out.println();
		}
		*/
	}
}
