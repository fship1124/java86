/*
 * 	1.������ �� ����(1~9)
 * 	2.�����ϰ� ������ ���� �迭�� � �ִ��� ī��Ʈ�Ѵ�.
 * 
 *  ��� ����>
 *  ������ �� 6�� �迭�� 1���� ���ԵǾ� �ֽ��ϴ�.
 *  
 */

package day05.quiz;

import java.util.Random;
public class Test03 {
    public static void main(String[] args) {
		
		int [] arr = {7, 2, 5, 1, 3, 8, 8, 2, 9, 6};
		Random r = new Random();
		int num = r.nextInt(9)+1;
		
		int count = 0;
		for (int i = 0 ; i < arr.length; i++ ){
			/*
			if (num == arr[i]) {
				count++;
			}
			*/
			if (num != arr[i]) {
				continue;
			}
		}
		System.out.printf("������ �� %d�� �迭�� %d�� �ֽ��ϴ�." , num, count);
	}
}
