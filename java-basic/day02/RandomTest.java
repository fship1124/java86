package day02;

// Random�� ����ϱ� ���ؼ� ��ġ �˷��ֱ�
// ��Ű����.Ŭ������
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		// ������ ���� ����ϱ� ���ؼ� Random Ŭ������ Ȱ��
		Random r = new Random();
		int num = r.nextInt(8) + 2;
		System.out.println("������ �� : " + num);
	}
}












