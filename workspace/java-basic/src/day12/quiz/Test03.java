package day12.quiz;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
		BankService bs = new BankService();

		try {
			bs.execute();
		} catch (BankException b) {
			b.printStackTrace();
		}
		
		
		
	}
}






/*

 ������ : ȫ�浿
 �Աݾ� : 10000
���°� �����Ǿ����ϴ�.
----------------------
���� : ȫ�浿
���¹�ȣ : 1
�ʱ��Աݾ� : 10000
---------------------
����(1.���� 2.�Ա� 3.����) : 1
������ �ݾ�(��) : 5000
5000���� �����Ͽ����ϴ�. (�ܾ� : 5000)
����(1.���� 2.�Ա� 3.����) : 2
�Ա��� �ݾ�(��) : 1
����(1.���� 2.�Ա� 3.����) : 1
������ �ݾ�(��) : 5002

_15_exception.quiz.c : �ܾ׺���(���� : 5001��)

*/