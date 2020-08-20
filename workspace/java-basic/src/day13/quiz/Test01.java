package day13.quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
    	Calendar c = Calendar.getInstance();
    	
    	System.out.printf("%d년 %d월\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1);
    	System.out.println("일\t월\t화\t수\t목\t금\t토");
    	
    	int lastDate = c.getMaximum(Calendar.DAY_OF_MONTH);
    	
    	// 줄넘김 처리 변수
    	int nlCnt = 0;
    	
    	// 현재월 1일의 요일 구하기
    	c.set(Calendar.DATE, 1);
    	int cDay = c.get(Calendar.DAY_OF_WEEK);        //1(일) - 7(토)
    	
    	// 현재월의 마지막 날짜의 요일 구하기
    	c.set(Calendar.DATE, lastDate);
    	int lastDay = c.getMaximum(Calendar.DAY_OF_MONTH);
    	
    	// 전달 날짜 정보를 출력하기 위한 부분 추가
    	c.set(Calendar.MONTH, c.get(Calendar.MONTH)-1);
    	int beforeLstDate = c.getActualMaximum(Calendar.DAY_OF_MONTH);
    	
    	int beforePrintDate = beforeLstDate - cDay + 2;
    	
    	// 전달의 날짜 출력
    	for (int i = 1 ; i < cDay; i++) {
    		System.out.print(beforePrintDate++ + "\t");
    		nlCnt++;
    	}
    	// 해당월의 날짜 출력
    	for (int i = 1; i <= lastDate; i++ ) {
    		System.out.print(i + (++nlCnt % 7 == 0 ? "\n" : "\t"));
    	}
    	
    	//다음달의 날짜 출력
    	for (int i = 1; i <= 7-lastDay; i++){
    	    System.out.print(i + "\t");
    	}
    	
    	/* 코딩1
    	int year = c.get(Calendar.YEAR);
    	int month = c.get(Calendar.MONTH)+1;
    	int val = c.getActualMaximum(Calendar.DATE);
    	
    	c.set(Calendar.DATE, 1);
    	int day = c.get(Calendar.DAY_OF_WEEK);
    	
    	
    	System.out.println(year + "년 " + month + "월 ");
    	System.out.println("일\t월\t화\t수\t목\t금\t토");
    	
    	
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
