package day04;

import java.util.Random;

public class ArrayTest01 {
	public static void main(String[] args) {
		/*
		Random r = new Random();
		int num = r.nextInt(100);
		
	    Random r2 = null;   // ���������� �ʱⰪ�� null���� �ش�.
	    int num2 = r2.nextInt(100);
		*/
		
		int [] iArr;   // �迭�� ����
		iArr = new int[5];    // int�� ���� �� �ִ� 5���� ������ ����
		
		// �迭�� ������ ���ÿ� ���� �ڵ� �ʱ�ȭ�� �߻��Ѵ�.
		// ���� : 0, �Ǽ� : 0.0, ���� : false, ���� : ����
		// ������ : null 
		
		// �迭�� ��� �� Ȯ��
		// �迭�̸�[�ε���]
		System.out.println(iArr[0]);
		System.out.println(iArr[1]);
		System.out.println(iArr[2]);
		System.out.println(iArr[3]);
		System.out.println(iArr[4]);
		
		// �迭�� ũ�� : �迭�� �̸�.length
		for (int i = 0; i < iArr.length; i++ ) {
			System.out.println(iArr[i]);
		}
		
		String[] sArr = new String[3];
		sArr[0] = "a";
		
		for (int i = 0; i < sArr.length ; i++) {
			System.out.println(sArr[i]);
		}
		
	}
	
	
	


}
