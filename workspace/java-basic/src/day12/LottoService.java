package day12;

import java.util.Random;

public class LottoService {

	public void execute() throws LottoException {
		Random r = new Random();
		int num = r.nextInt(100) + 1;
		System.out.println("�ζ� ��ȣ : " + num);
		
		if (num > 45) {
			// ���ܸ� �߻���Ŵ
//			throw new LottoException();
			throw new LottoException(num);
		}
		else {
			System.out.println("�ζ� ��ȣ�� �ùٸ��� �����Ǿ����ϴ�.");
		}
	}

}
