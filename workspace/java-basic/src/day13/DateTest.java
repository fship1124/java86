package day13;

import java.io.File;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
		// ���� �ð� ������ ��ȯ
    	Date d = new Date();
		System.out.println(d);         // d.toString()�� �ڵ�ȣ���
		
		int year = d.getYear() + 1900;
		System.out.println("year : " + year);
		
		// �ð� ������ long���� ���� ���
		// �ð� ������ ������ ��� ���
		Date d2 = new Date(1000);   // ��ü�ð����� �հ��� �� ���
		System.out.println(d2);
		
		long time = System.currentTimeMillis();
		System.out.println("time s: " + time);
		
		Date d3 = new Date(time);
		System.out.println(d3);
		
		File f = new File("data/a.txt");
		long l = f.lastModified();
		System.out.println("a.txt ������ ������ ���� �ð�");
		System.out.println(new Date(1));
		
		//date�� �ð������� long������ ��ȯ�Ͽ���
		long dTime = d.getTime();
		System.out.println("Date�� ������ long : " + dTime); 
		
		// ��¥ ������ ������ long ������ ����
		d.setTime(10000);
		System.out.println(d);
		
	}
}
