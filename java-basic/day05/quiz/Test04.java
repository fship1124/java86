/*
 *     1. �迭�� ũ�Ⱑ 3���� �迭�� ����
 *     2. ������ �迭�� ������ ��(1 - 10) ������ ���� �Է�
 *     3. �迭�� ������ ���� *�� ǥ���Ѵ�.
 * 
 *     ������� > 
 *     
 *     0��°  �Էµ� �� 3   ***
 *     1��°  �Էµ� �� 2   **
 *     2��°  �Էµ� �� 7   *******
 */
package day05.quiz;

import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		Random r = new Random();
		String star = "";
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10) + 1;
			for (int k = 1; k <= arr[i]; k++) {
				star += "*";
			}
			System.out.printf(
				"%d��°  �Էµ� �� %d   %s\n", i, arr[i], star);
			star = "";
		}
	}
}










