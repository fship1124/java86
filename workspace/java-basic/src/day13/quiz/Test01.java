package day13.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
    	Calendar c = Calendar.getInstance();
    	
    	System.out.printf("%d�� %d��\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1);
    	System.out.println("��\t��\tȭ\t��\t��\t��\t��");
    	
    	int lastDate = c.getMaximum(Calendar.DAY_OF_MONTH);
    	
    	// �ٳѱ� ó�� ����
    	int nlCnt = 0;
    	
    	// ����� 1���� ���� ���ϱ�
    	c.set(Calendar.DATE, 1);
    	int cDay = c.get(Calendar.DAY_OF_WEEK);        //1(��) - 7(��)
    	
    	// ������� ������ ��¥�� ���� ���ϱ�
    	c.set(Calendar.DATE, lastDate);
    	int lastDay = c.getMaximum(Calendar.DAY_OF_MONTH);
    	
    	// ���� ��¥ ������ ����ϱ� ���� �κ� �߰�
    	c.set(Calendar.MONTH, c.get(Calendar.MONTH)-1);
    	int beforeLstDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
    	
    	int beforePrintDate = beforeLstDate - cDay + 2;
    	
    	// ������ ��¥ ���
    	for (int i = 1 ; i < cDay; i++) {
    		System.out.print(beforePrintDate++ + "\t");
    		nlCnt++;
    	}
    	// �ش���� ��¥ ���
    	for (int i = 1; i <= lastDate; i++ ) {
    		System.out.print(i + (++nlCnt % 7 == 0 ? "\n" : "\t"));
    	}
    	
    	//�������� ��¥ ���
    	for (int i = 1; i <= 7-lastDay; i++){
    	    System.out.print(i + "\t");
    	}
    	
    	/* �ڵ�1
    	int year = c.get(Calendar.YEAR);
    	int month = c.get(Calendar.MONTH)+1;
    	int val = c.getActualMaximum(Calendar.DATE);
    	
    	c.set(Calendar.DATE, 1);
    	int day = c.get(Calendar.DAY_OF_WEEK);
    	
    	
    	System.out.println(year + "�� " + month + "�� ");
    	System.out.println("��\t��\tȭ\t��\t��\t��\t��");
    	
    	
    	int count = 0; 
    	for (int j = 1 ; j < day; j++ ){
    		System.out.printf("\t");
    		count++;
    	}
    	for (int i = 1 ; i <= val; i++) {
    		count++;
    		System.out.printf("%d\t", i);
    		
    		if (count % 7 == 0) {
    			System.out.println();
    		}
    	}
    	*/
    	
    	
	}
}
