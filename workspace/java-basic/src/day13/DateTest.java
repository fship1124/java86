package day13;

import java.io.File;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
		// 현재 시간 정보를 반환
    	Date d = new Date();
		System.out.println(d);         // d.toString()이 자동호출됨
		
		int year = d.getYear() + 1900;
		System.out.println("year : " + year);
		
		// 시간 정보를 long으로 얻은 경우
		// 시간 정보를 추출할 경우 사용
		Date d2 = new Date(1000);   // 객체시간정보 롱값을 준 경우
		System.out.println(d2);
		
		long time = System.currentTimeMillis();
		System.out.println("time s: " + time);
		
		Date d3 = new Date(time);
		System.out.println(d3);
		
		File f = new File("data/a.txt");
		long l = f.lastModified();
		System.out.println("a.txt 파일의 마지막 수정 시간");
		System.out.println(new Date(1));
		
		//date의 시간정보를 long값으로 변환하여라
		long dTime = d.getTime();
		System.out.println("Date의 정보를 long : " + dTime); 
		
		// 날짜 정보를 지정된 long 값으로 변경
		d.setTime(10000);
		System.out.println(d);
		
	}
}
