package day04;

import java.util.Arrays;

public class ArrayTest03 {
	public static void main(String[] args) {
		// �迭�� ������ ���� Ȯ���ϴ� ��� : 3����
		int [] iArr = {1, 2, 3};
		// 1��
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		// 2��
		// 1.5 ���� ����
		for (int val : iArr) {
			System.out.println(val);
		}
		
		// 3��
		/*
		String result = Arrays.toString(iArr);
		System.out.println(result);
		 */
		
		System.out.println(Arrays.toString(iArr));
	}
}







