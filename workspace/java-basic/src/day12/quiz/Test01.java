package day12.quiz;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test01 {
	// �������� : 1 - 2 - 4 - 5
	// ���ܹ߻��� : 1 - 3 - 4 - 5
	// ����ó�� ��ƾ ������(������ ����) : 1 - 4
	// return �� �Բ� ���� : 1 - 3 - 4           //return�� �־ finally�� ����ȴ�.
    public static void main(String[] args) {
		System.out.println(1);
		try {
//			System.out.println(1 / 0);
			FileReader fr = new FileReader("data/a.txt");
			System.out.println(2);
		} catch (FileNotFoundException e) {
			System.out.println(3);
			return;                // �Լ��� ��ġ��� return.
		} finally {                // ������ �����۾��Ҷ� �ַ� ���� ���δ�. ������ ���̱⶧����
			System.out.println(4);
		}
		System.out.println(5);    // 5���� ����Ǹ� �������� ó���Ǿ��ٴ� �ǹ�
    }	
}