package day05;

import java.util.Scanner;

public class ArrayWriteTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		// �迭�� �Էµ� �ε��� ��ġ + �Էµ� ����� ����
		int pos = 0;
		outer : 
		while (true) {
			System.out.print("��ȣ �Է� : ");
			int no = Integer.parseInt(sc.nextLine());
			
			/*
			 * 1. �迭�� �Է��ϱ� ���� �迭�� ��� ��Ұ� ä���� �ִ���
			 *    Ȯ��
			 * 2. ����, ��� ��Ұ� ä���� ������ ���ο� �迭�� ����
			 *    ���� ��Ģ : ���� �迭�� ũ�� * 2
			 * 3. ���� �迭�� ������ ���ο� �迭�� �����Ų��.  
			 * 4. ���� �迭�� �ּҸ� ���Ӱ� ������ �迭�� �ּҷ� ������ 
			 */
			// ���� �迭�� ��� ��Ұ� ���ǰ� �ִ°�(�������־�??)
			if (pos == arr.length) {
				// ���ο� �迭 ����
				int[] temp = new int[arr.length * 2];
				System.arraycopy(arr, 0, temp, 0, arr.length);
				arr = temp;
			}
			arr[pos++] = no;
			System.out.println(pos + "�� �Է� ����");
			System.out.print("��� �Է�(���� : n) : ");
			String isContinue = sc.nextLine();
			switch (isContinue) {
			case "n": case "N":
				break outer;
			}
		}
		for (int i = 0; i < pos; i++) {
			System.out.println(i + " : " + arr[i]);
		}
	}
}






