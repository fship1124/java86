package day14.quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test01 {
	public static void main(String[] args) {
		// �ζ� ��ȣ (1-45) ������ ���� 6���� �����ؼ� 
		// ȭ�鿡 ����Ѵ�.
		// Set�� �̿�
		Random r = new Random();
		Set<Integer> set = new HashSet<>();
		while (set.size() < 6) {
			set.add(r.nextInt(45) + 1);
		}
		System.out.println(set);
	}
}









