package day05;

import java.util.Scanner;
public class ArrayDeleteTest {
	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		
		int pos = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ε��� �Է� : ");    //�����ϱ����� �ڿ� �ִ� �ε����� ���� ��ܿ´�
		int index = Integer.parseInt(sc.nextLine());
		
		// �迭�� Ư�� ��� ���� ����
		// 1. ������ �ε��� ���� ��ü ũ�� - 1 ��ġ ���� ���������� ��� �̵�
		// 2. ������ ��� �� 0���� ����
		// 3. ��ü ��� ũ�� ���� : pos--
		/*
		 *  index = 3;
		 *  arr[3] = arr[4];
		 *  arr[4] = 0;
		 *  pos--;
		 *  
		 */
		
		/* 1��
		for (int i = index; i < pos -1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[pos - 1] = 0;
		pos--;
		*/
		
		// �̵��ؾ��� ����
		int moveCnt = pos - index -1;
		if (moveCnt > 0) {
			System.arraycopy(arr, index+1, arr, index, moveCnt);
		}
		arr[--pos] = 0;            // �迭�� ũ��� lenght - 1
		
		System.out.println("�������� ������ Ȯ��");
		for (int i =0; i < pos; i++) {
			System.out.println(arr[i]);
		}
	}

}
