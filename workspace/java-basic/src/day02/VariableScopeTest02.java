package day02;

public class VariableScopeTest02 {
	public static void main(String [] args) {
		
		// int i = 0;  // ���� �߻�. �̹� ����Ǿ��µ� �Ʒ� i����� �ߺ�.
		
		for (int i = 0; i < 10; i++){   //for�� i�� ���� ��� �ȿ����� i�� ��밡��
			System.out.println(i);
		}
		if (true){
			int a = 100;
			System.out.println(a);
		}
//		System.out.println(a);  // ���� �߻�
	}

}
