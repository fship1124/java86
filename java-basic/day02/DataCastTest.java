package day02;

public class DataCastTest {
	public static void main(String[] args) {
		byte b = 1;
		int i = 128;
		
//		byte b2 = i;  // ���� �߻�
		byte b2 = (byte)i;  // ����� ����ȯ, �ٿ� ĳ����
		System.out.println("b2 = " + b2);
		
		int i2 = b;  // ������, �Ϲ���, ��ĳ����
		System.out.println("i2 = " + i2);
		
		char c = 'a';
		// a ������ �ƽ�Ű �ڵ带 ���
		int i3 = c;
		System.out.println(i3);
		
		// b ������ �ƽ�Ű �ڵ带 ���
		System.out.println((int)'b');
	}
}








