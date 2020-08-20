package day13;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
    	// ��ü ���
    	//get: ����, set: ����
    	Calendar c = Calendar.getInstance();
    	System.out.println(c);
    	
    	int val = c.getActualMaximum(Calendar.DATE);
    	System.out.println(val);
    	
    	c.set(Calendar.MONTH, 1);
    	val = c.getActualMaximum(Calendar.DATE);
    	System.out.println(val);
    	
    	c.set(Calendar.MONTH, 2);
    	val = c.getActualMaximum(Calendar.DATE);
    	System.out.println(val);
    	
    	c.set(Calendar.MONTH, 3);
    	val = c.getActualMaximum(Calendar.DATE);
    	System.out.println(val);
    	
    	
    	
    	
    	
    	/*
    	//Calendar ��ü�� Date ��ü�� �����ϱ�
    	Date d2 = c.getTime();
    	System.out.println(d2);
    	
    	
    	// Date ��ü�� Calendar �� �����ϱ�
    	Date d = new Date(1000);
    	c.setTime(d);
    	System.out.println(c.get(Calendar.YEAR));
    	
    	
    	// long ������ �ð������� �������� Calendar�� 
    	// �ð� ������ �����ϱ�
    	File f = new File("data/a.txt");
    	long time = f.lastModified();
    	c.setTimeInMillis(time);     
    	System.out.println(c.get(Calendar.MONTH));
    	
    	
    	
    	// 2015/2/20 ���� �������� ??
//    	c.set(2015, 1, 20);
    	
    	
    	// ����⵵ ��������� 1�Ϸ� ����
//    	c.set(2016, 6, 1);
    	c.set(Calendar.DATE, 1);
    	System.out.println(c.get(Calendar.DAY_OF_WEEK));
    	
    	// ��¥ ���� �����ϱ� (�⺻������ get �޼ҵ带 ����)
    	// �⵵����:1
//        int year = c.get(1);
        int year = c.get(Calendar.YEAR);
        System.out.println("year : " + year);
//        int month = c.get(2) + 1;
        int month = c.get(Calendar.MONTH) + 1;
        System.out.println("month : " + month);
//        ��
        int date = c.get(Calendar.DATE);
        System.out.println("day : " + date);
        
//        ��
        int hour = c.get(Calendar.HOUR);
        System.out.println("hour : " + hour);
        
//        ��
        int minute = c.get(Calendar.MINUTE);
        System.out.println("minute : " + minute);
        
//        ��
        int second = c.get(Calendar.SECOND);
        System.out.println("second : " + second);
        
//        ����
        int day = c.get(Calendar.DAY_OF_WEEK);
        System.out.println("day : " + day);
        
        // 1-�Ͽ��� ~7-�����
        System.out.println("���� : " + day);
        
        // if, switch
        String[] dArr = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
        System.out.println("���� : " + dArr[day]);
        */
    	
    	
    	
	}
}