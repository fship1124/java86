package day13.quiz;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.printf(
				"%d�� %d��\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// �ٳѱ� ó�� ����
		int nlCnt = 0;
		
		// ����� 1���� ���� ���ϱ�
		c.set(Calendar.DATE, 1);
		int cDay = c.get(Calendar.DAY_OF_WEEK);  // 1(��) - 7(��)
		
		// ������� ������ ��¥�� ���� ���ϱ�
		c.set(Calendar.DATE, lastDate);
		int lastDay = c.get(Calendar.DAY_OF_WEEK);
		
		// ���� ��¥ ������ ����ϱ� ���� �κ� �߰�
		c.set(Calendar.MONTH, c.get(Calendar.MONTH) - 1);
		int beforeLastDate = 
				c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int beforePrintDate = beforeLastDate - cDay + 2; 
		
		// ������ ��¥ ���
		for (int i = 1; i < cDay; i++) {
			System.out.print(beforePrintDate++ + "\t");
			nlCnt++;
		}
		
		// ������� ��¥ ���
		for (int i = 1; i <= lastDate; i++) {
			System.out.print(
					i + (++nlCnt % 7 == 0 ? "\n" : "\t"));
		}
		
		// �������� ��¥ ���
		for (int i = 1; i <= 7 - lastDay; i++) {
			System.out.print(i + "\t");
		}
	}
}













