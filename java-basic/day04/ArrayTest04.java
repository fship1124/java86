package day04;

import java.util.Arrays;

public class ArrayTest04 {
	public static void main(String[] args) {
		String[] src  = {"�ݶ�", "���̴�", "�ܹ���", "����"};
		String[] dest = new String[src.length];
		
		// �迭 ���� API
//		System.arraycopy(src, 2, dest, 0, 2);
		System.arraycopy(src, 0, dest, 0, src.length);
		
		System.out.println(Arrays.toString(dest));
		
		// �Ϻκ� ����
		// src �迭�� �ε����� 2���� 3������ ��Ҹ�
		// dest �迭�� �ε��� 0��° 1��°�� ����
		/*
		for (int i = 2; i <= 3; i++) {
			dest[i - 2] = src[i];
		}
		*/
		
		// ��ü ����
		/*
		for (int i = 0; i < src.length; i++) {
			dest[i] = src[i];
		}
		*/
		
	}
}
