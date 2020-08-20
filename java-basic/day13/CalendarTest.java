package day13;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
	public static void main(String[] args) {
		// 객체 얻기
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
		// Calendar 객체를 Date 객체로 변경하기
		Date d2 = c.getTime();
		System.out.println(d2);
		
		// Date 객체를 Calendar로 적용하기
		Date d = new Date(1000);
		c.setTime(d);
		System.out.println(c.get(Calendar.YEAR));
		
		// long 형태의 시간 정보를 바탕으로 Calendar의
		// 시간 정보를 변경하기
		File f = new File("data/a.txt");
		long time = f.lastModified();
		c.setTimeInMillis(time);
		System.out.println(c.get(Calendar.YEAR));
		*/
		
		/*
		// 2015/2/20 무슨 요일인지 ??
//		c.set(2015, 1, 20);
		// 현재년도 현재월에서 1일로 설정
//		c.set(2016, 6, 1);
		c.set(Calendar.DATE, 1);
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		*/
		
		/*
		// 날짜 정보 추출하기
//		int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		System.out.println("year : " + year);
		int month = c.get(Calendar.MONTH) + 1;
		System.out.println("month : " + month);
		// 일
		int date = c.get(Calendar.DATE);
		// 시
		int hour = c.get(Calendar.HOUR);
		// 분
		int minute = c.get(Calendar.MINUTE);
		// 초
		int second = c.get(Calendar.SECOND);
		// 요일
		int day = c.get(Calendar.DAY_OF_WEEK);
		// 1 - 일요일 ~ 7 - 토요일
		System.out.println("요일  : " + day);
		// if, switch
		String[] dArr = 
			{"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("요일 : " + dArr[day]);
		*/
	}
}










