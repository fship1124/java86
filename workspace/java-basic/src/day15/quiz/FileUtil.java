package day15.quiz;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import day10.pack.a.Data;

public class FileUtil {
    public static boolean mkDir() {
    	// ���� �ð� ������ ����
    	// �� �� �Ͽ� �ش��ϴ� ���丮�� �����Ѵ�.
    	// ��> 2016-07-15
    	//     data/2016/07/15 �� ����
    	
    	/*����� 1
    	SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd");
    	File f = new File("data" + sdf.format(new Date()));
    	return f.mkdirs();
    	*/
    	
    	//�����2
    	return new File("data" + new SimpleDateFormat("/yyyy/MM/dd"). format(new Date())).mkdirs();
    	
    	
    	
    	/*���� ȿ�� �ϴ� ��
    	Calendar c =  Calendar.getInstance();
    	System.out.println(c);
    	
    	int year = c.get(Calendar.YEAR);
    	int month = c.get(Calendar.MONTH);
    	int day = c.getMaximum(Calendar.DATE);
    	
    	File f = new File()
    	System.out.println(f.exists());
    	
    	if (f.exists()) {
    		
    	}
//    	File f = new File("data/%d/%d/%d", year, month, day); 
    	
    	System.out.println(f.mkdirs() ? "���丮 ����" : "���丮 ����");
    	
    	return false;
    	*/
    }
}
