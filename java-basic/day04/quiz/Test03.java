/*
1 ���� 100������ ���� �߿��� �Ҽ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
�Ҽ��� �� �� �ڽŰ� 1�� ������ �ٸ� �����δ� ������ �������� �ʴ� ���� 
    3�� �Ҽ����� �Ǻ� : 
    3 % 1 == 0 (��)
    3 % 2 == 0 (����)
    3 % 3 == 0 (��)
    ���� ��찡 2���� ��� �Ҽ�

��°��
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
 */
package day04.quiz;

public class Test03 {
	public static void main(String[] args) {
		int k = 0;
		outer : 
		for (int num = 2; num <= 100; num++) {
			for (k = 2; k < num ; k++) {
				if (num % k == 0)
					continue outer;
			}
			System.out.printf("%d ", num);
		}
	}
}
