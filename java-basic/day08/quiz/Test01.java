/*
 *    ���� �ε��� : 3
 *    3��° ���ڴ� l �Դϴ�.
 *    ���� �ε��� : 5
 *    5��° ���ڴ� o �Դϴ�.
 */
package day08.quiz;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		String s = "hello java";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ε��� : ");
		int index = Integer.parseInt(sc.nextLine()) -1;
		System.out.printf(
			"%d��° ���ڴ� %c �Դϴ�.", index + 1, s.charAt(index));
	}
}








