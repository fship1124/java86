package day05.quiz;

import java.util.Scanner;
public class ArrayWriteTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[3];
		
		
		int pos = 0; //�迭�� �Էµ� �ε��� ��ġ + �Էµ� ����� ���� - ����Ҷ� ��� ��ġ�� ���� �ӽ������������
		outer :
		while (true) {
			System.out.println("��ȣ �Է� : ");
			int no = Integer.parseInt(sc.nextLine());
			
			/*//(�迭�� ������ �������� Ȯ���ϴ°�)
			 * 1. �迭�� �Է��ϱ� ���� �迭�� ��� ��Ұ� ä���� �ִ��� Ȯ��
			 * 2. ����, ��� ��Ұ� ä���� ������ ���ο� �迭�� ����
			 *    ������Ģ : ���� �迭�� ũ�� * 2
			 * 3. ���� �迭�� ������ ���ο� �迭�� �����Ų��.  
			 * 4. ���� �迭�� �ּҸ� ���Ӱ� ������ �迭�� �ּҷ� �����Ѵ� 
			 */
			// story :�迭�� ���̻� �� ������ ������ ���ο� ������ ���� ũ�Ⱑ ������ ���Ͽ� ���������͸� ���Ӱ� ������ �迭�� ���� 
			
			// ���� �迭�� ��� ��Ұ� ���ǰ� �ִ°�(�� ���� �־�?) 1��
			if (pos == arr.length) {
				// ���ο� �迭 ����(2��)
				int[] temp = new int[arr.length * 2];
				System.arraycopy(arr, 0, temp, 0, arr.length);   // 3��
				arr = temp;    // �ٲ� ������ �ּҸ� ���� ������ �ּҿ� ����(4��)
			}
			arr[pos++] = no;      // �迭�� ��ġ�� ����
			System.out.println(pos + "�� �Է� ����");
			
			System.out.print("��� �Է�(���� : n) : ");
			String isContinue = sc.nextLine();
			switch (isContinue) {
			case "n": case "N": 
				break outer;
			}
		}
		
		for (int i =0; i < pos; i++) {
			System.out.println(i + " : " + arr[i]);
		}
	}

}
