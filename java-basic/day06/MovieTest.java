/*
 *    ��ȭ ���� ���
 *    
 *    ���� : �� ���� ��
 *    ��� : ������
 *    ���� : �
 *    ��� : Ȳ����
 *    ���� : ���
 *    ��� : �ȼ���, ������
 *    
 *    �Էµ� ��ȭ ����
 *    ------------------------
 *    ����       ���
 *    ------------------------
 *    ����� ��  ������
 *    �       Ȳ����
 *    ���       ������
 *    ------------------------
 */
package day06;

import java.util.Scanner;

class Movie {
	String title;
	String actors;
}
public class MovieTest {
	public static void main(String[] args) {
		Movie[] list = new Movie[3];
		// �迭�� ���� Ȯ��
//		System.out.println(Arrays.toString(list));
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȭ ���� ���");
		Movie m = new Movie();
		for (int i = 0; i < list.length; i++) {
			System.out.print("���� : ");
			m.title = sc.nextLine();
			System.out.print("��� : ");
			m.actors = sc.nextLine();
			
			list[i] = m;
		}
		
		// ��ϵ� ���� ���
		System.out.println("�Էµ� ��ȭ ����");
		System.out.println("------------------------------");
		System.out.println("����\t���");
		System.out.println("------------------------------");
		for (int i = 0; i < list.length; i++) {
			Movie m2 = list[i];
			System.out.println(
				m2.title + "\t" + m2.actors);
		}
		System.out.println();	
		System.out.println("------------------------------");
	}
}













