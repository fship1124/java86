package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// 2016-07-13 11:06
		
		// SimpleDateFormat Ŭ������ ����ϱ� ���� �⺻ ����
		// 1. ��¥
		// 2. ����(��, ��, ��, �� ....)
		//    - y : �⵵
		//    - M : ��
		//    - d : ��
		//    - h : ��
		//    - m : ��
		//    - s : ��
		//    2016-07-13 11:06 -> yyyy-MM-dd hh:mm
		//    2016/07 11:06    -> yyyy/MM hh:mm
		String pattern = "yyyy-MM-dd hh:mm";
		SimpleDateFormat sdf = 
				new SimpleDateFormat(pattern);
		String result = sdf.format(new Date());
		System.out.println("result : " + result);
		
		String strDate = "2016-01-01 00:00";
		try {
			Date d2 = sdf.parse(strDate);
			System.out.println(d2);
		} catch (ParseException e) {
			System.out.println("��¥ �Ľ��� ���� �߻�");
			e.printStackTrace();
		}
	}
}










