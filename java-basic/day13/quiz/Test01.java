package day13.quiz;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		System.out.printf(
				"%d년 %d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int lastDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		// 줄넘김 처리 변수
		int nlCnt = 0;
		
		// 현재월 1일의 요일 구하기
		c.set(Calendar.DATE, 1);
		int cDay = c.get(Calendar.DAY_OF_WEEK);  // 1(일) - 7(토)
		
		// 현재월의 마지막 날짜의 요일 구하기
		c.set(Calendar.DATE, lastDate);
		int lastDay = c.get(Calendar.DAY_OF_WEEK);
		
		// 전달 날짜 정보를 출력하기 위한 부분 추가
		c.set(Calendar.MONTH, c.get(Calendar.MONTH) - 1);
		int beforeLastDate = 
				c.getActualMaximum(Calendar.DAY_OF_MONTH);
		int beforePrintDate = beforeLastDate - cDay + 2; 
		
		// 전달의 날짜 출력
		for (int i = 1; i < cDay; i++) {
			System.out.print(beforePrintDate++ + "\t");
			nlCnt++;
		}
		
		// 현재월의 날짜 출력
		for (int i = 1; i <= lastDate; i++) {
			System.out.print(
					i + (++nlCnt % 7 == 0 ? "\n" : "\t"));
		}
		
		// 다음달의 날짜 출력
		for (int i = 1; i <= 7 - lastDay; i++) {
			System.out.print(i + "\t");
		}
	}
}













