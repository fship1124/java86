package day02;

public class OperationTest02 {
	public static void main(String [] args) {
		// ���� ������ : 
		int a = 5;
		a = a + 5;       
		a += 5;  // a�� ������ 5�� ���ؼ� ������� �ٽ� a�� �ִ´�. ���� �İ� �����ϳ� �ش� �ڵ����� ��õ
		
		int b = 10;
		b += 3 * 10;    // == b = b * (3 + 10);
		System.out.println(b);
		
		// ���� ������
		/*
		int a = 5;
		int b = 5;
//		boolean bool = a > 5 && b++ == 5;   // && �տ� ���� false�̸� �ڿ����� ������ ���� �ʴ´�
		boolean bool = a > 5 & b++ == 5;
		
		System.out.println(bool);
		System.out.println(a);
		System.out.println(b);
		
		// �� ������
		 * 
		int a = 5;
		System.out.println(a == 5);
		System.out.println(a != 5);
		System.out.println(a = 6);

//		String result = (a = 6) ? "6�̴�" : "6�� �ƴϴ�";
		
		boolean bool = false;   
		// �񱳰� �ƴ� bool�� true���� �����Ѵ�.
		String result = (bool = true) ? "��" : "����";   // ()�ȿ� �������� �νĵǱ⶧���� ������ false�� ���´�(�񱳰� �ƴ� �������� �ν�). �׷��Ƿ� = �ƴϰ� ==�� �ؾ��Ѵ�.
		
		
		
		// ��������� part
	
		int i = 5;
		int j = 2;
		
		System.out.println(i / j);
		double d = i / j;   //���� ���������� ū Ÿ������ ��ȯ�ȴ�.
		System.out.println(d);
		
		d = (double)i / j;
		System.out.println(d);
		
		System.out.println(i % j);
		
		System.out.println(8 % 2);  // 0  =¦��
		System.out.println(7 % 2);  // 1  =Ȧ��
		System.out.println(6 % 2);  // 0  =¦��
		System.out.println(5 % 2);  // 1  =Ȧ��
		System.out.println(4 % 2);  // 0  =¦��      // 
		
		*/
	}

}