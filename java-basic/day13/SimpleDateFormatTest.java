package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatTest {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		// 2016-07-13 11:06
		
		// SimpleDateFormat 클래스를 사용하기 위한 기본 조건
		// 1. 날짜
		// 2. 패턴(년, 월, 일, 시 ....)
		//    - y : 년도
		//    - M : 월
		//    - d : 일
		//    - h : 시
		//    - m : 분
		//    - s : 초
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
			System.out.println("날짜 파싱중 오류 발생");
			e.printStackTrace();
		}
	}
}










