/*
 *    �Ʒ��� �䱸������ �����ϴ� ���α׷� �ۼ�
 *    
 *    1. ������ ��(1 - 10) ������ ���ڸ� 10�� �����ؼ�
 *       �迭�� �Է���
 *    2. �迭�� ������ �� �߿��� 5���� ū ������ �հ踦 �����
 *    3. �迭�� ������ ���� �հ踦 ȭ�鿡 ���   
 */

package day05.quiz;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		Random r = new Random();
		
		int sum = 0;  // �հ�
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = r.nextInt(10) + 1;
			if (iArr[i] > 5) {
				sum += iArr[i];
			}
		}
		System.out.println(Arrays.toString(iArr));
		System.out.println("�հ� : " + sum);
	}
}










